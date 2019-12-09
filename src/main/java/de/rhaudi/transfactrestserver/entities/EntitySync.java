package de.rhaudi.transfactrestserver.entities;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.WildcardFileFilter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EntitySync {

    static String pathToLib = "C:\\Users\\Malte\\Documents" +
            "\\transfactrestclient\\transfactClientBib\\src\\main\\java\\de\\rhaudi\\entities";

    static String pathToEntities = "C:\\Users\\Malte\\Documents" +
            "\\transfactrestserver\\src\\main\\java\\de\\rhaudi\\transfactrestserver\\entities";


    public static void main(String[] args) {

        for (File folder : getFolders(pathToEntities)) {

            if (!Arrays.asList(getFolders(pathToLib)).contains(folder)) {
                File f = new File(pathToLib + "\\" + folder.getName());
                f.mkdir();
            }

            copyFile(getEntityFile(pathToEntities + "\\" + folder.getName()), pathToLib + "\\" + folder.getName(), true);

        }


    }

    static String getEntityFile(String path) {
        File directory = new File(path);
        Collection<File> collections = FileUtils.listFiles(directory, new WildcardFileFilter("*Entity.java"), null);
        if (collections.size() > 0) {
            File f = (File) collections.toArray()[0];
            return f.getPath();
        }
        return null;
    }

    private static File[] getFolders(String path) {
        File dir = new File(path);
        File[] files = dir.listFiles();
        FileFilter fileFilter = new FileFilter() {
            public boolean accept(File file) {
                return file.isDirectory();
            }
        };
        files = dir.listFiles(fileFilter);
        return files;
    }

    public static void copyFile(String from, String to, Boolean overwrite) {

        try {
            File fromFile = new File(from);
            File toFile = new File(to);

            if (!fromFile.exists()) {
                throw new IOException("File not found: " + from);
            }
            if (!fromFile.isFile()) {
                throw new IOException("Can't copy directories: " + from);
            }
            if (!fromFile.canRead()) {
                throw new IOException("Can't read file: " + from);
            }

            if (toFile.isDirectory()) {
                toFile = new File(toFile, fromFile.getName());
            }

            if (toFile.exists() && !overwrite) {
                throw new IOException("File already exists.");
            } else {
                String parent = toFile.getParent();
                if (parent == null) {
                    parent = System.getProperty("user.dir");
                }
                File dir = new File(parent);
                if (!dir.exists()) {
                    throw new IOException("Destination directory does not exist: " + parent);
                }
                if (dir.isFile()) {
                    throw new IOException("Destination is not a valid directory: " + parent);
                }
                if (!dir.canWrite()) {
                    throw new IOException("Can't write on destination: " + parent);
                }
            }

            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {

                fis = new FileInputStream(fromFile);
                fos = new FileOutputStream(toFile);
                byte[] buffer = new byte[4096];
                int bytesRead;

                while ((bytesRead = fis.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }

            } finally {
                if (from != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
                if (to != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Problems when copying file.");
        }
    }
}
