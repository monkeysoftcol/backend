    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.dto;

import co.com.monkey.comunes.Mensajes;

/**
 *
 * @author dsalamanca
 */
public class MensajeDTO {

    private Mensajes codmensaje;
    private Object object;
    private String mensaje;
    private codigoRespuesta codigoRespuesta;
    
    public codigoRespuesta getCodigoRespuesta() {
        return codigoRespuesta;
    }

    public void setCodigoRespuesta(codigoRespuesta codigoRespuesta) {
        this.codigoRespuesta = codigoRespuesta;
    }
    

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Mensajes getCodmensaje() {
        return codmensaje;
    }

    public void setCodmensaje(Mensajes codmensaje) {
        this.codmensaje = codmensaje;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;

    }

    @Override
    public String toString() {
        return "MensajeDTO{" + "codmensaje=" + codmensaje + ", object=" + object + ", mensaje=" + mensaje + '}';
    }
    
    public enum codigoRespuesta {

        OK, ERROR
    }

}
