/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.exception;

import co.com.monkey.dto.MensajeDTO;
import co.com.monkey.util.DateUtil;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

/**
 * 
 * @author CCEPEDA
 */
public class AutorizacionException {

    private static final int CODIGO_ERROR = 400;
    private static final long serialVersionUID = 1L;

    public AutorizacionException(final String mensaje, final HttpServletResponse response) {
        PrintWriter pw = null;
        try {
            response.setStatus(CODIGO_ERROR);
            response.setContentType(MediaType.APPLICATION_JSON);
            pw = response.getWriter();
            pw.print(new Gson().toJson(crearMensaje(mensaje)));
        } catch (IOException ex) {
            Logger.getLogger(AutorizacionException.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pw != null) {
                pw.close();
            }
        }

    }

    public AutorizacionException(final int codigoError, final String mensaje, final HttpServletResponse response) {
        PrintWriter pw = null;
        try {
            response.setStatus(codigoError);
            response.setContentType(MediaType.APPLICATION_JSON);
            pw = response.getWriter();
            pw.print(new Gson().toJson(crearMensaje(mensaje)));

        } catch (IOException ex) {
            Logger.getLogger(AutorizacionException.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pw != null) {
                pw.close();
            }
        }

    }

    public static MensajeDTO crearMensaje(final String mensaje) {
        final MensajeDTO msg = new MensajeDTO();
        msg.setCodigoRespuesta(MensajeDTO.CodigoRespuesta.ERROR);
        msg.setMensaje(mensaje);
        msg.setFecha(DateUtil.convertDateToString(new Date()));
        return msg;
    }

}
