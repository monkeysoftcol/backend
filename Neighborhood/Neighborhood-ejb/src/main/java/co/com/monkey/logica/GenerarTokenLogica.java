/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.logica;

import co.com.monkey.dto.MensajeDTO;
import co.com.monkey.util.DateUtil;
import co.com.monkey.util.Global;
import co.com.monkeysoft.dto.TokenJwtDTO;
import co.com.monkeysoft.exception.ErrorJWTException;
import co.com.monkeysoft.generador.ClienteJWT;
import co.com.monkeysoft.impl.ClienteJWTBuilder;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Lógica para la creación del token de autenticación
 *
 * @author ccepeda
 */
@Stateless
public class GenerarTokenLogica {

    private static final Logger LOGGER = Logger.getLogger(GenerarTokenLogica.class.getName());

    /**
     * Funcionalidad que permite generar el token de autorización a todos los
     * servicios de la red
     *
     * @param request
     * @return Response
     */
    public Response generar(HttpServletRequest request) {

        MensajeDTO mensaje = new MensajeDTO();

        String user = request.getHeader(Global.X_HEIGBORHOOD_USER);
        String red = request.getHeader(Global.X_HEIGBORHOOD_RED);
        String ip = Global.getIpFromRequest(request);

        if (user != null && red != null) {
            try {
                //Consultar usuario en base de datos =========PENDIENTE===========
                //Usuario usuario = usuarioDAO.consultarPorLogin(user);
                //if (usuario != null) {
                if (true) {
                    String expiration = Global.JWT_EXPIRATION_TOKEN;
                    if (expiration == null) {
                        expiration = "0";
                    }
                    TokenJwtDTO token = new TokenJwtDTO();
                    token.setExpiration(Long.valueOf(expiration));
                    token.setId(UUID.randomUUID().toString());
                    token.setIp(ip);
                    token.setIssuedAt(new Date());
                    token.setIssuer(user);
                    token.setRed(red);
                    token.setNotBefore(new Date());
                    token.setSubject("Carlos Cepeda");//token.setSubject(usuario.getUserNombre());

                    ClienteJWT clienteJwt = new ClienteJWTBuilder()
                            .setLlaveSimetrica(Global.JWT_LLAVE_SIMETRICA)
                            .setToken(token)
                            .build();

                    mensaje.setObject(clienteJwt.generarToken());
                    mensaje.setCodigoRespuesta(MensajeDTO.CodigoRespuesta.OK);
                }
            } catch (ErrorJWTException | NumberFormatException e) {
                LOGGER.log(Level.SEVERE, "Error generando token", e);
                mensaje.setCodigoRespuesta(MensajeDTO.CodigoRespuesta.ERROR);
            }
            mensaje.setFecha(DateUtil.convertDateToString(new Date()));
            return Response.ok(mensaje, MediaType.APPLICATION_JSON).build();
        } else {
            mensaje.setCodigoRespuesta(MensajeDTO.CodigoRespuesta.ERROR);
            return Response.status(Response.Status.UNAUTHORIZED).entity(mensaje).build();
        }
    }

}
