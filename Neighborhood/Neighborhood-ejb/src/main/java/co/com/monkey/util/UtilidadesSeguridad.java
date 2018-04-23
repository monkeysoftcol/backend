/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.util;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author ccepeda
 * @author jquiroga
 */
public final class UtilidadesSeguridad {
    
    /**
     * Utilizado para descifrar llave
     */
    private final static String SECRET_KEY = "VlY5ordvlvKLhBnVAe3x";
    /**
     * Logger asociado
     */
    private static final Logger LOGGER = Logger.getLogger(UtilidadesSeguridad.class.getName());

    /**
     * Se encarga del proceso de desciframiento
     * @param textoEncriptado Texto cifrado
     * @return Texto descifrado
     */
    public final static String desencriptar(String textoEncriptado) {

        //llave para encriptar datos  
        String base64EncryptedString = "";

        try {
            byte[] message = Base64.decodeBase64(textoEncriptado.getBytes("utf-8"));
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(SECRET_KEY.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");

            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);

            byte[] plainText = decipher.doFinal(message);

            base64EncryptedString = new String(plainText, "UTF-8");

        } catch (UnsupportedEncodingException ex) {
            LOGGER.log(Level.SEVERE, "", ex);
        } catch (NoSuchAlgorithmException ex) {
            LOGGER.log(Level.SEVERE, "", ex);
        } catch (NoSuchPaddingException ex) {
            LOGGER.log(Level.SEVERE, "", ex);
        } catch (InvalidKeyException ex) {
            LOGGER.log(Level.SEVERE, "", ex);
        } catch (IllegalBlockSizeException ex) {
            LOGGER.log(Level.SEVERE, "", ex);
        } catch (BadPaddingException ex) {
            LOGGER.log(Level.SEVERE, "", ex);
        }
        return base64EncryptedString;
    }
    
    public static void main(String[] args){
        System.out.println(desencriptar("YI2b4uCPmvC76p+BIXHaCA=="));
    }
}
