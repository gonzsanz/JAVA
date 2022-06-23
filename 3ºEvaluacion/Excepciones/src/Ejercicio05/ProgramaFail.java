package Ejercicio05;

import java.util.Scanner;

public class ProgramaFail {
    public static void main(String argv[]) {
        // Incluir los tratamiento de excepciones adecuados.

        metodoQueFalla();
    }

    /**
     * Este metodo puede generar muchas excepciones
     */
    static void metodoQueFalla() {

        Cosa tcosas[] = new Cosa[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un valor:");
        int num = sc.nextInt();

        tcosas[0] = new Cosa(num++);
        tcosas[2] = new Cosa(num++);
        tcosas[4] = new Cosa(num++);

        System.out.println("Introduce una posicion :");
        int pos = sc.nextInt();

        System.out.println("El valor en la posicion " + pos +
                " es " + tcosas[pos].getValor());
        sc.close();

    }
}

class Cosa {
    private int valor;

    Cosa(int valor) {
        if (valor == 0)
            throw new ExceptionCero();
        this.valor = valor;
    }

    int getValor() {
        return valor;
    }

}

class ExceptionCero extends RuntimeException {

    ExceptionCero() {
        super("No me gusta el valor 0");
    }
}
