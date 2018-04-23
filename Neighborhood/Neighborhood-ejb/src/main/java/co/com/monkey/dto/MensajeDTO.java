/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.dto;

/**
 *
 * @author dsalamanca
 */
public class MensajeDTO {

    private Object object;
    private String mensaje;
    private CodigoRespuesta codigoRespuesta;
    private String fecha;

    public enum CodigoRespuesta {
        OK, ERROR
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public CodigoRespuesta getCodigoRespuesta() {
        return codigoRespuesta;
    }

    public void setCodigoRespuesta(CodigoRespuesta codigoRespuesta) {
        this.codigoRespuesta = codigoRespuesta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
