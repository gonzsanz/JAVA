import java.util.Arrays;

public class Ejercicio01 {

    public static void main(String[] args) {

        int tabla[] = { -1, 2, 4, -8, 9, 4, 0 };
        System.out.println(Arrays.toString(suprimenegativos(tabla)));

        String palabra = "Extraordinario";
        System.out.println(ultimasletras(palabra, 3));
        System.out.println(ultimasletras(palabra, 7));
        System.out.println(ultimasletras(palabra, 9));

        String cadena[] = { "Hola", "Pepe", "Luis" };
        System.out.println(unirCadenas(cadena));

    }

    public static int[] suprimenegativos(int tabla[]) {

        int contador = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] >= 0) {
                contador++;
            }
        }
        int resu[] = new int[contador];
        int j = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] >= 0) {
                resu[j] = tabla[i];
                j++;
            }
        }
        return resu;
    }

    public static String ultimasletras(String cadena, int n) {
        return cadena.substring(cadena.length() - n, cadena.length());
    }

    public static String unirCadenas(String tcadenas[]) {

        String str = tcadenas[0];
        for (int i = 1; i < tcadenas.length; i++) {
            str += "-" + tcadenas[i];
        }
        return str;
    }
}