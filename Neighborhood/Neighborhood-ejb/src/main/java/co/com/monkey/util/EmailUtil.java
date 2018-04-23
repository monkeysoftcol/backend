/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.util;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ccepeda
 */
public final class EmailUtil {

    /**
     * Contructor
     */
    private EmailUtil() {
    }

    public static String plantillaNotificacionesHQ(String titulo, String fecha, String contenido) {
        String html = "<html>\n"
                + "    <head>\n"
                + "        <title>Notificaciones RUNT</title>\n"
                + "    </head>\n"
                + "    <body style=\"margin: 0px; padding: 0px; background-color: rgb(255, 255, 255);\"> <style type=\"text/css\"></style><div class=\"templateBoundary\" style=\"background-color: #FFFFFF;\" data-templatebackground=\"#FFFFFF\">\n"
                + "            <table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mainContainer\" style=\"margin: 0px; padding: 0px; border: 0px; width: 100% !important;\">\n"
                + "                <tbody>\n"
                + "                    <tr>\n"
                + "                        <td align=\"center\" valign=\"top\" style=\"background-color: #FFFFFF; width: 100%;\">\n"
                + "                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"600\" class=\"innerContainer\" style=\"margin: 0;padding: 0;width: 600px !important;background-color: #FFFFFF;\"> \n"
                + "                                <tbody>\n"
                + "                                    <tr>\n"
                + "                                        <td align=\"left\">\n"
                + "                                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"600\" class=\"bodyContainer\" style=\"margin: 0;padding: 0;width: 600px !important;\"> \n"
                + "                                                <tbody>\n"
                + "                                                    <tr>\n"
                + "                                                        <td>\n"
                + "                                                            <table width=\"100%\" cellspacing=\"0\" cellpadding=\"10\" border=\"0\" class=\"tobBlock\" style=\"background-color: #FFFFFF;\">\n"
                + "                                                                <tbody>\n"
                + "                                                                    <tr>\n"
                + "                                                                        <td valign=\"top\" style=\"padding:10px 20px;font-family: Arial,Helvetica,sans-serif;\" class=\"\">\n"
                + "                                                                            <div class=\"tobEditableHtml\" style=\"min-height:100px;\">\n"
                + "                                                                                <div style=\"font-family: Arial, Helvetica, sans-serif; color: #333333; font-size: 13px; line-height: normal; text-align: center;\"><font size=\"2\" style=\"text-size-adjust: none;\" face=\"Arial, Helvetica, sans-serif\">\n"
                + "                                                                                    <img border=\"0\" src=\"http://81494.asset.goto-9.net/web_public_shared/image/81494/imagen1.jpg\" title=\"\" alt=\"\" data-alignmenttype=\"auto\" style=\"line-height: normal; width: 100%; float: none; margin: 0px; display: inline; height: 135px;\" height=\"135\" width=\"560\"></font></div>\n"
                + "                                                                                <div style=\"line-height: normal; text-align: center;\">\n"
                + "                                                                                    <p class=\"MsoNormal\" align=\"center\" style=\"font-family: Arial, Helvetica, sans-serif; color: #333333; font-size: 13px; margin: 0.3em 0px 0.8em; padding: 0px; line-height: normal; text-size-adjust: none;\"><font size=\"2\" style=\"text-size-adjust: none;\" face=\"Arial, Helvetica, sans-serif\">\n"
                + "                                                                                        <b style=\"\">\n"
                + "                                                                                            <span style=\"color: #d0112b; text-size-adjust: none;\">{0}</span><br>\n"
                + "                                                                                            <span style=\"color: #d0112b; text-size-adjust: none;\">{1}</span>\n"
                + "                                                                                        </b>\n"
                + "\n"
                + "                                                                                    </p>\n"
                + "                                                                                    <p class=\"MsoNormal\" style=\"margin: 0.3em 0px 0.8em; text-align: justify; background-image: initial; background-position: initial; background-size: initial; background-repeat: initial; background-attachment: initial; background-origin: initial; background-clip: initial; text-size-adjust: none; padding: 0px; line-height: normal; font-family: Arial, Helvetica, sans-serif;\">\n"
                + "                                                                                        <br>\n"
                + "                                                                                        <font size=\"2\" style=\"text-size-adjust: none;\" face=\"Arial, Helvetica, sans-serif\" color=\"#0c0303\">\n"
                + "                                                                                            <span lang=\"ES\" style=\"text-size-adjust: none;\">{2}</span>\n"
                + "\n"
                + "                                                                                        </font>\n"
                + "                                                                                    <p class=\"MsoNormal\" style=\"margin: 0.3em 0px 0.8em; text-align: justify; background-image: initial; background-position: initial; background-size: initial; background-repeat: initial; background-attachment: initial; background-origin: initial; background-clip: initial; text-size-adjust: none; padding: 0px; line-height: normal; font-family: Arial, Helvetica, sans-serif;\">\n"
                + "                                                                                        <br>\n"
                + "                                                                                        <font style=\"text-size-adjust: none;\" size=\"2\" face=\"Arial, Helvetica, sans-serif\">\n"
                + "                                                                                        <span lang=\"ES\" style=\"text-size-adjust: none;\"><span style=\"text-size-adjust: none;\">\n"
                + "                                                                                                <font style=\"text-size-adjust: none;\" color=\"#0c0303\">\n"
                + "                                                                                                    <b style=\"\">Atentamente Sistema RUNT</b>\n"
                + "                                                                                                </font>\n"
                + "                                                                                            </span>\n"
                + "                                                                                        </span>\n"
                + "                                                                                        </font>\n"
                + "                                                                                    </p>\n"
                + "                                                                                </div>\n"
                + "                                                                                <div style=\"font-family: Arial, Helvetica, sans-serif; color: #333333; font-size: 13px; text-align: center;\">\n"
                + "                                                                                    <p class=\"MsoNormal\" style=\"color: #333333; font-family: Arial, Helvetica, sans-serif; font-size: 13px; line-height: normal; text-align: center; padding: 0px; margin: 0.3em 0px 0.8em; -webkit-text-size-adjust: none;\"><span style=\"line-height: 107%; -webkit-text-size-adjust: none; \" verdana\",\"sans-serif\";mso-bidi-font-family:verdana\"=\"\"><i><font size=\"2\" style=\"-webkit-text-size-adjust: none; \">Para cualquier información adicional favor comunicarse con nuestro centro de ayuda y servicios de apoyo línea nacional <a href=\"http://81494.track.goto-9.net/track/click?u=769496&amp;p=38313439343a3331363a3237353a303a323a30&amp;s=044c5149e149e141f3d83270303563c9&amp;m=4708\" style=\"-webkit-text-size-adjust: none;\">01 8000 93 00 60</a> o en Bogotá al 4232221</font></i></span></p><p class=\"MsoNormal\" style=\"color: #333333; font-family: Arial, Helvetica, sans-serif; font-size: 13px; line-height: normal; text-align: justify; padding: 0px; margin: 0.3em 0px 0.8em; -webkit-text-size-adjust: none;\"><span style=\"font-size: 10.5pt; line-height: 107%; -webkit-text-size-adjust: none; \" verdana\",\"sans-serif\";mso-bidi-font-family:verdana\"=\"\"></span></p><p class=\"MsoListParagraphCxSpLast\" style=\"color: #333333; font-family: Arial, Helvetica, sans-serif; font-size: 13px; line-height: normal; text-align: justify; text-indent: -18pt; padding: 0px; margin: 0.3em 0px 0.8em; -webkit-text-size-adjust: none;\"><img border=\"0\" src=\"http://81494.asset.goto-9.net/web_public_shared/image/81494/imagen2.jpg\" title=\"\" alt=\"\" data-alignmenttype=\"center\" style=\"width: 100%; float: none; margin: 0px auto; display: block; height: 107px;\" height=\"107\" width=\"560\"></p></div></div>\n"
                + "                                                                        </td>\n"
                + "                                                                    </tr>\n"
                + "                                                                </tbody>\n"
                + "                                                            </table>\n"
                + "                                                        </td>\n"
                + "                                                    </tr>\n"
                + "                                                </tbody>\n"
                + "                                            </table>\n"
                + "                                        </td>\n"
                + "                                    </tr>\n"
                + "                                </tbody>\n"
                + "                            </table>\n"
                + "                        </td>\n"
                + "                    </tr>\n"
                + "                </tbody>\n"
                + "            </table>\n"
                + "        </div>\n"
                + "    </body>\n"
                + "</html>";
        return MessageFormat.format(html, titulo, fecha, contenido);
    }

    /**
     * Actualización de la plantilla para notificaciones de correo electrónico
     *
     * @param titulo Titulo del correo
     * @param destinatario Nombre a quien va dirigido
     * @param contenido Contenido del texto a mostrar
     * @param footer Contenido al pie del correo, puede ser null
     * @param fecha Fecha en que se envía la notificación
     * @param lista Listado de textos a mostrar en componente
     * <ul><li>Ejemplo</li></ul> puede ser null
     * @return Contenido del email completo
     */
    public static String nuevoEmailHtml(final String titulo, final String destinatario, final String contenido, final String footer, final String fecha, final List<String> lista) {
        StringBuilder htmlList = new StringBuilder();
        if (lista != null && !lista.isEmpty()) {
            htmlList.append("<ul>");
            for (String valor : lista) {
                htmlList.append("<li class='lista_datos'><i>").append(valor).append("</i></li>");
            }
            htmlList.append("</ul>");
        }

        String html = "<style>\n"
                + "    .lista_datos{\n"
                + "        text-align:justify;\n"
                + "		font-family:ArialmHelvetica, sans-serif, serif, EmojiFont;\n"
                + "		color:#070101;\n"
                + "		font-size: 14;\n"
                + "		\n"
                + "    }\n"
                + "</style>\n"
                + "<div class=\"x_templateBoundary\" style=\"background-color:#FFFFFF\">\n"
                + "    <table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"x_mainContainer\" style=\"margin:0px; padding:0px; border:0px; width:100%!important\">\n"
                + "        <tbody>\n"
                + "            <tr>\n"
                + "                <td align=\"center\" valign=\"top\" style=\"background-color:#FFFFFF; width:100%\">\n"
                + "                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"600\" class=\"x_innerContainer\" style=\"margin:0; padding:0; width:600px!important; background-color:#FFFFFF\">\n"
                + "                        <tbody>\n"
                + "                            <tr>\n"
                + "                                <td align=\"left\">\n"
                + "                                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"600\" class=\"x_bodyContainer\" style=\"margin:0; padding:0; width:600px!important\">\n"
                + "                                        <tbody>\n"
                + "                                            <tr>\n"
                + "                                                <td>\n"
                + "                                                    <table width=\"100%\" cellspacing=\"0\" cellpadding=\"10\" border=\"0\" class=\"x_tobBlock\" style=\"background-color:#FFFFFF\">\n"
                + "                                                        <tbody>\n"
                + "                                                            <tr>\n"
                + "                                                                <td valign=\"top\" class=\"\" style=\"padding:10px 20px; font-family:Arial,Helvetica,sans-serif\">\n"
                + "                                                                    <div class=\"x_tobEditableHtml\" style=\"min-height: 100px; font-family: Arial, Helvetica, sans-serif, serif, EmojiFont;\">\n"
                + "                                                                        <div style=\"line-height:normal; text-align:center\"><span style=\"font-family: Arial, Helvetica, sans-serif, serif, EmojiFont; font-size: 13px; color: rgb(51, 51, 51); width: 100%;\"><img src=\"http://81494.asset.goto-9.net/web_public_shared/image/81494/imagen1.jpg\" border=\"0\" title=\"\" alt=\"\" height=\"135\" width=\"560\" style=\"line-height:normal; width:100%; float:none; margin:0px; display:inline; height:135px\"></span><b><font size=\"2\" face=\"Arial, Helvetica, sans-serif\" color=\"#000000\" style=\"font-family: Arial, Helvetica, sans-serif, serif, EmojiFont;\">" + titulo + "</font></b></div>\n"
                + "                                                                        <div style=\"line-height:normal; text-align:center\">\n"
                + "                                                                            <p class=\"x_Body\" style=\"text-align:justify; padding:0px; margin:0.3em 0px 0.8em; line-height:normal; font-family:Arial,Helvetica,sans-serif\">\n"
                + "                                                                                <font size=\"2\" face=\"Arial, Helvetica, sans-serif\" color=\"#070101\" style=\"font-family: Arial, Helvetica, sans-serif, serif, EmojiFont;\">\n"
                + "                                                                                    <b><span style=\"line-height:107%\">Bogotá " + fecha + "</span></b><br><br><br>\n"
                + "                                                                                    <b><span style=\"line-height:107%\">Señor@ : " + destinatario + " </span></b><br><br><br>\n"
                + "                                                                                    <span style=\"line-height:107%\">\n"
                + "                                                                                        " + contenido + "\n"
                + "                                                                                    </span>\n"
                + "                                                                                </font>\n"
                + "                                                                            </p>\n"
                + "                                                                            " + htmlList + "\n"
                + "                                                                            <p class=\"x_Body\" style=\"text-align:justify; padding:0px; margin:0.3em 0px 0.8em; line-height:normal; font-family:Arial,Helvetica,sans-serif\">\n"
                + "                                                                                <font size=\"2\" face=\"Arial, Helvetica, sans-serif\" color=\"#070101\" style=\"font-family: Arial, Helvetica, sans-serif, serif, EmojiFont;\">\n"
                + "                                                                                    <span style=\"line-height:107%\">\n"
                + "                                                                                       " + footer + "\n"
                + "                                                                                    </span>\n"
                + "                                                                                 </font>\n"
                + "                                                                             </p>\n"
                + "                                                                            <br>\n"
                + "                                                                        </div>\n"
                + "                                                                        <div style=\"font-family: Arial, Helvetica, sans-serif, serif, EmojiFont; font-size: 13px; color: rgb(51, 51, 51); text-align: center;\">\n"
                + "                                                                            <p class=\"x_MsoNormal\" style=\"color:#333333; font-family:Arial,Helvetica,sans-serif; font-size:13px; line-height:normal; text-align:center; padding:0px; margin:0.3em 0px 0.8em\">\n"
                + "                                                                                <span style=\"line-height: 107%; font-family: Arial, Helvetica, sans-serif, serif, EmojiFont;\"><i><font size=\"2\" style=\"\">Para cualquier información adicional favor comunicarse con nuestro centro de ayuda y servicios de apoyo línea nacional <a href=\"http://81494.track.goto-9.net/track/click?u=769496&amp;p=38313439343a3233353a3230363a303a343a30&amp;s=47b3fa73179b282fac26c3db30306ce7&amp;m=4708\" target=\"_blank\" rel=\"noopener noreferrer\" style=\"\">01 8000 93 00 60</a> o en Bogotá al 4232221</font></i></span></p>\n"
                + "                                                                            <p class=\"x_MsoNormal\" style=\"color:#333333; font-family:Arial,Helvetica,sans-serif; font-size:13px; line-height:normal; text-align:justify; padding:0px; margin:0.3em 0px 0.8em\">\n"
                + "                                                                                <span style=\"font-size: 10.5pt; line-height: 107%; font-family: Arial, Helvetica, sans-serif, serif, EmojiFont;\"></span></p>\n"
                + "                                                                            <p class=\"x_MsoListParagraphCxSpLast\" style=\"color:#333333; font-family:Arial,Helvetica,sans-serif; font-size:13px; line-height:normal; text-align:justify; text-indent:-18pt; padding:0px; margin:0.3em 0px 0.8em\">\n"
                + "                                                                                <img src=\"http://81494.asset.goto-9.net/web_public_shared/image/81494/imagen2.jpg\" border=\"0\" title=\"\" alt=\"\" height=\"107\" width=\"560\" style=\"width:100%; float:none; margin:0px auto; display:block; height:107px\"></p>\n"
                + "                                                                        </div>\n"
                + "                                                                    </div>\n"
                + "                                                                </td>\n"
                + "                                                            </tr>\n"
                + "                                                        </tbody>\n"
                + "                                                    </table>\n"
                + "                                                </td>\n"
                + "                                            </tr>\n"
                + "                                        </tbody>\n"
                + "                                    </table>\n"
                + "                                </td>\n"
                + "                            </tr>\n"
                + "                        </tbody>\n"
                + "                    </table>\n"
                + "                </td>\n"
                + "            </tr>\n"
                + "        </tbody>\n"
                + "    </table>\n"
                + "    <table id=\"x_unsubscribeBlock\" align=\"center\" cellspacing=\"0\" cellpadding=\"20\" border=\"0\" class=\"x_tobBlock\" style=\"width:600px; max-width:600px; margin:0 auto\">\n"
                + "        <tbody>\n"
                + "            <tr>\n"
                + "                <td align=\"left\" style=\"padding:20px 0\">\n"
                + "                    <table align=\"left\">\n"
                + "                        <tbody>\n"
                + "                            <tr>\n"
                + "                                <td style=\"padding:0; font-family:Arial,Helvetica,sans-serif; font-size:11px; color:#333333\">\n"
                + "                                    <span class=\"x_tobEditableText\" style=\"color: rgb(51, 51, 51); font-family: Arial, Helvetica, sans-serif, serif, EmojiFont;\">Agréganos a tu lista de contactos </span></td>\n"
                + "                            </tr>\n"
                + "                            <tr>\n"
                + "                                <td style=\"padding:0; font-family:Arial,Helvetica,sans-serif; font-size:11px; color:#333333\">\n"
                + "                                    <a href=\"http://81494.track.goto-9.net/track/click?u=vcard&amp;p=38313439343a3233353a3230363a303a353a30&amp;s=47b3fa73179b282fac26c3db30306ce7&amp;m=4708\" target=\"_blank\" rel=\"noopener noreferrer\" class=\"x_tobEditableText\" style=\"color:#333333\">Información de Contacto </a></td>\n"
                + "                            </tr>\n"
                + "                        </tbody>\n"
                + "                    </table>\n"
                + "                </td>\n"
                + "                <td align=\"right\" style=\"float:right; padding:20px 0\">\n"
                + "                    <table align=\"right\">\n"
                + "                        <tbody>\n"
                + "                            <tr>\n"
                + "                                <td style=\"padding:0; font-family:Arial,Helvetica,sans-serif; font-size:11px; color:#333333\">\n"
                + "                                    <span class=\"x_tobEditableText\" style=\"color: rgb(51, 51, 51); font-family: Arial, Helvetica, sans-serif, serif, EmojiFont;\">Para desuscribirse de nuestra lista haga </span><a href=\"http://81494.track.goto-9.net/member/publicunsubscribe?AdministratorID=81494&amp;MemberID=4708&amp;StatisticID=206&amp;CampaignID=235&amp;isDemo=0&amp;s=47b3fa73179b282fac26c3db30306ce7\" target=\"_blank\" rel=\"noopener noreferrer\" class=\"x_tobEditableText\" style=\"color:#333333\">Click Aquí </a></td>\n"
                + "                            </tr>\n"
                + "                            <tr>\n"
                + "                                <td align=\"right\" style=\"padding:0; font-family:Arial,Helvetica,sans-serif; font-size:11px; color:#333333\">\n"
                + "                                    <a href=\"http://81494.track.goto-9.net/member/publicunsubscribe?AdministratorID=81494&amp;MemberID=4708&amp;StatisticID=206&amp;CampaignID=235&amp;isDemo=0&amp;s=47b3fa73179b282fac26c3db30306ce7\" target=\"_blank\" rel=\"noopener noreferrer\" style=\"color:#333333\"><img src=\"http://81494.track.goto-9.net/img/es/unsubscribe-img.png\" border=\"0\" align=\"right\" width=\"136\" height=\"13\" style=\"width:136px; height:13px\"> </a></td>\n"
                + "                            </tr>\n"
                + "                        </tbody>\n"
                + "                    </table>\n"
                + "                </td>\n"
                + "            </tr>\n"
                + "        </tbody>\n"
                + "    </table>\n"
                + "</div>";

        return html;
    }

    /**
     * Función que permite crear el contenido de un email en formato HTML
     *
     * @param titulo Titulo del contenido del mensaje
     * @param destinatario Nombre de la persona o entidad a la que se envia el
     * mensaje
     * @param contenido Texto o cuerpo del mensaje
     * @return
     */
    public static String contenidoEmailHtml(final String titulo, final String destinatario, final String contenido) {
        return contenidoEmailHtml(titulo, destinatario, contenido, "");
    }

    /**
     * Función que permite crear el contenido de un email en formato HTML
     *
     * @param titulo Titulo del contenido del mensaje
     * @param destinatario Nombre de la persona o entidad a la que se envia el
     * mensaje
     * @param contenido Texto o cuerpo del mensaje
     * @param mensajeRespueta
     * @return
     */
    public static String contenidoEmailHtml(final String titulo, final String destinatario, final String contenido, final String mensajeRespueta) {
        String cont = "<tbody>\n"
                + "    <tr>\n"
                + "        <td style=\"background-color:#FFFFFF; width:100%\" align=\"center\" valign=\"top\">\n"
                + "            <table class=\"innerContainer\" style=\"margin:0; padding:0; width:600px!important; background-color:#FFFFFF\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"600\">\n"
                + "                <tbody>\n"
                + "                    <tr>\n"
                + "                        <td align=\"left\">\n"
                + "                            <table class=\"bodyContainer\" style=\"margin:0; padding:0; width:600px!important\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"600\">\n"
                + "                                <tbody>\n"
                + "                                    <tr>\n"
                + "                                        <td>\n"
                + "                                            <table class=\"tobBlock\" style=\"background-color:#FFFFFF\" border=\"0\" cellpadding=\"10\" cellspacing=\"0\" width=\"100%\">\n"
                + "                                                <tbody>\n"
                + "                                                    <tr>\n"
                + "                                                        <td class=\"\" style=\"padding:10px 20px; font-family:Arial,Helvetica,sans-serif\" valign=\"top\">\n"
                + "                                                            <div class=\"tobEditableHtml\" style=\"min-height:100px\">\n"
                + "                                                                <div style=\"color:#333333; font-size:13px; text-align:center\"><img src=\"https://drive.google.com/open?id=1pSTN8P0bAQaaRMITL1F7GkM-MkO4fwFy\" title=\"\" alt=\"\" style=\"line-height: normal; width: 100%; float: none; margin: 0px; display: inline; height: 135px; -moz-user-select: none;\" height=\"135\" border=\"0\" width=\"560\"></div>\n"
                + "                                                                <div style=\"color:#333333; text-align:center\"><b>" + titulo + "</b></div>\n"
                + "                                                                <div style=\"color:#333333; text-align:center\"><b><br>\n"
                + "                                                                    </b></div>\n"
                + "                                                                <div><b><font color=\"#333333\">Señor : " + destinatario + "</font></b></div>\n"
                + "                                                                <div style=\"color:#333333; font-size:13px; text-align:center\">\n"
                + "                                                                    <b style=\"line-height:normal\"><br></b>\n"
                + "                                                                </div>\n"
                + "                                                                <div style=\"color:#333333; text-align:center; font-size:13px; text-align:justify; padding:0px; margin:0.3em 0px 0.8em; font-family:Arial,Helvetica,sans-serif; line-height:normal\">\n"
                + "                                                                    <p class=\"MsoNormal\" style=\"\">\n"
                + "                                                                        <span style=\"font-size:10.5pt; line-height:107%; font-family:\">\n"
                + "                                                                            \n"
                + "                                                                            \n"
                + "                                                                            " + contenido + ""
                + "                                                                        \n"
                + "                                                                        </span>\n"
                + "                                                                    </p>\n"
                + "                                                                    <p>\n"
                + "                                                                        <span style=\"font-size:10.5pt; line-height:107%; font-family:\">\n"
                + "                                                                          <br>  Reciba un cordial saludo.\n"
                + "                                                                        </span>\n"
                + "                                                                    </p>\n"
                + "                                                                                                                   \n"
                + "                                                                    <!--fin contenido correo-->\n"
                + "                                                                    <p class=\"MsoNormal\" style=\"font-size:13px; text-align:justify; padding:0px; margin:0.3em 0px 0.8em; font-family:Arial,Helvetica,sans-serif; line-height:normal\">\n"
                + "                                                                        <span style=\"font-size:10.5pt; line-height:107%; font-family:\"><br>\n"
                + "                                                                        </span>\n"
                + "                                                                    </p>\n"
                + "                                                                    <p class=\"MsoNormal\" style=\"font-size:13px; text-align:justify; padding:0px; margin:0.3em 0px 0.8em; font-family:Arial,Helvetica,sans-serif; line-height:normal\">\n"
                + "                                                                        <span style=\"font-size:10.5pt; line-height:107%; font-family:\"><br>\n"
                + "                                                                        </span>\n"
                + "                                                                    </p>\n"
                + "\n"
                + "                                                                    <p class=\"MsoNormal\" style=\"text-align:center; padding:0px; margin:0.3em 0px 0.8em; font-family:Arial,Helvetica,sans-serif; line-height:normal\">\n"
                + "                                                                        <span style=\"line-height:107%\"><i><font size=\"2\">Para cualquier información adicional favor comunicarse con nuestro centro de ayuda y servicios de apoyo línea nacional 01 8000 93 00 60 o en Bogotá al 4232221</font></i></span></p>\n"
                + "                                                                    <p class=\"MsoNormal\" style=\"font-size:13px; text-align:justify; padding:0px; margin:0.3em 0px 0.8em; font-family:Arial,Helvetica,sans-serif; line-height:normal\">\n"
                + "                                                                        <span style=\"font-size:10.5pt; line-height:107%; font-family:\"></span></p>\n"
                + "                                                                    <p class=\"MsoListParagraphCxSpLast\" style=\"font-size:13px; text-align:justify; text-indent:-18pt; padding:0px; margin:0.3em 0px 0.8em; font-family:Arial,Helvetica,sans-serif; line-height:normal\">\n"
                + "                                                                        <img src=\"https://drive.google.com/open?id=1fVp33Q1QTOaWhx7gn5I94xj2FQtMRFr3\" title=\"\" alt=\"\" style=\"width: 100%; float: none; margin: 0px auto; display: block; height: 107px; -moz-user-select: none;\" height=\"107\" border=\"0\" width=\"560\"></p>\n"
                + "                                                                </div>\n"
                + "                                                            </div>\n"
                + "                                                        </td>\n"
                + "                                                    </tr>\n"
                + "                                                </tbody>\n"
                + "                                            </table>\n"
                + "                                        </td>\n"
                + "                                    </tr>\n"
                + "                                </tbody>\n"
                + "                            </table>\n"
                + "                        </td>\n"
                + "                    </tr>\n"
                + "                </tbody>\n"
                + "            </table>\n"
                + "        </td>\n"
                + "    </tr>\n"
                + "</tbody>";
        return cont;
    }

    /**
     * Metodo que permite crear el contenido de un email en formato HTML solo
     * con logo de RUNT
     *
     * @param titulo Titulo del contenido del mensaje
     * @param destinatario Nombre de la persona o entidad a la que se envia el
     * mensaje
     * @param contenido Texto o cuerpo del mensaje
     * @return
     */
    public static String contenidoEmailHtmlRunt(final String titulo, final String destinatario, final String contenido) {
//        InputStream headerMail = EmailUtil.class.getResourceAsStream("header_mail_runt.jpg");
//        String imagenHeader = "";
//        try {
//            imagenHeader = Base64.encodeBase64String(IOUtils.toByteArray(headerMail));
//        } catch (IOException ex) {
//            Logger.getLogger(EmailUtil.class.getName()).log(Level.SEVERE, null, ex);
//        }

        //Preproduccion
//        String imagenHeader = "http://190.254.17.42/runt/apppub/PortalCiudadano/img/header_mail_runt.jpg";
        //Produccion
        String imagenHeader = "http://www.runt.com.co/runt/apppub/PortalCiudadano/img/header_mail_runt.jpg";

        String cont = "<tbody>\n"
                + "    <tr>\n"
                + "        <td style=\"background-color:#FFFFFF; width:100%\" align=\"center\" valign=\"top\">\n"
                + "            <table class=\"innerContainer\" style=\"margin:0; padding:0; width:600px!important; background-color:#FFFFFF\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"600\">\n"
                + "                <tbody>\n"
                + "                    <tr>\n"
                + "                        <td align=\"left\">\n"
                + "                            <table class=\"bodyContainer\" style=\"margin:0; padding:0; width:600px!important\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"600\">\n"
                + "                                <tbody>\n"
                + "                                    <tr>\n"
                + "                                        <td>\n"
                + "                                            <table class=\"tobBlock\" style=\"background-color:#FFFFFF\" border=\"0\" cellpadding=\"10\" cellspacing=\"0\" width=\"100%\">\n"
                + "                                                <tbody>\n"
                + "                                                    <tr>\n"
                + "                                                        <td class=\"\" style=\"padding:10px 20px; font-family:Arial,Helvetica,sans-serif\" valign=\"top\">\n"
                + "                                                            <div class=\"tobEditableHtml\" style=\"min-height:100px\">\n"
                + "                                                                <div style=\"color:#333333; font-size:13px; text-align:center\"><img src=\"" + imagenHeader + "\" title=\"\" alt=\"\" style=\"line-height: normal; width: 100%; float: none; margin: 0px; display: inline; height: 135px; -moz-user-select: none;\" height=\"135\" border=\"0\" width=\"560\"></div>\n"
                + "                                                                <div style=\"color:#333333; text-align:center\"><b>" + titulo + "</b></div>\n"
                + "                                                                <div style=\"color:#333333; text-align:center\"><b><br>\n"
                + "                                                                    </b></div>\n"
                + "                                                                <div><b><font color=\"#333333\">Señor : " + destinatario + "</font></b></div>\n"
                + "                                                                <div style=\"color:#333333; font-size:13px; text-align:center\">\n"
                + "                                                                    <b style=\"line-height:normal\"><br></b>\n"
                + "                                                                </div>\n"
                + "                                                                <div style=\"color:#333333; text-align:center; font-size:13px; text-align:justify; padding:0px; margin:0.3em 0px 0.8em; font-family:Arial,Helvetica,sans-serif; line-height:normal\">\n"
                + "                                                                    <p class=\"MsoNormal\" style=\"\">\n"
                + "                                                                        <span style=\"font-size:10.5pt; line-height:107%; font-family:\">\n"
                + "                                                                            \n"
                + "                                                                            \n"
                + "                                                                            " + contenido + ""
                + "                                                                        \n"
                + "                                                                        </span>\n"
                + "                                                                    </p>\n"
                + "                                                                    <p>\n"
                + "                                                                        <span style=\"font-size:10.5pt; line-height:107%; font-family:\">\n"
                + "                                                                          <br>  Reciba un cordial saludo.\n"
                + "                                                                        </span>\n"
                + "                                                                    </p>\n"
                + "                                                                                                                   \n"
                + "                                                                    <!--fin contenido correo-->\n"
                + "                                                                    <p class=\"MsoNormal\" style=\"font-size:13px; text-align:justify; padding:0px; margin:0.3em 0px 0.8em; font-family:Arial,Helvetica,sans-serif; line-height:normal\">\n"
                + "                                                                        <span style=\"font-size:10.5pt; line-height:107%; font-family:\"><br>\n"
                + "                                                                        </span>\n"
                + "                                                                    </p>\n"
                + "                                                                    <p class=\"MsoNormal\" style=\"font-size:13px; text-align:justify; padding:0px; margin:0.3em 0px 0.8em; font-family:Arial,Helvetica,sans-serif; line-height:normal\">\n"
                + "                                                                        <span style=\"font-size:10.5pt; line-height:107%; font-family:\"><br>\n"
                + "                                                                        </span>\n"
                + "                                                                    </p>\n"
                + "\n"
                + "                                                                    <p class=\"MsoNormal\" style=\"text-align:center; padding:0px; margin:0.3em 0px 0.8em; font-family:Arial,Helvetica,sans-serif; line-height:normal\">\n"
                + "                                                                        <span style=\"line-height:107%\"><i><font size=\"2\">Para cualquier información adicional favor comunicarse con nuestro centro de ayuda y servicios de apoyo línea nacional 01 8000 93 00 60 o en Bogotá al 4232221</font></i></span></p>\n"
                + "                                                                    <p class=\"MsoNormal\" style=\"font-size:13px; text-align:justify; padding:0px; margin:0.3em 0px 0.8em; font-family:Arial,Helvetica,sans-serif; line-height:normal\">\n"
                + "                                                                        <span style=\"font-size:10.5pt; line-height:107%; font-family:\"></span></p>\n"
                + "                                                                    <p class=\"MsoListParagraphCxSpLast\" style=\"font-size:13px; text-align:justify; text-indent:-18pt; padding:0px; margin:0.3em 0px 0.8em; font-family:Arial,Helvetica,sans-serif; line-height:normal\">\n"
                + "                                                                        <img src=\"https://drive.google.com/open?id=1fVp33Q1QTOaWhx7gn5I94xj2FQtMRFr3\" title=\"\" alt=\"\" style=\"width: 100%; float: none; margin: 0px auto; display: block; height: 107px; -moz-user-select: none;\" height=\"107\" border=\"0\" width=\"560\"></p>\n"
                + "                                                                </div>\n"
                + "                                                            </div>\n"
                + "                                                        </td>\n"
                + "                                                    </tr>\n"
                + "                                                </tbody>\n"
                + "                                            </table>\n"
                + "                                        </td>\n"
                + "                                    </tr>\n"
                + "                                </tbody>\n"
                + "                            </table>\n"
                + "                        </td>\n"
                + "                    </tr>\n"
                + "                </tbody>\n"
                + "            </table>\n"
                + "        </td>\n"
                + "    </tr>\n"
                + "</tbody>";
        return cont;
    }

    public static String contenidoEmailHtmlOld(final String titulo, final String destinatario, final String contenido, final String mensajeRespueta) {
        String cont = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "    <head>\n"
                + "        <meta name=\"viewport\" content=\"width=device-width\" />\n"
                + "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n"
                + "        <title>Confirmación de Solicitudes</title>\n"
                + "\n"
                + "        <style type=\"text/css\">\n"
                + "            .contenido {\n"
                + "                font-family: \"Helvetica Neue\",Helvetica,Arial,sans-serif;\n"
                + "                font-size: 14px;\n"
                + "                line-height: 1.42857;\n"
                + "                color: #333;\n"
                + "                background-color: #FFF;\n"
                + "            }\n"
                + "        </style>\n"
                + "    </head>\n"
                + "    <body>\n"
                + "        <table class=\"body-wrap\">\n"
                + "            <tr>\n"
                + "                <td></td>\n"
                + "                <td class=\"container\" width=\"600\">\n"
                + "                    <div class=\"content\">\n"
                + "                        <table class=\"main\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n"
                + "                            <tr>\n"
                + "                                <td class=\"content-wrap\">\n"
                + "                                    <table  cellpadding=\"0\" cellspacing=\"0\">\n"
                + "                                        <tr>\n"
                + "                                            <td>\n"
                + "                                                <img class=\"img-responsive\" src=\"http://cdaservinortebarbosa.com/Public/Img/logo_runt.png\"/>\n"
                + "                                            </td>\n"
                + "                                        </tr>\n"
                + "                                        <tr>\n"
                + "                                            <td class=\"contenido\">\n"
                + "                                                <h3>" + titulo + "</h3><br>\n"
                + "                                            </td>\n"
                + "                                        </tr>\n"
                + "                                        <tr>\n"
                + "                                            <td class=\"contenido\" style=\"text-align:justify;\">\n"
                + "                                                Señor <strong>" + destinatario + "</strong><br></br>\n"
                + "                                                " + contenido + "\n"
                + "                                                <br></br> Reciba un cordial saludo.<br></br>\n"
                + "                                                Atentamente,</br>\n"
                + "                                            <a href=\"http://www.runt.com.co\" target=\"_blank\" style=\"color: #CB3320\">Concesión RUNT S.A</a>\n"
                + "\n"
                + "                                            </td>\n"
                + "                                        </tr>\n"
                + "                                        <tr>\n"
                + "                                            <td class=\"contenido\" style=\"text-align:justify;\">\n"
                + "                                                <br></br>\n"
                + "                                               " + mensajeRespueta + " \n"
                + "                                            </td>\n"
                + "                                        </tr>\n"
                + "                                    </table>\n"
                + "                                </td>\n"
                + "                            </tr>\n"
                + "                        </table>\n"
                + "                    </div>\n"
                + "                </td>\n"
                + "                <td></td>\n"
                + "            </tr>\n"
                + "        </table>\n"
                + "        <br></br><br></br>\n"
                + "    </body>\n"
                + "</html>\n"
                + "";
        return cont;
    }

    /**
     * @param titulo Titulo del contenido del mensaje
     * @param destinatario Nombre de la persona o entidad a la que se envia el
     * mensaje
     * @param contenido Texto o cuerpo del mensaje
     * @param listaHtml Lista de items en formato html a mostrar ejemplo:
     * <li>data</li><li>data2</li><li>data3</li><li>data4</li>
     * @return
     */
    public static String contenidoEmailHtmlLista(final String titulo, final String destinatario, final String contenido, final String listaHtml) {
        return contenidoEmailHtmlLista(titulo, destinatario, contenido, listaHtml, "");

    }

    /**
     * @param titulo Titulo del contenido del mensaje
     * @param destinatario Nombre de la persona o entidad a la que se envia el
     * mensaje
     * @param contenido Texto o cuerpo del mensaje
     * @param listaHtml Lista de items en formato html a mostrar ejemplo:
     * @param mensajeRespueta
     * @return
     */
    public static String contenidoEmailHtmlLista(final String titulo, final String destinatario, final String contenido, final String listaHtml, final String mensajeRespueta) {
        String cont = "<tbody>\n"
                + "    <tr>\n"
                + "        <td style=\"background-color:#FFFFFF; width:100%\" align=\"center\" valign=\"top\">\n"
                + "            <table class=\"innerContainer\" style=\"margin:0; padding:0; width:600px!important; background-color:#FFFFFF\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"600\">\n"
                + "                <tbody>\n"
                + "                    <tr>\n"
                + "                        <td align=\"left\">\n"
                + "                            <table class=\"bodyContainer\" style=\"margin:0; padding:0; width:600px!important\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"600\">\n"
                + "                                <tbody>\n"
                + "                                    <tr>\n"
                + "                                        <td>\n"
                + "                                            <table class=\"tobBlock\" style=\"background-color:#FFFFFF\" border=\"0\" cellpadding=\"10\" cellspacing=\"0\" width=\"100%\">\n"
                + "                                                <tbody>\n"
                + "                                                    <tr>\n"
                + "                                                        <td class=\"\" style=\"padding:10px 20px; font-family:Arial,Helvetica,sans-serif\" valign=\"top\">\n"
                + "                                                            <div class=\"tobEditableHtml\" style=\"min-height:100px\">\n"
                + "                                                                <div style=\"color:#333333; font-size:13px; text-align:center\"><img src=\"http://81494.track.tstes.net/web_public_shared/image/81494/imagen1.jpg\" title=\"\" alt=\"\" style=\"line-height: normal; width: 100%; float: none; margin: 0px; display: inline; height: 135px; -moz-user-select: none;\" height=\"135\" border=\"0\" width=\"560\"></div>\n"
                + "                                                                <div style=\"color:#333333; text-align:center\"><b>" + titulo + "</b></div>\n"
                + "                                                                <div style=\"color:#333333; text-align:center\"><b><br>\n"
                + "                                                                    </b></div>\n"
                + "                                                                <div><b><font color=\"#333333\">Señor : " + destinatario + "</font></b></div>\n"
                + "                                                                <div style=\"color:#333333; font-size:13px; text-align:center\">\n"
                + "                                                                    <b style=\"line-height:normal\"><br></b>\n"
                + "                                                                </div>\n"
                + "                                                                <div style=\"color:#333333; text-align:center; font-size:13px; text-align:justify; padding:0px; margin:0.3em 0px 0.8em; font-family:Arial,Helvetica,sans-serif; line-height:normal\">\n"
                + "                                                                    <p class=\"MsoNormal\" style=\"\">\n"
                + "                                                                        <span style=\"font-size:10.5pt; line-height:107%; font-family:\">\n"
                + "                                                                            \n"
                + "                                                                            \n"
                + "                                                                            " + contenido + ""
                + "                                                                        </span>\n"
                + "                                                                        <br></br>\n"
                + "                                                <ul>\n"
                + "                                                    " + listaHtml + "\n"
                + "                                                </ul>\n"
                + "                                                                    </p>\n"
                + "                                                                    <p>\n"
                + "                                                                        <span style=\"font-size:10.5pt; line-height:107%; font-family:\">\n"
                + "                                                                          <br>  Reciba un cordial saludo.\n"
                + "                                                                        </span>\n"
                + "                                                                    </p>\n"
                + "                                                                                                                   \n"
                + "                                                                    <!--fin contenido correo-->\n"
                + "                                                                    <p class=\"MsoNormal\" style=\"font-size:13px; text-align:justify; padding:0px; margin:0.3em 0px 0.8em; font-family:Arial,Helvetica,sans-serif; line-height:normal\">\n"
                + "                                                                        <span style=\"font-size:10.5pt; line-height:107%; font-family:\"><br>\n"
                + "                                                                        </span>\n"
                + "                                                                    </p>\n"
                + "                                                                    <p class=\"MsoNormal\" style=\"font-size:13px; text-align:justify; padding:0px; margin:0.3em 0px 0.8em; font-family:Arial,Helvetica,sans-serif; line-height:normal\">\n"
                + "                                                                        <span style=\"font-size:10.5pt; line-height:107%; font-family:\"><br>\n"
                + "                                                                        </span>\n"
                + "                                                                    </p>\n"
                + "\n"
                + "                                                                    <p class=\"MsoNormal\" style=\"text-align:center; padding:0px; margin:0.3em 0px 0.8em; font-family:Arial,Helvetica,sans-serif; line-height:normal\">\n"
                + "                                                                        <span style=\"line-height:107%\"><i><font size=\"2\">Para cualquier información adicional favor comunicarse con nuestro centro de ayuda y servicios de apoyo línea nacional 01 8000 93 00 60 o en Bogotá al 4232221</font></i></span></p>\n"
                + "                                                                    <p class=\"MsoNormal\" style=\"font-size:13px; text-align:justify; padding:0px; margin:0.3em 0px 0.8em; font-family:Arial,Helvetica,sans-serif; line-height:normal\">\n"
                + "                                                                        <span style=\"font-size:10.5pt; line-height:107%; font-family:\"></span></p>\n"
                + "                                                                    <p class=\"MsoListParagraphCxSpLast\" style=\"font-size:13px; text-align:justify; text-indent:-18pt; padding:0px; margin:0.3em 0px 0.8em; font-family:Arial,Helvetica,sans-serif; line-height:normal\">\n"
                + "                                                                        <img src=\"https://drive.google.com/open?id=1fVp33Q1QTOaWhx7gn5I94xj2FQtMRFr3\" title=\"\" alt=\"\" style=\"width: 100%; float: none; margin: 0px auto; display: block; height: 107px; -moz-user-select: none;\" height=\"107\" border=\"0\" width=\"560\"></p>\n"
                + "                                                                </div>\n"
                + "                                                            </div>\n"
                + "                                                        </td>\n"
                + "                                                    </tr>\n"
                + "                                                </tbody>\n"
                + "                                            </table>\n"
                + "                                        </td>\n"
                + "                                    </tr>\n"
                + "                                </tbody>\n"
                + "                            </table>\n"
                + "                        </td>\n"
                + "                    </tr>\n"
                + "                </tbody>\n"
                + "            </table>\n"
                + "        </td>\n"
                + "    </tr>\n"
                + "</tbody>";
        return cont;
    }

    /**
     * @param titulo Titulo del contenido del mensaje
     * @param destinatario Nombre de la persona o entidad a la que se envia el
     * mensaje
     * @param contenido Texto o cuerpo del mensaje
     * @param listaHtml Lista de items en formato html a mostrar ejemplo:
     * @param mensajeRespueta
     * @return
     */
    public static String contenidoEmailHtmlListaOld(final String titulo, final String destinatario, final String contenido, final String listaHtml, final String mensajeRespueta) {
        String cont = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "    <head>\n"
                + "        <meta name=\"viewport\" content=\"width=device-width\" />\n"
                + "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n"
                + "        <title>Confirmación de Solicitudes</title>\n"
                + "\n"
                + "        <style type=\"text/css\">\n"
                + "            .contenido {\n"
                + "                font-family: \"Helvetica Neue\",Helvetica,Arial,sans-serif;\n"
                + "                font-size: 14px;\n"
                + "                line-height: 1.42857;\n"
                + "                color: #333;\n"
                + "                background-color: #FFF;\n"
                + "            }\n"
                + "        </style>\n"
                + "    </head>\n"
                + "    <body>\n"
                + "        <table class=\"body-wrap\">\n"
                + "            <tr>\n"
                + "                <td></td>\n"
                + "                <td class=\"container\" width=\"600\">\n"
                + "                    <div class=\"content\">\n"
                + "                        <table class=\"main\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n"
                + "                            <tr>\n"
                + "                                <td class=\"content-wrap\">\n"
                + "                                    <table  cellpadding=\"0\" cellspacing=\"0\">\n"
                + "                                        <tr>\n"
                + "                                            <td>\n"
                + "                                                <img class=\"img-responsive\" src=\"http://cdaservinortebarbosa.com/Public/Img/logo_runt.png\"/>\n"
                + "                                            </td>\n"
                + "                                        </tr>\n"
                + "                                        <tr>\n"
                + "                                            <td class=\"contenido\">\n"
                + "                                                <h3>" + titulo + "</h3><br>\n"
                + "                                            </td>\n"
                + "                                        </tr>\n"
                + "                                        <tr>\n"
                + "                                            <td class=\"contenido\">\n"
                + "                                                Señor : <strong>" + destinatario + "</strong><br></br>\n"
                + "                                                " + contenido + ""
                + "                                                <br></br>\n"
                + "                                               \n"
                + "                                                <ul>\n"
                + "                                                    " + listaHtml + "\n"
                + "                                                </ul>\n"
                + "                                                <br></br>\n"
                + "                                                Atentamente,</br>\n"
                + "                                            <a href=\"http://www.runt.com.co\" target=\"_blank\" style=\"color: #CB3320\">Concesión RUNT S.A</a>\n"
                + "\n"
                + "                                            </td>\n"
                + "                                        </tr>\n"
                + "                                        <tr>\n"
                + "                                            <td class=\"contenido\" style=\"text-align:justify;\">\n"
                + "                                                <br></br>\n"
                + "                                               " + mensajeRespueta + " \n"
                + "                                            </td>\n"
                + "                                        </tr>\n"
                + "                                    </table>\n"
                + "                                </td>\n"
                + "                            </tr>\n"
                + "                        </table>\n"
                + "                    </div>\n"
                + "                </td>\n"
                + "                <td></td>\n"
                + "            </tr>\n"
                + "        </table>\n"
                + "        <br></br><br></br>\n"
                + "    </body>\n"
                + "</html>\n"
                + "";
        return cont;
    }

    /**
     * Prueba para armar el contenido de un email
     *
     * @param args
     */
    public static void main(String[] args) {

        String contenido = "Esta es la nueva plantilla para la notficación de correos electronico para Normalización y Postulación de vehículos de carga, debido a que la plantilla anterior(es) ya estan descontinuadas.";
        String footer = "Texto en el footer del Email. para continuar con el proceso, por favor debe pagar el valor del trámite.";
        List<String> lista = new ArrayList<>();
        lista.add("opcion 1");
        lista.add("opcion 2");
        lista.add("opcion 3");
        lista.add("opcion 4");
        String html = nuevoEmailHtml("PRUEBA PLANTILLA", "Carlos Javier Cepeda", contenido, footer, "09 de Agosto de 2017", lista);
        System.out.println(html);

    }
}
