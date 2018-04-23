/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.util;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author ccepeda
 */
public final class Global {

    private Global() {

    }

    private static final Logger LOG = Logger.getLogger(Global.class.getSimpleName());

    //Estas deben ir en la base de datos
    public static final String JWT_EXPIRATION_TOKEN = "86400000";
    public static final String JWT_LLAVE_SIMETRICA = "XKDJe15qSFnioERTijKoMg9a4W9hNpbhjYGlUJxS8zc=";

    public final static String JWT_MSJ_TOKEN_NO_HEADER = "JWT_NO_HEADER";
    public final static String JWT_MSJ_TOKEN_NO_BEARER = "JWT_NO_BEARER";

    public static final String X_HEIGBORHOOD_USER = "X_HEIGBORHOOD_USER";
    public static final String X_HEIGBORHOOD_RED = "X_HEIGBORHOOD_RED";

    /**
     * Permite obtener la dirección ip desde donde se está realizando el acceso a la funcionalidad
     * @param request
     * @return 
     */
    public static String getIpFromRequest(HttpServletRequest request) {
        String remoteAddr = request.getHeader("X-Forwarded-For");
        if (remoteAddr != null && remoteAddr.isEmpty()) {
            int pos = remoteAddr.indexOf(',');
            LOG.log(Level.INFO, "[NEIGHBORIP]={0}", remoteAddr);
            if (pos < 0) {
                return remoteAddr;
            }
            return remoteAddr.substring(0, pos); // if more then 1, take first one 
        }
        LOG.log(Level.INFO, "[NEIGHBORIP]={0}", remoteAddr);
        return request.getRemoteAddr();
    }
}
