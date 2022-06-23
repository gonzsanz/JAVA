/*
 * Leer dos números, sumarlos y escribir su resultado.
 */

import java.util.Scanner;
public class Ejercicio01 {

	public static void main(String[] args) {
		try (Scanner numero = new Scanner(System.in)) {
			int num1;
			int num2;
			int resultado;
			
			System.out.print("Introduce el primer número: ");
			
			num1 = numero.nextInt();
			
			System.out.print("Introduce el segundo número: ");

			num2 = numero.nextInt();
			
			resultado = num1 + num2;
			System.out.println("La suma es " + resultado);
		}
		
	}
}