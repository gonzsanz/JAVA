package Ejercicio05;

import java.util.Scanner;

public class TestFraccion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Fraccion f1 = new Fraccion(3, 4);
        Fraccion f2 = new Fraccion(2, 5);

        mostrarMenu();
        int opcion = sc.nextInt();
        procesarOpcion(opcion, f1, f2);

        sc.close();
    }

    static void mostrarMenu() {

        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicación");
        System.out.println("4.- División");
        System.out.println("Introduce una opción [1-4]");
    }

    static void procesarOpcion(int opcion, Fraccion f1, Fraccion f2) {

        switch (opcion) {
            case 1:
                f1.sumar(f2);
                System.out.println(f1.toString());
                break;
            case 2:
                f1.restar(f2);
                System.out.println(f1.toString());
                break;
            case 3:
                f1.multiplicar(f2);
                System.out.println(f1.toString());
                break;
            case 4:
                f1.dividir(f2);
                System.out.println(f1.toString());
            default:
                System.out.println("No esta disponible esa opción");
        }
    }
}
