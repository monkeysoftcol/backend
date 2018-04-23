/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.servicios;

import co.com.monkey.dto.MensajeDTO;
import co.com.monkey.logica.AdminMudanzaLogica;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author dsalamanca
 */
@Path("/auth/adminmudanzas/")
@Stateless
public class AdminMudanzasServicio {
    
    @Context
    HttpServletRequest request;
    
    @EJB
    private AdminMudanzaLogica adminMudanzaLogica;
    
    @GET
    @Path("solicitudespendientes")
    @Produces(MediaType.APPLICATION_JSON)
    public MensajeDTO numeroSolicitudesPendientes (){
        return adminMudanzaLogica.cantidadSolitudesMudanzaPendientes(Integer.MIN_VALUE);
    }
    
    
    @GET
    @Path("test")
    @Produces(MediaType.APPLICATION_JSON)
    public Response servicioTest (){
        return Response.ok("===TEST DESDE EL WS CON SEGURIDAD OK", MediaType.TEXT_PLAIN).build();
    }
    
}
