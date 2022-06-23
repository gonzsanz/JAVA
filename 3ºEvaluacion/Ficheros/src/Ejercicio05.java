import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Ejercicio05 {

    public static void main(String[] args) {

        try {

            List<String> lista = Files.readAllLines(Paths.get("lorem_ipsum.txt"));

            lista.stream()
                    .limit(4)
                    .forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Archivo no encontrado");
        }
    }
}
