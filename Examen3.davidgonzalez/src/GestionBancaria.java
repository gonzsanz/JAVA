import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestionBancaria {

    static Scanner sc = new Scanner(System.in);

    public static void main(String argv[]) {

        HashMap<Long, Cuenta> mcuentas = new HashMap<Long, Cuenta>();
        mcuentas.put(100293929L, new Cuenta(100293929L, "Ana Soria", 2123.34f));
        mcuentas.put(200293929L, new Cuenta(200293929L, "Pedro Roca", 5030.83f));
        mcuentas.put(300293929L, new Cuenta(300293929L, "Adan", 0.0f));
        mcuentas.put(400293929L, new Cuenta(400293929L, "Eva", 0.0f));
        mcuentas.put(500293929L, new Cuenta(500293929L, "Millonetis", 8552123.34f));

        System.out.println("Introduce un valor mínimo de saldo:");
        float valor = leerFloat();

        System.out.println(">Cuentas con saldo superior a " + valor);
        mostrarCuentas(mcuentas, valor);

        System.out.println(">Eliminado cuentas con saldo igual a 0 ");
        borrarCuentas(mcuentas);

        System.out.println(">Cuentas ordenadas por saldo");
        ordenarCuentas(mcuentas);
    }

    static private float leerFloat() {
        // Implementar
        float valor = 0.0f;
        boolean error = false;
        String cadena;

        do {
            error = false;
            try {
                // Intento leer directamente un float
                cadena = sc.nextLine();
                valor = Float.parseFloat(cadena);
            } catch (NumberFormatException e) {
                System.out.println("Error en el formato");
                error = true;
            }
        } while (error);

        return valor;
    }

    static private void borrarCuentas(HashMap<Long, Cuenta> map) {

        map.values().removeIf(value -> value.saldo == 0);

    }

    static private void ordenarCuentas(HashMap<Long, Cuenta> map) {

        ArrayList<Cuenta> listaCuentas = new ArrayList<>(map.values());
        Collections.sort(listaCuentas);
        for (Cuenta c : listaCuentas) {
            System.out.println(c);
        }
    }

    static private void mostrarCuentas(HashMap<Long, Cuenta> map, Float valor) {

        for (Map.Entry<Long, Cuenta> entry : map.entrySet()) {

            if (entry.getValue().saldo > valor) {
                System.out.println(entry);
            }
        }
    }
}
