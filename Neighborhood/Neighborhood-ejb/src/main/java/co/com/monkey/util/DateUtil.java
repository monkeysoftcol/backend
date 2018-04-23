/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ccepeda
 * @version 21-01-2014
 */
public final class DateUtil {

    /**
     * Date Util.
     */
    private DateUtil() {
    }

    /**
     * Función que sirve para castear un string a Date 12/31/2014 to 31/12/2014.
     *
     * @param fecha String que contiene la fecha.
     * @return Date
     */
    public static Date convertStringToDate(final String fecha) {
        String fechaP = fecha.replaceAll("/", "");
        String mes = fechaP.substring(0, 2);
        String dia = fechaP.substring(2, 4);
        String anio = fechaP.substring(4, 8);
        StringBuilder fechaF = new StringBuilder();
        fechaF.append(dia).append("/").append(mes).append("/").append(anio);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ROOT);
        Date date = null;
        try {
            date = formatter.parse(fechaF.toString());
        } catch (ParseException e) {
            Logger.getLogger(DateUtil.class.getName())
                    .log(Level.INFO, "Error al castear la fecha");
        }
        return date;
    }

    /**
     * Función que sirve para castear un string dd/mm/yyy a Date.
     *
     * @param fecha String que contiene la fecha.
     * @return Date
     */
    public static Date convertStringToDateFechaNormal(final String fecha) {
        String fechaP = fecha.replaceAll("/", "");
        String dia = fechaP.substring(0, 2);
        String mes = fechaP.substring(2, 4);
        String anio = fechaP.substring(4, 8);
        StringBuilder fechaF = new StringBuilder();
        fechaF.append(dia).append("/").append(mes).append("/").append(anio);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ROOT);
        Date date = null;
        try {
            date = formatter.parse(fechaF.toString());
        } catch (ParseException e) {
            Logger.getLogger(DateUtil.class.getName())
                    .log(Level.INFO, "Error al castear la fecha");
        }
        return date;
    }

    /**
     * Función que permite castear un String a Date en el sigueinte formato: 20151231 to 31/12/2015
     *
     * @param fecha
     * @return
     */
    public static Date convertStringToDateFormat(final String fecha) {

        String dia = fecha.substring(6, 8);
        String mes = fecha.substring(4, 6);
        String anio = fecha.substring(0, 4);
        StringBuilder fechaF = new StringBuilder();
        fechaF.append(dia).append("/").append(mes).append("/").append(anio);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ROOT);
        Date date = null;
        try {
            date = formatter.parse(fechaF.toString());
        } catch (ParseException e) {
            Logger.getLogger(DateUtil.class.getName())
                    .log(Level.INFO, "Error al castear la fecha");
        }
        return date;
    }

    /**
     * Función que permite castear un String a Date en el sigueinte formato: 10082015 ddMMyyyy to dd/MM/yyyy
     *
     * @param fecha
     * @return
     */
    public static Date convertStringToDateFormatThree(final String fecha) {

        String dia = fecha.substring(0, 2);
        String mes = fecha.substring(2, 4);
        String anio = fecha.substring(4, 8);
        StringBuilder fechaF = new StringBuilder();
        fechaF.append(dia).append("/").append(mes).append("/").append(anio);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ROOT);
        Date date = null;
        try {
            date = formatter.parse(fechaF.toString());
        } catch (ParseException e) {
            Logger.getLogger(DateUtil.class.getName())
                    .log(Level.INFO, "Error al castear la fecha");
        }
        return date;
    }

    /**
     * Función que permite castear un String a Date en el sigueinte formato: 10082015 ddMMyyyy to dd/MM/yyyy
     *
     * @param fecha
     * @return
     */
    public static String convertStringToDateFormatThreeString(final String fecha) {
        String dia = fecha.substring(0, 2);
        String mes = fecha.substring(2, 4);
        String anio = fecha.substring(4, 8);
        StringBuilder fechaF = new StringBuilder();
        fechaF.append(dia).append("/").append(mes).append("/").append(anio);
        return fechaF.toString();
    }

    /**
     * Función que convierte un Date a String en formato dd/mm/yyyy
     *
     * @param fecha
     * @return
     */
    public static String convertDateToString(Date fecha) {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        StringBuilder fechaString = new StringBuilder();
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        int mes = calendar.get(Calendar.MONTH) + 1;
        if (dia < 10) {
            fechaString.append("0").append(dia).append("/");
        } else {
            fechaString.append(dia).append("/");
        }
        if (mes < 10) {
            fechaString.append("0").append(mes).append("/");
        } else {
            fechaString.append(mes).append("/");
        }
        fechaString.append(String.valueOf(calendar.get(Calendar.YEAR)));
        return fechaString.toString();
    }
    
    /**
     * Función que convierte un Date a String en formato dd/mm/yy
     *
     * @param fecha
     * @return
     */
    public static String convertDateToStringRecorteAnio(Date fecha) {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        StringBuilder fechaString = new StringBuilder();
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        int mes = calendar.get(Calendar.MONTH) + 1;
        if (dia < 10) {
            fechaString.append("0").append(dia).append("/");
        } else {
            fechaString.append(dia).append("/");
        }
        if (mes < 10) {
            fechaString.append("0").append(mes).append("/");
        } else {
            fechaString.append(mes).append("/");
        }
        fechaString.append(String.valueOf(calendar.get(Calendar.YEAR)).substring(2, 4));
        return fechaString.toString();
    }

    /**
     * Función que convierte un Date a String en formato dd/mm/yyyy
     *
     * @param fecha Fecha a procesar
     * @return Fecha modificada
     */
    public static Date changeFormatDate(final Date fecha) {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        StringBuilder fechaString = new StringBuilder();
        fechaString.append(String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)))
                .append("/")
                .append(String.valueOf(calendar.get(Calendar.MONTH) + 1))
                .append("/")
                .append(String.valueOf(calendar.get(Calendar.YEAR)));
        SimpleDateFormat formatter
                = new SimpleDateFormat("dd/MM/yy", Locale.ROOT);
        Date date = null;
        try {
            date = formatter.parse(fechaString.toString());
        } catch (ParseException e) {
            Logger.getLogger(DateUtil.class.getName())
                    .log(Level.INFO, "Error al castear la fecha");
        }
        return date;
    }

    /**
     * Función que permite comparar dos fechas.
     *
     * @param date1 Fecha 1
     * @param date2 Fecha 2
     * @return True si son iguales, false en caso contrario.
     *
     * public static boolean compararFechas( Date date1, Date date2) { boolean iguales = false; try { Calendar c1 = Calendar.getInstance(); c1.setTime(date1); String f1 = c1.get(Calendar.DAY_OF_WEEK)
     * + "/" + (c1.get(Calendar.MONTH) + 1) + "/" + c1.get(Calendar.YEAR);
     *
     * Calendar c2 = Calendar.getInstance(); c2.setTime(date2); String f2 = c2.get(Calendar.DAY_OF_WEEK) + "/" + (c2.get(Calendar.MONTH) + 1) + "/" + c2.get(Calendar.YEAR);
     *
     * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ROOT); date1 = sdf.parse(f1); date2 = sdf.parse(f2);
     *
     * sdf.format(date1); sdf.format(date2);
     *
     * if (date1.compareTo(date2) == 0) { iguales = true; } } catch (ParseException ex) { Logger.getLogger(DateUtil.class.getName()) .log(Level.INFO, "Error al castear la fecha"); } return iguales; }
     */
    /**
     * Función que sirve para castear un string a Date.
     *
     * @param fecha String que contiene la fecha.
     * @return Date
     */
    public static Date convertStringToDateBD(final String fecha) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ROOT);
        Date date = null;
        try {
            date = formatter.parse(fecha);
        } catch (ParseException e) {
            Logger.getLogger(DateUtil.class.getName())
                    .log(Level.INFO, "Error al castear la fecha");
        }
        return date;
    }

    /**
     * Función que permite castear una fecha que se obtiene de base de datos 1955-01-27 dd/MM/yyyy.
     *
     * @param obj Objeto que contiene la fecha
     * @return Fecha con el nuevo formato
     */
    public static Date convertBDFechatoDosDate(final String obj) {
        String fec = obj.substring(0, 10);
        fec = fec.replace("-", "");
        StringBuilder fechaFin = new StringBuilder();
        fechaFin.append(fec.substring(6, 8)).append("/").append(fec.substring(4, 6)).append("/").append(fec.substring(0, 4));
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.ROOT);
        Date createdDate = null;
        try {
            createdDate = df.parse(fechaFin.toString());
        } catch (ParseException e) {
            Logger.getLogger(DateUtil.class.getName())
                    .log(Level.INFO, "Error al castear la fecha");
        }
        return createdDate;
    }

    /**
     * Función que permite castear una fecha que se obtiene de base de datos.
     *
     * @param obj Objeto que contiene la fecha
     * @return Fecha con el nuevo formato
     */
    public static Date convertBDFechatoDate(final Object obj) {
        String fecha = obj.toString();
        String fec = fecha.replace("-", "");
        fec = fec.substring(0, 8);
        StringBuilder fechaFin = new StringBuilder();
        fechaFin.append(fec.substring(6, 8)).append("/").append(fec.substring(4, 6)).append("/").append(fec.substring(0, 4));
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.ROOT);
        Date createdDate = null;
        try {
            createdDate = df.parse(fechaFin.toString());
        } catch (ParseException e) {
            Logger.getLogger(DateUtil.class.getName())
                    .log(Level.INFO, "Error al castear la fecha");
        }
        return createdDate;
    }

    /**
     * Función que permite retornar el primer día de un mes.
     *
     * @param date Fecha a consultar
     * @return Fecha, primer dia del mes.
     */
    public static Date getPrimerDiaDelMes(final Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.getActualMinimum(Calendar.DAY_OF_MONTH),
                cal.getMinimum(Calendar.HOUR_OF_DAY),
                cal.getMinimum(Calendar.MINUTE),
                cal.getMinimum(Calendar.SECOND));
        return cal.getTime();
    }

    /**
     * Función que permite retornar el último día de un mes.
     *
     * @param date Fecha a consultar
     * @return Fecha, último dia del mes.
     */
    public static Date getUltimoDiaDelMes(final Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.getActualMaximum(Calendar.DAY_OF_MONTH),
                cal.getMaximum(Calendar.HOUR_OF_DAY),
                cal.getMaximum(Calendar.MINUTE),
                cal.getMaximum(Calendar.SECOND));
        return cal.getTime();
    }

    /**
     * Función que permite castear un String a Date en el sigueinte formato: MMddyyyy to dd/MM/yyyy, ejemplo 12312015 to 31/12/2015
     *
     * @param fecha Fecha a transformar
     * @return Date
     */
    public static Date convertStringToDateFormatTwo(final String fecha) {
        String dia = fecha.substring(2, 4);
        String mes = fecha.substring(0, 2);
        String anio = fecha.substring(4, 8);
        StringBuilder fechaF = new StringBuilder();
        fechaF.append(dia).append("/").append(mes).append("/").append(anio);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ROOT);
        Date date = null;
        try {
            date = formatter.parse(fechaF.toString());
        } catch (ParseException e) {
            Logger.getLogger(DateUtil.class.getName())
                    .log(Level.INFO, "Error al castear la fecha");
        }
        return date;
    }

    /**
     * Función que sirve para poner la hora 00:00:00 a una fecha.
     *
     * @param date Date a modificar
     * @return Date modifacada
     */
    public static Date getDateWithoutTime(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    /**
     * Función que permite castear un String a Date en el sigueinte formato: MMddyyyy to dd/MM/yyyy, ejemplo 12312015 to 31/12/2015
     *
     * @param fecha Fecha a transformar
     * @return Date
     */
    public static String convertStringToDateFormatTree(final String fecha) {
        String dia = fecha.substring(2, 4);
        String mes = fecha.substring(0, 2);
        String anio = fecha.substring(4, 8);
        StringBuilder fechaF = new StringBuilder();
        fechaF.append(dia).append("/").append(mes).append("/").append(anio);
        return fechaF.toString();
    }

    /**
     * Función que permite transformar un Date a String en formato yyyyMMdd
     *
     * @param date Fecha a convertir en String
     * @return Fecha casteada en formato String
     */
    public static String convertDateToStringFormatoyyyyMMdd(Date date) {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        int mes = calendar.get(Calendar.MONTH) + 1;
        StringBuilder fechaString = new StringBuilder();
        fechaString.append(String.valueOf(calendar.get(Calendar.YEAR)));
        if (mes < 10) {
            fechaString.append("0").append(mes);
        } else {
            fechaString.append(mes);
        }
        if (dia < 10) {
            fechaString.append("0").append(dia);
        } else {
            fechaString.append(dia);
        }
        return fechaString.toString();
    }

    /**
     * Suma o resta dias a una fecha.
     *
     * @param fecha
     * @param dias
     * @return
     */
    public static Date sumarRestarDiasFecha(final Date fecha, final int dias) {

        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha); // Configuramos la fecha que se recibe
        calendar.add(Calendar.DAY_OF_YEAR, dias);  // numero de días a añadir, o restar en caso de días<0
        return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos	
    }
    
    /**
     * Permite convertir un string dd/mm/yyyy en Calendar
     * @param fecha
     * @return Calendar
     */
    public static Calendar convertStrintToCalendar(final String fecha){
        try {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Calendar cal  = Calendar.getInstance();
            cal.setTime(df.parse(fecha));
            return cal;
        } catch (ParseException ex) {
            Logger.getLogger(DateUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public static Long diasDiferencia(Calendar fechaMayor, Calendar fechaMenor){
        Long diferenciaEn_ms = fechaMayor.getTimeInMillis()-fechaMenor.getTimeInMillis();
        Long dias = diferenciaEn_ms / (1000 * 60 * 60 * 24);
        return dias;
    }
}
