package Ejercicio03;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio03 implements Serializable {

    public static void main(String[] args) {
        ArrayList<Candidato> lista = new ArrayList<>();

        cargarCandidatos(lista);
        Collections.sort(lista, Collections.reverseOrder());
        mostrarlista(lista);
    }

    public static void cargarCandidatos(ArrayList<Candidato> lista) {

        File fl = new File("votaciones.objects");
        try (FileInputStream fis = new FileInputStream(fl);
                ObjectInputStream ois = new ObjectInputStream(fis)) {

            while (true) {
                lista.add((Candidato) ois.readObject());
            }
        } catch (IOException | ClassNotFoundException e) {

        }
    }

    public static void mostrarlista(ArrayList<Candidato> lista) {

        System.out.println("TOP 5 CANDIDATOS");
        for (int i = 0; i < 5; i++) {

            System.out.println(lista.get(i));
        }

    }

}
