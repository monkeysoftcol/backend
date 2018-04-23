/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.util;

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 *
 * @author ccepeda
 */
public final class MapingBoundle {

    private MapingBoundle() {

    }

    /**
     * Función que permite mapear un mensaje de un archivo properties con valores a reemplazar
     * @param pathProperties Path donde se encuentra el archivo properties. Ejm: co.com.runt.nameapp.mensajes
     * @param varriable Nombre de la varible a consultar dentro del properties. Ejm: VAR_SALUDO = Hola {0} como estas
     * @param argumentos Argumentos a castear. Ejem: "Desarrollador"
     * @return mensaje final. Ejemplo: Hola Desarrollador como estas
     */
    public static String mensaje(String pathProperties, String varriable, Object... argumentos) {
        ResourceBundle rb = ResourceBundle.getBundle(pathProperties);
        return MessageFormat.format(rb.getString(varriable), argumentos);
    }
}
