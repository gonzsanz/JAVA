/*
 * Un programa que sume el valor de los número pares de 1 a 30.
 */

public class Ejercicio12 {

	public static void main(String[] args) {
		int contador;
		int suma = 0;
		
		for (contador = 1; contador <= 30; contador++) {
			if (contador % 2 == 0) {
				suma = suma + contador;
			}
		}
		System.out.println("La suma es " + suma);
	}

}
