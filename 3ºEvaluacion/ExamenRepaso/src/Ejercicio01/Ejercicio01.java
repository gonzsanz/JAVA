package Ejercicio01;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio01 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduzca el nombre de un fichero");
        String ruta = sc.nextLine();
        leerFichero(ruta);

    }

    public static File leerFichero(String ruta) {
        File fis = new File(ruta);
        try {

            File fl = new File(ruta + ".ord");
            PrintWriter pw = new PrintWriter(fl);
            List<String> list = new ArrayList<>(Files.readAllLines(fis.toPath()));

            Collections.sort(list);

            for (String s : list) {
                pw.write(s + "\n");
            }

            pw.close();
            sc.close();

            System.out.println("Fichero copiado correctamente");
            return fl;
        } catch (Exception e) {
            System.err.println("Lo sentimos, el fichero no existe");
        }

        sc.close();
        return null;
    }
}
