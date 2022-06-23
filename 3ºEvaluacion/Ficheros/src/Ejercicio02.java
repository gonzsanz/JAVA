import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Ejercicio02 {

    public static void main(String[] args) {

        try {

            List<String> lista = Files.readAllLines(Paths.get("cosa.txt"));

            lista.stream()
                    .map(s -> new StringBuilder(s).reverse().toString())
                    .forEach(System.out::println);
            ;

        } catch (Exception e) {
            System.out.println("No existe el archivo");
        }

    }
}
