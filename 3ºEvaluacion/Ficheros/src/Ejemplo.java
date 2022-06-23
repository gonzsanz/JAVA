import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) throws FileNotFoundException {
        File fl = new File("cosa.txt");

        Scanner sc = new Scanner(fl);

        String linea;

        while (sc.hasNext()) {
            linea = sc.nextLine();
            System.out.println("Nombre: " + linea);
        }

        sc.close();

    }
}
