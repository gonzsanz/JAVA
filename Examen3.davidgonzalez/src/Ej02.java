import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Ej02 implements Serializable {
    public static void main(String[] args) {

        ArrayList<Alumno> lista = new ArrayList<>();
        cargarAlumnos(lista);
        mostrarAprobados(lista);

    }

    public static void cargarAlumnos(ArrayList<Alumno> lista) {
        try (FileInputStream fis = new FileInputStream("alumnos.ser");
                ObjectInputStream ois = new ObjectInputStream(fis)) {

            while (true) {
                lista.add((Alumno) ois.readObject());
            }
        } catch (IOException | ClassNotFoundException e) {

        }
    }

    public static void mostrarAprobados(ArrayList<Alumno> lista) {
        System.out.println("-----ALUMNOS APROBADOS-----");
        int media;

        for (Alumno a : lista) {
            media = (a.getEv1() + a.getEv2() + a.getEv3()) / 3;
            if (media >= 5) {
                System.out.println(a);
            }
        }
    }
}
