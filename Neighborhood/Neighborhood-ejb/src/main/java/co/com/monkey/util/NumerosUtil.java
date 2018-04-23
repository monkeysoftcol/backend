/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que contiene utilidades con números.
 * @author Ccepeda
 * @version 28-04-2015
 */
public final class NumerosUtil {

    private NumerosUtil() {
    }

    private final static Logger LOGGER
            = Logger.getLogger(NumerosUtil.class.getName());

    /**
     * Función que permite convertir un String a BigDecimal.
     * @param numero Número en texto
     * @return Número en BigDecimal.
     */
    public static BigDecimal convertirStringToBigDecimal(final String numero) {
        BigDecimal bigDecimal = new BigDecimal(BigInteger.ZERO);
        try {
            bigDecimal = new BigDecimal(numero);
        } catch (UnsupportedOperationException e) {
            LOGGER.log(Level.SEVERE,
                    "Error el convertir el String a BigDecimal {0}", e);
        }
        return bigDecimal;
    }
}
