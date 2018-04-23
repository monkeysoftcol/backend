/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.util;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ccepeda
 */
public final class ExpresionRegularUtil {

    private ExpresionRegularUtil() {
    }

    private static final Logger LOG = Logger.getLogger(ExpresionRegularUtil.class.getSimpleName());
    private static final String NUMERO = "^[0-9]{0,15}$";
    private static final String MAIL = "^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,4})+$";
    private static final String IP = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    private static final String PASSWORD_dos = "/.*[A-Z].*.*[!-_/].*/";
    private static final String ALFANUMERICO = "^[0-9a-zA-Z]+$";
    private static final String ALFANUMERICO_SIMBOL = "^[0-9a-zA-Z\\s\\.\\,\\!\\¡\\¿\\?\\#\\°_-]+$";
    private static final String ALFANUMERICO_ESPACIO = "^[0-9a-zA-Z\\s]+$";
    private static final String PASSWORD = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,10}+$";
    private static final String DECIMAL = "^[0-9]+([.][0-9]{1,2})?$";

    /**
     * Función para validar si una cadena es un número
     *
     * @param data Cadena a validar
     * @return True si es un número, False en caso contrario
     */
    public static boolean validarNumero(final String data) {
        Pattern pat = Pattern.compile(NUMERO);
        Matcher mat = pat.matcher(data);
        return mat.matches();
    }

    /**
     * Función que permite validar si una cadena es un correo electrónico válido
     *
     * @param data Cadena a validar
     * @return True si es un correo válido, False en caso contrario
     */
    public static boolean validarEmail(final String data) {
        Pattern pat = Pattern.compile(MAIL);
        Matcher mat = pat.matcher(data);
        return mat.matches();
    }

    /**
     * Función que permite validar si una cadena es una dirección IP válido
     *
     * @param data Cadena a validar
     * @return True si es una dirección IP, False en caso contrario
     */
    public static boolean validarDireccionIP(final String data) {
        Pattern pat = Pattern.compile(IP);
        Matcher mat = pat.matcher(data);
        return mat.matches();
    }

    /**
     * Función que permite validar si una cadena es un número decimal con dos
     * decimales Ejm: 10.10
     *
     * @param data Cadena a validar
     * @return True si es un número decimal válido, False en caso contrario
     */
    public static boolean validarNumeroDecimal(final String data) {
        Pattern pat = Pattern.compile(DECIMAL);
        Matcher mat = pat.matcher(data);
        return mat.matches();
    }

    /**
     * Función que permite validar si una cadena tiene caracteres alfanúmericos
     * Ejm: A5S4aaaa
     *
     * @param data Cadena a validar
     * @return True si la cadena es alfanúmerico, False en caso contrario
     */
    public static boolean validarAlfaNumerico(final String data) {
        Pattern pat = Pattern.compile(ALFANUMERICO);
        Matcher mat = pat.matcher(data);
        return mat.matches();
    }
    
    /**
     * Función que permite validar si una cadena tiene caracteres alfanúmericos y tiene los siguientes simbolos incluido el espacio
     * .,!¡¿?#°_- Ejm: Av. Cell23 #10-85
     *
     * @param data Cadena a validar
     * @return True si la cadena es alfanúmerico, False en caso contrario
     */
    public static boolean validarAlfaNumericoSimbol(final String data) {
        Pattern pat = Pattern.compile(ALFANUMERICO_SIMBOL);
        Matcher mat = pat.matcher(data);
        return mat.matches();
    }
    
    /**
     * Función que permite validar si una cadena tiene caracteres alfanúmericos incluido el espacio
     * Ejm: AB155 55
     *
     * @param data Cadena a validar
     * @return True si la cadena es alfanúmerico, False en caso contrario
     */
    public static boolean validarAlfaNumericoEspacio(final String data) {
        Pattern pat = Pattern.compile(ALFANUMERICO_ESPACIO);
        Matcher mat = pat.matcher(data);
        return mat.matches();
    }
    
    /**
     * Función que permite validar si una cadena es una contraseña con las siguientes caracteristicas
     * Contiene una letra mayuscula
     * Contiene números
     * Contiene letras minusculas
     * Contiene caracteres especiales
     * Tamaño min 6 maximo 10 caracteres
     * Ejm: Aandc988*
     *
     * @param data Cadena a validar
     * @return True si la cadena es alfanúmerico, False en caso contrario
     */
    public static boolean validarPassword(final String data) {
        Pattern pat = Pattern.compile(PASSWORD);
        Matcher mat = pat.matcher(data);
        return mat.matches();
    }
    
    /**
     * Función para validar cualquier expresion regualar
     * @param data Dato a validar
     * @param pattern Expresion regular a validar
     * @return True si es un valor válido, False en caso contrario
     */
    public static boolean validarExpresion(final String data, final String pattern) {
        Pattern pat = Pattern.compile(pattern);
        Matcher mat = pat.matcher(data);
        return mat.matches();
    }

    /**
     * Pruebas de la funcionalidad de la utilidad
     * @param args 
     */
    public static void main(String[] args) {

        LOG.log(Level.INFO, "Validar Numero : {0}", validarNumero("8888"));
        LOG.log(Level.INFO, "Validar Email : {0}", validarEmail("carlos.cepeda@runt.com.co"));
        LOG.log(Level.INFO, "Validar IP : {0}", validarDireccionIP("10.1.1.0"));
        LOG.log(Level.INFO, "Validar Numero decimal : {0}", validarNumeroDecimal("188888888880.00"));
        LOG.log(Level.INFO, "Validar Alfanumerico : {0}", validarAlfaNumerico("A5S4aaaa"));
        LOG.log(Level.INFO, "Validar Alfanumerico Simbol : {0}", validarAlfaNumericoSimbol("Av. Cell23 #10-85"));
        LOG.log(Level.INFO, "Validar Alfanumerico Espacio : {0}", validarAlfaNumericoEspacio("AB155 55"));
        LOG.log(Level.INFO, "Validar Password : {0}", validarPassword("Aandc988*"));
        LOG.log(Level.INFO, "Validar generico, validar cadena no empieza con digito : {0}", validarExpresion("7Aandc988*","^[^\\\\d].*"));
    }

}
