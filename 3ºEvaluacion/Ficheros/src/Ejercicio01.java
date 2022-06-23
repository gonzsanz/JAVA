
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        List<String> lista = Files.readAllLines(Paths.get("lorem_ipsum.txt"));

        for (int i = 0; i < lista.size(); i += 24) {

            lista.stream()
                    .skip(i)
                    .limit(24)
                    .forEach(System.out::println);

            System.out.println("Presione enter para continuar");

            sc.nextLine();
        }

        sc.close();

    }
}
