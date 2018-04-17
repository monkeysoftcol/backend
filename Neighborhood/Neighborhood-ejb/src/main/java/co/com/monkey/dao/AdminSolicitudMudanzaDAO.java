/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.dao;

import co.com.monkey.comunes.CamposBusqueda;
import co.com.monkey.dao.util.GenericDAO;
import co.com.monkey.entities.AdminSolicitudMudanza;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 *
 * @author dsalamanca
 */
@Stateless
public class AdminSolicitudMudanzaDAO extends GenericDAO<AdminSolicitudMudanza>{
    
    private static final Logger LOGGER = Logger.getLogger(AdminSolicitudMudanzaDAO.class.getSimpleName());

    public AdminSolicitudMudanzaDAO() {
        super(AdminSolicitudMudanza.class);
    }
    
    /**
     * Metodo que enumera la cantidad de solicitudes de mudanza en estado pendientes
     * @param idConjunto
     * @return 
     */
    public Integer solicitudesPendientes (final Integer idConjunto){
        try {
            return Integer.parseInt(entityManager.createNamedQuery("AdminSolicitudMudanza.findCountPendientes")
                    .setParameter(CamposBusqueda.PARAMETRO_ID_CONJUNTO, idConjunto)
                    .getSingleResult().toString());
        } catch (NumberFormatException e) {
            LOGGER.log(Level.SEVERE, e.getLocalizedMessage());
        }
        return null;
    }
    
}
