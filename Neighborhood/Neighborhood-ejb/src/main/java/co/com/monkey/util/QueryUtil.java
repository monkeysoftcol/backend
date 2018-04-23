/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.util;

import java.util.List;

/**
 *
 * @author ccepeda
 */
public final class QueryUtil {
    
    private QueryUtil(){}
    
    /**
     * Función que permite a partir de una lista<T> armar la cadena para el parametros IN de un sql nativo
     * @param <T> Cualquier Object, parametro generico
     * @param listaParametros Lista a procesar.
     * @return Datos separados por ,
     */
    public static <T> String armarParametrosIN(final List<T> listaParametros){
        StringBuilder cadena = new StringBuilder();
        int tam = listaParametros.size();
        int cont = 0;
        for (Object dato : listaParametros) {
            cadena.append("'").append(String.valueOf(dato)).append("'");
            if (cont < tam - 1) {
                cadena.append(",");
            }
            cont++;
        }
       return cadena.toString();
    }
}
