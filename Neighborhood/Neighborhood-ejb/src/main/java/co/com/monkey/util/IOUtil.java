/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daperador
 */
public class IOUtil {

    public static void closeResource(InputStream is){
        try {
            is.close();
        } catch (IOException ex) {
            //no requiere ninguna accion
        }
    }
    
    public static void closeResource(Writer writer){
        try {
            writer.close();
        } catch (IOException ex) {
            //no requiere ninguna accion
        }
    }
    
}
