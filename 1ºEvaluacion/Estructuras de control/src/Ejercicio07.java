/*
 * Escribir un programa que devuelva el factorial de un número N leído de la 
entrada.     
 */
import java.util.Scanner;
public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int num;
		long factorial = 1;
		
		System.out.println("Introduce un número para calcular su factorial: ");
		num = numero.nextInt();
		
		for (int i = num; i > 0; i--) {
			factorial = factorial * i;
		}
		System.out.println("El factorial de " + num + " es: " + factorial);

		numero.close();
	}

}
