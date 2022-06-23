import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Ej01 {
    public static void main(String[] args) {
        int cont = 0;
        if (args.length != 2) {
            System.out.println("Error en parámetros <Fichero> <Palabra>");
            System.exit(1);
        }
        Path rutaArchivo = Path.of(args[0]);

        try {
            List<String> lista = Files.readAllLines(rutaArchivo);
            for (String s : lista) {
                if (s.contains(args[1])) {

                    System.out.println(lista.indexOf(s) + " : " + s);
                    cont += 1;
                }
            }
        } catch (IOException e) {
            System.out.println("El archivo no existe");
        } finally {
            System.out.println("La palabra [ " + args[1] + " ] aparece " + cont + " veces en el fichero");
        }

    }
}
