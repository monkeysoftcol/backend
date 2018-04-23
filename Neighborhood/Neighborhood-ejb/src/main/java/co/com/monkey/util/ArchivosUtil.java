/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.monkey.util;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.apache.commons.codec.binary.Base64;

/**
 * Utilidad que contiene funciones para manejar archivos en base 64
 *
 * @author Dospina
 * @author rmatiz
 * @author cccepeda
 */
public class ArchivosUtil {
    
    private static final Logger LOG = Logger.getLogger(ArchivosUtil.class.getSimpleName());

    public static byte[] convertStrigBase64toBytes(final String archivo) {
        //return Base64.decodeBase64(archivo);
        return null;
    }

    public static final void main(String[] args) throws FileNotFoundException {

        String cadena = "jor3WHN12/noosrgGKoqvmTCXuBGjc7pqlmUmKd+0NB4mmEWh87Gg+gbBxSWeGkk4JyDoMMORW+UK/OivR9Dh5T4TmviG0J3LEmCEaR/bepIca7MvqLUIC6Ub07gMoBBk8ahkXwFwnvkUn5Ae2Uya9YY6AYQHbglRPCZVOAqaFxpcrAf0LI+ZBtViDlleJEGHyhFH6RqUA6LKNJAdn3edu/W0O4+WVSSf+53EdIhOxoPA2IZgEYwTGhprENeM/1/2LUKMEag8qMhLnGB6dOrqt+ZPySoVPw5YwRkK70uWWgf6CAaAnybeyQUT2uyqJ91kZhJNIMjdEm3M7uEf1x6rw==";
        byte[] file = convertStrigBase64toBytes(cadena);

        try {
            FileOutputStream fos = new FileOutputStream("D:\\PRUEBAS\\ActoAdministrativoFirmado.pdf");
            fos.write(file);
            fos.close();
        } catch (IOException e) {
        }

    }

    public static void borrarArchivos(File file) {
        try {
            if (file.isDirectory()) {
                if (file.list().length == 0) {
                    file.delete();
                } else {
                    String files[] = file.list();
                    for (String temp : files) {
                        File fileDelete = new File(file, temp);
                        borrarArchivos(fileDelete);
                    }
                    if (file.list().length == 0) {
                        file.delete();
                    }
                }
            } else {
                file.delete();
            }
        } catch (Exception e) {
            Logger.getLogger(ArchivosUtil.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public static void borrarArchivos(String ruta, String nombre) {
        try {
            File file = new File(ruta, nombre);
            if (file.isDirectory()) {
                if (file.list().length == 0) {
                    file.delete();
                } else {
                    String files[] = file.list();
                    for (String temp : files) {
                        File fileDelete = new File(file, temp);
                        borrarArchivos(fileDelete);
                    }
                    if (file.list().length == 0) {
                        file.delete();
                    }
                }
            } else {
                file.delete();
            }
        } catch (Exception e) {
            Logger.getLogger(ArchivosUtil.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public static void comprimirDir(String srcBackup, String dstBackupZIP) {
        try {
            ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dstBackupZIP));
            zipDir(srcBackup, zos);
            zos.close();
        } catch (Exception e) {
            Logger.getLogger(ArchivosUtil.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public static void zipDir(String dir2zip, ZipOutputStream zos) {
        try {
            File dirBackup = new File(dir2zip);

            String[] dirList = dirBackup.list();
            byte[] readBuffer = new byte[2156];
            int bytesIn = 0;
            for (String dirList1 : dirList) {
                File f = new File(dirBackup, dirList1);
                if (f.isDirectory()) {
                    String filePath = f.getPath();
                    zipDir(filePath, zos);
                    continue;
                }
                try (FileInputStream fis = new FileInputStream(f)) {
                    ZipEntry anEntry = new ZipEntry(f.getName());
                    zos.putNextEntry(anEntry);
                    while ((bytesIn = fis.read(readBuffer)) != -1) {
                        zos.write(readBuffer, 0, bytesIn);
                    }
                }
            }
        } catch (Exception e) {
            Logger.getLogger(ArchivosUtil.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public static void writeRaw(List<String> records, String path, String nombre) throws IOException {
        File ruta = new File(path);
        if (!ruta.exists()) {
            ruta.mkdirs();
        }

        File file = new File(path, nombre);

        FileWriter writer = new FileWriter(file);
        System.out.print("Escribiendo fila... ");
        write(records, writer);

    }
    
    public static void writeRawFinalFichero(List<String> records, String path, String nombre) throws IOException {
        File ruta = new File(path);
        if (!ruta.exists()) {
            ruta.mkdirs();
        }

        File file = new File(path, nombre);

        FileWriter writer = new FileWriter(file, true);
        System.out.print("Escribiendo fila... ");
        write(records, writer);

    }

    public static void writeBuffered(List<String> records, int bufSize, String path, String nombre) throws IOException {
        File file = new File(path, nombre);

        FileWriter writer = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(writer, bufSize);

        System.out.print("Escribiendo buffered (tamaño buffer: " + bufSize + ")... ");
        write(records, bufferedWriter);

    }

    public static void writeBufferedEncodig(List<String> records, int bufSize, String path, String nombre) throws IOException {

        String pathFinal = path + "/" + nombre;
        LOG.log(Level.INFO,"===> Escribiendo buffered (pathFinal: {0}... ", pathFinal);
        
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        encoder.onMalformedInput(CodingErrorAction.REPORT);
        encoder.onUnmappableCharacter(CodingErrorAction.REPORT);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathFinal), encoder), bufSize);
        LOG.log(Level.INFO,"===> Escribiendo buffered (tamaño buffer: {0}... ", bufSize);
        write(records, out);

    }

    public static void write(List<String> records, Writer writer) throws IOException {
        long start = System.currentTimeMillis();
        for (String record : records) {
            writer.write(record);
            writer.write("\n");
        }
        writer.flush();
        writer.close();
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000f + " segundos");
    }

    public static byte[] obtenerArchivoBytes(String ruta, String nombre) {
        FileInputStream fileInputStream = null;
        try {
            File rutaReporte = new File(ruta, nombre);
            fileInputStream = new FileInputStream(rutaReporte);
            return getBytesFromInputStream(fileInputStream);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivosUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArchivosUtil.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(ArchivosUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    public static byte[] getBytesFromInputStream(FileInputStream is) throws IOException {
        try (ByteArrayOutputStream os = new ByteArrayOutputStream();) {
            byte[] buffer = new byte[0xFFFF];

            for (int len; (len = is.read(buffer)) != -1;) {
                os.write(buffer, 0, len);
            }

            os.flush();

            return os.toByteArray();
        }

    }
}
