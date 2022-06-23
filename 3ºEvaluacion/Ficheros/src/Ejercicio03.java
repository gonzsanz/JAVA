import java.io.File;
import java.nio.file.Files;

public class Ejercicio03 {

    public static void main(String[] args) {

        try {

            File fl = new File("cosa.txt");
            File fr = new File("otracosa.txt");

            Files.copy(fl.toPath(), fr.toPath());

            System.out.println("Fichero copiado");
        } catch (Exception e) {
            System.out.println("No existe el directorio");
        }

    }
}
