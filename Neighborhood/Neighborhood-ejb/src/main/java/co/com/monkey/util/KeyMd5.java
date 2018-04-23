/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author CCEPEDA
 */
public class KeyMd5 {

    private static final String SEMILLA ="m0nk3y";
    private static final char[] CONSTS_HEX = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String encriptaEnMD5(String stringAEncriptar) {
        try {
            StringBuilder pass = new StringBuilder();
            pass.append(stringAEncriptar).append(SEMILLA);
            MessageDigest msgd = MessageDigest.getInstance("MD5");
            byte[] bytes = msgd.digest(pass.toString().getBytes());
            StringBuilder strbCadenaMD5 = new StringBuilder(2 * bytes.length);
            for (int i = 0; i < bytes.length; i++) {
                int bajo = (int) (bytes[i] & 0x0f);
                int alto = (int) ((bytes[i] & 0xf0) >> 4);
                strbCadenaMD5.append(CONSTS_HEX[alto]);
                strbCadenaMD5.append(CONSTS_HEX[bajo]);
            }
            return strbCadenaMD5.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }
    
    /*public static void main(String args[])
    {
        System.out.println("\n\nEncriptacion en MD5 de 123: '"+encriptaEnMD5("admin")+"'");
        System.out.println("Encriptacion en MD5 de hola: '"+encriptaEnMD5("jbolano")+"'");
    }*/

}
