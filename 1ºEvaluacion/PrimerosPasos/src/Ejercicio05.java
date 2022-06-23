/*
 * Leer dos números y una operación (+ - * / ) y mostrar el resultado.
 */

import java.util.Scanner;
public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner numero = new Scanner (System.in);
		
		float num1;
		float num2;
		String operador;
		
		System.out.println("Introduce el primer número: ");
		num1 = numero.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		num2 = numero.nextInt();
		
		System.out.println("Introduce el operador: ");
		operador = numero.next();
		
		switch (operador) {
			case "+":
				System.out.println("La suma es: " + (num1 + num2));
				break;
			case "-":
				System.out.println("La resta es: " + (num1 - num2));
				break;
			case "*":
				System.out.println("La multiplicación es: " + (num1 * num2));
				break;
			case "/":
				System.out.println("La división es: " + (num1 / num2));
				break;
			default:
				System.out.println("Error al introducir operador");
		}
		numero.close();

	}

}
