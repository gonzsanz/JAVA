import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class ProcesarOrdenadores {

    public static void main(String[] args) throws Exception {

        ArrayList<Ordenador> list = new ArrayList<>();

        list = cargaArrayList();

        // Procesar el ArrayList
        Collections.sort(list);

        System.out.println("ORDENADROES CON MAS DE 1000GB");
        for (Ordenador o : list) {
            if (o.disco == 1000)
                System.out.println(o);
        }

        list.removeIf(o -> (o.marca.equals("APPLE")));

        // Escribir ArrayList al fichero

        volcarArrayList(list);

    }

    public static void volcarArrayList(ArrayList<Ordenador> lOrdenadors) throws IOException {
        FileOutputStream fw = new FileOutputStream("ordenadores.objetos");
        ObjectOutputStream fow = new ObjectOutputStream(fw);
        for (Ordenador o : lOrdenadors) {

            fow.writeObject(o);
        }
        fw.close();
        fow.close();
    }

    public static ArrayList<Ordenador> cargaArrayList() throws IOException, ClassNotFoundException {

        ArrayList<Ordenador> list = new ArrayList<>();

        // Leer de Ficherro a ArrayList
        FileInputStream fis = new FileInputStream("ordenadores.objetos");

        // Creo un flujo de objetos sobre el fichero
        ObjectInputStream ois = new ObjectInputStream(fis);

        try {
            // Leo objetos hasta llegar al final del fichero
            Ordenador aux = (Ordenador) ois.readObject();
            // Sale cuando llegue al final del fichero End Of File EOF
            while (true) {
                list.add(aux);
                aux = (Ordenador) ois.readObject();
            }
        } catch (EOFException e) {
            // No hacer nada, simplementa detecto que no hay mas que leer
        }
        ois.close();
        fis.close();

        return list;
    }

}
