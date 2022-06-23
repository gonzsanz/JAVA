import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio03 {

    public static void main(String[] args) {
        List<Candidato> listaCandidatos = new ArrayList<>();
        boolean continuarLeyendo=true;
        try (FileInputStream fileInputStream = new FileInputStream("votaciones.objects");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            while(continuarLeyendo) {
                Candidato c = (Candidato) objectInputStream.readObject();
                if (c == null) {
                    continuarLeyendo = false;
                }
                listaCandidatos.add(c);
            }
        } catch (ClassNotFoundException | IOException e) {
            if(!(e instanceof EOFException)){
                e.printStackTrace();
            }


        }
        listaCandidatos.stream()
                .sorted().limit(5)
                .forEach(System.out::println);
    }
}
