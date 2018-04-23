/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.filtro;

import co.com.monkey.exception.AutorizacionException;
import co.com.monkey.util.Global;
import co.com.monkeysoft.exception.ErrorJWTException;
import co.com.monkeysoft.generador.ClienteJWT;
import co.com.monkeysoft.impl.ClienteJWTBuilder;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;

/**
 *
 * @author CCEPEDA
 */
@WebFilter(filterName = "filtroJWT", urlPatterns = {"/webresources/auth/*"})
public class FiltroJWT implements Filter {

    private final static Logger LOGGER = Logger.getLogger(FiltroJWT.class.getName());

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //nothing to do
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String token = getToken((HttpServletRequest) request, (HttpServletResponse) response);
        if (token == null) {
            return;
        }
        String user = ((HttpServletRequest) request).getHeader(Global.X_HEIGBORHOOD_USER);
        String red = ((HttpServletRequest) request).getHeader(Global.X_HEIGBORHOOD_RED);

        //Se valida que la info del usuario venga en los encabezados
        if (user == null || "".equals(user)) {
            new AutorizacionException("No se encuentra el parámetro usuario en la peticion", (HttpServletResponse) response);
            return;
        }
        if (red == null || "".equals(red)) {
            new AutorizacionException("No se detecta el parámetro de la red social asociada al usuario, en la petición de los servicios", (HttpServletResponse) response);
            return;
        }

        //Se consulta la exitencia del usuario en base de datos //COUNT
        Integer cantidad = 1;//usuarioDAO.consultarPorLogin(user);
        if (true) {
            //cantidad =redDao.validarPotId(red, user); //buscar la autoridad por el id y el usuario, para validar que está accediendo a la red a la que esta inscrito
            if (cantidad != null && cantidad > 0) {
                try {
                    ClienteJWT clienteJWT = new ClienteJWTBuilder().setLlaveSimetrica(Global.JWT_LLAVE_SIMETRICA).build();
                    clienteJWT.validarToken(token, Global.JWT_LLAVE_SIMETRICA);
                    chain.doFilter(request, response);
                } catch (ErrorJWTException | IOException | ServletException e) {
                    new AutorizacionException(
                            Response.Status.UNAUTHORIZED.getStatusCode(), "Token no valido para realizar consultas",
                            (HttpServletResponse) response);
                    return;
                }
            } else {
                //error de ip retorna un codigo de error http 401
                new AutorizacionException(401, "La red a la que intenta acceder el usuario no esta autorizada", (HttpServletResponse) response);
                return;
            }
        } else {
            LOGGER.info("No se econtro informacion del usuario registrada en el sistema");
            new AutorizacionException("El usuario que esta intentando realizar la consulta no esta registrado en el sistema", (HttpServletResponse) response);
            return;
        }
    }

    @Override
    public void destroy() {
        //nothing to do
    }

    private String getToken(HttpServletRequest httpRequest, HttpServletResponse response) throws ServletException {
        String token = null;
        final String authorizationHeader = httpRequest.getHeader("authorization");
        if (authorizationHeader == null) {
            new AutorizacionException(Response.Status.UNAUTHORIZED.getStatusCode(), Global.JWT_MSJ_TOKEN_NO_HEADER, response);
            return null;
        }

        String[] parts = authorizationHeader.split(" ");
        if (parts.length != 2) {
            new AutorizacionException(Response.Status.UNAUTHORIZED.getStatusCode(), Global.JWT_MSJ_TOKEN_NO_BEARER, response);
            return null;
        }

        String scheme = parts[0];
        String credentials = parts[1];

        Pattern pattern = Pattern.compile("^Bearer$", Pattern.CASE_INSENSITIVE);
        if (pattern.matcher(scheme).matches()) {
            token = credentials;
        }
        return token;
    }

}
