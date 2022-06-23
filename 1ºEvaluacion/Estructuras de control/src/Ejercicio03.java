/*
 * Hacer un programa que lea un número por la entrada estándar e imprima el 
día de la semana que le corresponde y un mensaje de error en caso de haber 
introducido un número no válido. Utilice una estructura switch.
 */

import java.util.Scanner;
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduce un número del 1 al 7");
		num = numero.nextInt();
		
		switch (num) {
		case 1: System.out.println("El " + num + " corresponde a Lunes");
		  		break;
		case 2: System.out.println("El " + num + " corresponde a Martes");
				break;
		case 3: System.out.println("El " + num + " corresponde a Miércoles");
				break;
		case 4: System.out.println("El " + num + " corresponde a Jueves");
				break;
		case 5: System.out.println("El " + num + " corresponde a Viernes");
				break;
		case 6: System.out.println("El " + num + " corresponde a Sábado");
				break;
		case 7: System.out.println("El " + num + " corresponde a Domingo");
				break;
		default: System.out.println("Error al introducir el número");
		}

		numero.close();
	}

}
