/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.util;

/**
 *
 * @author ccepeda
 */
public final class HomologarUtil {

    private HomologarUtil() {

    }

    /**
     * Función que permite homologar los tipos de documentos
     * @param codigotdoc
     * @return 
     */
    public static String tipoDocumento(final String codigotdoc) {
        switch (codigotdoc) {
            case "C":
                return "Cédula Ciudadanía";
            case "N":
                return "NIT";
            case "X":
                return "Persona NN";
            case "P":
                return "Pasaporte";
            case "E":
                return "Cédula de Extranjería";
            case "T":
                return "Tarjeta de Identidad ";
            case "U":
                return "Registro Civil";
            case "D":
                return "Carnet Diplomático ";
            case "S":
                return "Sin Registro";
            default:
                return "";
        }
    }
    
    /**
     * Función que permite homologar los tipos de documentos
     * @param codigotdoc
     * @return 
     */
    public static String tipoDocumentoIniciales(final String codigotdoc) {
        switch (codigotdoc) {
            case "C":
                return "CC";
            case "N":
                return "NIT";
            case "X":
                return "NN";
            case "P":
                return "P";
            case "E":
                return "CE";
            case "T":
                return "TI";
            case "U":
                return "RC";
            case "D":
                return "CD";
            case "S":
                return "SN";
            default:
                return "";
        }
    }
    
    /**
     * Función que permite homologar el genero
     * @param genero
     * @return 
     */
    public static String genero(final String genero) {
        switch (genero) {
            case "M":
                return "Masculino";
            case "F":
                return "Femenino";
            default:
                return "";
        }
    }
}
