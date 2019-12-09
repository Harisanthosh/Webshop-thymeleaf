package de.rhaudi.transfactrestserver.entities;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EntityCreator {
    private static String name;

    private static String projektPath = "C:\\Users\\Malte\\Documents\\";
    private static String projektStructurePath = "transfactRestServer\\src\\main\\java\\de\\rhaudi\\transfactrestserver\\entities";

    private static String cFile = "TemplateController";
    private static String rFile = "TemplateRep";

    private static String upper = null;
    private static String lower = null;

    public static void main(String[] args) {

        String cPath = projektPath + projektStructurePath;

        name = JOptionPane.showInputDialog("Enter Entity Name");

        //Upper
        String toUpperCase = name.toUpperCase();
        upper = toUpperCase + name.substring(1);
        //Lower
        String toLowerCase = name.substring(0, 1).toLowerCase();
        lower = toLowerCase + name.substring(1);


        //Ordner erstellen
        File dir = new File(cPath + "/" + lower);
        dir.mkdir();

        //Groß-Kleinschreibung
        createFile("Controller.java", cFile);
        createFile("Rep.java", rFile);

        System.out.println("Entity erstellt für  -> " + name);

    }

    private static void createFile(String fileName, String file) {
        Charset charset = StandardCharsets.UTF_8;
        //Datei lesen TemplateController
        Path path = Paths.get(projektPath, projektStructurePath, file);
        try {
            String content = new String(Files.readAllBytes(path), charset);
            content = content.replace("[Template]", upper);
            content = content.replace("[template]", lower);
            Path fPath = Paths.get(projektPath, projektStructurePath, lower, upper + fileName);
            Files.write(fPath, content.getBytes(charset));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
