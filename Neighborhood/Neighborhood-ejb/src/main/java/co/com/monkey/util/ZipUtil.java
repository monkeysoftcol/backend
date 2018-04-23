/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

/**
 *
 * @author ccepeda
 */
public class ZipUtil {

    public static void main(String[] args) throws IOException, ZipException {
        String pathFolder = "C:\\Aplicaciones\\Huellas";
        File dir = new File(pathFolder);
        String[] ficheros = dir.list();
        if (ficheros == null) {
            System.out.println("No hay ficheros en el directorio especificado");
        } else {
            for (int x = 0; x < ficheros.length; x++) {
                System.out.println(pathFolder + "\\" + ficheros[x]);
                comprimirZip("runtticket.zip", pathFolder + "\\" + ficheros[x]);
            }
        }

    }

    public static String comprimirZip(
            final String nombreArchZip,
            final String pathArchivoComprimir) throws IOException, ZipException {
        String archivoZip = System.getProperty("java.io.tmpdir") + nombreArchZip;
        ZipFile zipFile = new ZipFile(archivoZip);
        ArrayList filesToAdd = new ArrayList();
        filesToAdd.add(new File(pathArchivoComprimir));
        ZipParameters parameters = new ZipParameters();
        parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
        parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
        parameters.setEncryptFiles(false);
        zipFile.addFiles(filesToAdd, parameters);
        System.out.println(archivoZip);
        return archivoZip;
    }

    public static String comprimirZip(
            final String nombreArchZip,
            final File archivo) throws IOException, ZipException {
        String archivoZip = System.getProperty("java.io.tmpdir") + nombreArchZip;
        ZipFile zipFile = new ZipFile(archivoZip);
        ArrayList filesToAdd = new ArrayList();
        filesToAdd.add(archivo);
        ZipParameters parameters = new ZipParameters();
        parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
        parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
        parameters.setEncryptFiles(false);
        zipFile.addFiles(filesToAdd, parameters);
        return archivoZip;
    }

    public static String comprimirZipLinux(
            final String nombreArchZip,
            final File archivo) throws IOException, ZipException {
        String archivoZip = System.getProperty("java.io.tmpdir") + "/" + nombreArchZip;
        ZipFile zipFile = new ZipFile(archivoZip);
        ArrayList filesToAdd = new ArrayList();
        filesToAdd.add(archivo);
        ZipParameters parameters = new ZipParameters();
        parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
        parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
        parameters.setEncryptFiles(false);
        zipFile.addFiles(filesToAdd, parameters);
        return archivoZip;
    }

    public static byte[] descomprimirZip(
            final byte[] archivo,
            String nombre,
            final String password) {
        try {
            String path = System.getProperty("java.io.tmpdir");
            File tempFile = File.createTempFile(nombre, "zip", null);

            FileOutputStream fos = new FileOutputStream(tempFile);
            fos.write(archivo);
            fos.flush();
            fos.close();

            ZipFile zipFile = new ZipFile(tempFile);
            if (zipFile.isEncrypted()) {
                zipFile.setPassword(password);
            }
            List fileHeaderList = zipFile.getFileHeaders();

            for (Object fileHeaderList1 : fileHeaderList) {
                FileHeader fileHeader = (FileHeader) fileHeaderList1;
                zipFile.extractFile(fileHeader, path);
            }

            //recuperamos el archivo que se descomprime
            File file = new File(path+"/"+nombre+".csv");
            //init array with file length
            byte[] bytesArray = new byte[(int) file.length()];

            FileInputStream fis = new FileInputStream(file);
            fis.read(bytesArray); //read file into bytes[]
            fis.close();

            return bytesArray;

        } catch (net.lingala.zip4j.exception.ZipException ex) {
            Logger.getLogger(
                    ZipUtil.class.getName()).
                    log(Level.SEVERE, "Error", ex);
            Logger.getLogger(
                    ZipUtil.class.getName()).
                    log(Level.SEVERE, "Clave : {0}", "Erronea!!");

        } catch (IOException ex) {
            Logger.getLogger(ZipUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
