/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.util;

/**
 *
 * @author Ccepeda
 * @version 27-04-2015
 */
public final class CadenaUtil {

    /**
     * Constructor.
     */
    private CadenaUtil() {
    }

    /**
     * Función que permite validar si una letra existe en una determinada
     * posicion de un texto.
     *
     * @param texto Texto a validar.
     * @param letra Letra a buscar.
     * @param posicion Posición a validar la letra
     * @return True si la validación es exitosa, False en caso contrario.
     */
    public static boolean validarLetraTexto(
            final String texto,
            final String letra,
            final int posicion) {
        boolean respuesta = false;
        String parteCadena = texto.substring(0, posicion);
        if (letra.equals(parteCadena)) {
            respuesta = true;
        }
        return respuesta;
    }

    /**
     * Funcion que permite remplazar un valor dentro de una cadena
     * @param contenido String que contiene algun comodin
     * @param valold Valor del comodin
     * @param valnew Valor que reemplaza el comodin
     * @return String con comodin cambiado
     */
    public static String reemplazarCadena(final String contenido, final String valold, final String valnew) {
        String coint = contenido;
        String contenidoFinal;
        if (coint.contains(valold)) {
            contenidoFinal = coint.replace(valold, valnew);
            coint = contenidoFinal;
        }
        return coint;
    }
    
    public static String lpad(String input, int length, char padding) {
 
     if (input == null) {
         input = new String();
     }
 
     if (input.length() >= length) {
         return input;
     } else {
         StringBuilder result = new StringBuilder();
         int numChars = length - input.length();
         for (int i = 0; i < numChars; i++) {
             result.append(padding);
         }
         result.append(input);
         return result.toString();
     }
 }
}
