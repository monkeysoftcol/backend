/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.logica;

import co.com.monkey.comunes.Mensajes;
import co.com.monkey.dao.AdminSolicitudMudanzaDAO;
import co.com.monkey.dto.MensajeDTO;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author dsalamanca
 */
@Stateless
public class AdminMudanzaLogica {

    @EJB
    private AdminSolicitudMudanzaDAO adminSolicitudMudanzaDAO;

    /**
     *
     * @param idConjunto
     * @return
     */
    public MensajeDTO cantidadSolitudesMudanzaPendientes(final Integer idConjunto) {
        MensajeDTO salida = new MensajeDTO();
        Integer cantidadPendientes = adminSolicitudMudanzaDAO.solicitudesPendientes(idConjunto);
        salida.setCodmensaje(Mensajes.OK);
        salida.setObject(cantidadPendientes);
        return salida;
    }

}
