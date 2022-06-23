import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio07 {

    public static void main(String[] args) throws Exception {

        List<String> fichero1 = obtenerFichero("cosa.txt");
        List<String> fichero2 = obtenerFichero("otracosa.txt");

        List<String> fichero3 = fichero1;

        fichero3.addAll(fichero2);
        Collections.sort(fichero3);

        for (String s : fichero3) {
            System.out.println(s);
        }

        String ruta = "copiado.txt";
        pasarFichero(ruta, fichero3);

    }

    public static List<String> obtenerFichero(String fichero) {
        List<String> lista = new ArrayList<>();

        try {

            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            String linea;

            while ((linea = br.readLine()) != null) {
                lista.add(linea);
            }

            br.close();
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;

    }

    public static File pasarFichero(String fichero, List<String> list) throws Exception {

        List<String> lista = list;
        File fl = new File(fichero);

        FileWriter fw = new FileWriter(fl);
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < lista.size(); i++) {
            bw.write(list.get(i));
        }
        bw.close();

        return fl;

    }
}
