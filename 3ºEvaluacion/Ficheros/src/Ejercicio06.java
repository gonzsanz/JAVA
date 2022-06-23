import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
// import java.nio.file.Files;
// import java.nio.file.Paths;
// import java.util.List;

public class Ejercicio06 {

    public static void main(String[] args) throws Exception {
        Scanner sci = new Scanner(System.in);
        System.out.println("¿Qué ultimas lineas quiere mostrar?");
        int lineas = sci.nextInt();
        ArrayList<String> lista = new ArrayList<>();
        try {

            File fl = new File("lorem_ipsum.txt");
            Scanner sc = new Scanner(fl);

            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                lista.add(linea);
            }
            sc.close();

        } catch (Exception e) {
            System.out.println("Archivo no encontrado");
        } finally {

            try {

                for (int i = lista.size() - lineas; i < lista.size(); i++) {
                    System.out.println(lista.get(i));
                }
            } catch (Exception e) {
                System.out.println("No existen tantas lineas");
            }

        }
        sci.close();

        // OTRA MANERA DE HACERLO

        /*
         * List<String> lines = Files.readAllLines(Paths.get("lorem_ipsum.txt"));
         * 
         * lines.stream()
         * .skip(lines.size() - lineas)
         * .forEach(s -> System.out.println(s));
         */
    }
}
