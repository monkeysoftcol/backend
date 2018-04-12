/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.dao;

import co.com.monkey.dao.util.GenericDAO;
import co.com.monkey.entities.AdminSolicitudMudanza;
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
    
}
