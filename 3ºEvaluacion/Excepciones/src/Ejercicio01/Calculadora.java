package Ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    static Scanner sc = new Scanner(System.in);

    static char operador;

    public static void main(String[] args) throws Exception {

        int resu = 0;
        int num1 = 0;
        int num2 = 0;
        boolean error;

        do {
            error = false;
            System.out.println("Introducza el primer numero");
            try {
                num1 = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error en la lectura del parametro");
                sc.next();
                error = true;
            }

        } while (error);

        do {
            error = false;
            System.out.println("Introducza el segundo numero");
            try {
                num2 = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error en la lectura del parametro");
                sc.next();
                error = true;
            }

        } while (error);
        System.out.println("Elige una operacion");
        operador = sc.next().charAt(0);

        try {

            switch (operador) {
                case '+':
                    resu = num1 + num2;
                    break;
                case '-':
                    resu = num1 - num2;
                    break;
                case '*':
                    resu = num1 * num2;
                    break;
                case '/':
                    resu = num1 / num2;
                    break;
            }
            System.out.println(resu);
        } catch (ArithmeticException e) {
            System.out.println("No puedes dividir entre 0");
        }

    }

}
