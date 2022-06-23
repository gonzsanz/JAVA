import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce texto para agregar al archivo");
        String linea = sc.nextLine();
        try {

            File fl = new File("otracosa.txt");

            // Si no existe el archivo lo creo
            if (!fl.exists()) {
                fl.createNewFile();
            }

            FileWriter fw = new FileWriter(fl, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(linea);
            bw.close();

            System.out.println("Archivo copiado");

        } catch (Exception e) {
            System.out.println("Archivo no encontrado");
        }

        sc.close();
    }
}
