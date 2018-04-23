/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.servicios;

import co.com.monkey.logica.GenerarTokenLogica;
import co.com.monkey.util.Global;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author ccepeda
 */
@Path("neighborSecurity")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Stateless
public class NeighborSecurity {
    
    private static final Logger LOG = Logger.getLogger(NeighborSecurity.class.getSimpleName());

    @EJB
    private GenerarTokenLogica generarTokenLogica;

    @Context
    HttpServletRequest request;

    @POST
    @Path("/obtainToken")
    public Response generarToken() {
        return generarTokenLogica.generar(request);
    }
}