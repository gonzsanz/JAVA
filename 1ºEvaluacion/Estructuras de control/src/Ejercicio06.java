/*
 * Escribe un programa que recorra los 100 primeros números imprimiendo 
“Saca” si el número es múltiplo de 3, “Corchos” si es múltiplo de 5, 
“Sacacorchos” si es múltiplo de 15 y el número para el resto de casos.
 */

public class Ejercicio06 {

	public static void main(String[] args) {
		
	        for(int contador = 1; contador <= 100; contador++) {
	            if (contador % 3 == 0) {
	            	System.out.println("Saca");
	            }
	            if (contador % 5 == 0) {
	           		System.out.println("Corchos");
	           	}
	           	if (contador % 15 == 0) {
	           		System.out.println("Sacaorchos");
	           	}
	            if(contador % 3 != 0 && contador % 5 != 0 && contador % 15 != 0) {
	            	System.out.println(contador);
	            }
	        }
	}

}
