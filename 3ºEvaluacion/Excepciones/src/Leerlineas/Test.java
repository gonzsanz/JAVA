package Leerlineas;

import java.util.Scanner;

public class Test {
    static String tpalabros[] = { "caca", "culo", "pedo", "pis" };

    /**
     * Clase main
     * 
     * @param argv[]
     * @throws BurradasNOException
     */
    public static void main(String argv[]) throws BurradasNOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tus mensajes, o pulsa . Para terminar:");
        // Completar

        /**
         * Se usa para almacenar el mensaje recibido del metodo leerLineaOK, sino me
         * daba error
         */
        String mensaje;
        do {
            mensaje = "";
            try {
                mensaje += leerLineaOK(sc);
                if (!mensaje.equals(".")) {
                    System.out.println("OK");
                }
            } catch (BurradasNOException e) {
                System.err.println(e.getMessage());
            }

        } while (!mensaje.equals("."));

        System.out.println("Fin del programa");
    }

    /**
     * Lee el mensaje introducido por la persona y comprueba que no hay palabras
     * obscenas
     * 
     * @param sc Escaner
     * @return Mensaje introducido
     * @throws BurradasNOException Lanza una excepcion cuando detecta una palabra
     *                             obscena
     */
    public static String leerLineaOK(Scanner sc) throws BurradasNOException {
        // completar
        String mensaje = sc.nextLine();

        for (int i = 0; i < tpalabros.length; i++) {
            if (mensaje.contains(tpalabros[i])) {
                throw new BurradasNOException(tpalabros[i]);
            }
        }
        return mensaje;
    }
}
