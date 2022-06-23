import java.util.Random;

/**
 * Almacenar en una tabla de 100 elementos números aleatorios entre 1 y 500.
 *  mostrar el máximo, el mínimo y la media. 
 *  Realizar otra versión donde no puedan almacenarse números repetidos.
 * @author alberto
 *
 */

public class Ejercicio04 {

	static final int  NUM = 100;
	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int tabla[] = new int [NUM];
		int valor;
		int contIntroducidos = 0;
		
		// Rellenar
		for (int i = 0; i < tabla.length; i++) {
			do {
			   valor = rd.nextInt(500)+1;
			}
			while (  estaRepetido (valor,tabla,contIntroducidos ) );
			tabla[i] = valor;
			contIntroducidos++;
		}
		
		int max = tabla[0];
		int min = tabla[0];
		int suma = 0;
		
		// Calcular valores
		for (int i = 1; i < tabla.length; i++) {
			if ( tabla[i] > max) {
				max = tabla[i];
			} else if ( tabla[i] < min) {
				min = tabla[i];
				
			}
			suma += tabla[i];		
		}
		
		// Mostrar datos
		System.out.println(" Máximo ="+max);
		System.out.println(" Mínimo ="+min);
		System.out.println(" Media  ="+ ( (float) suma)/NUM);
	
	}
	
	// Indica si el valor esta repetido en la tabla
	
	private static boolean estaRepetido(int valor, int[] tabla, int limite) {
	    boolean resu = false;
	    
	    for (int i = 0; i < limite; i++) {
			if ( valor == tabla[i]) {
				resu = true;
				break;
			}
		}
		
		return resu;
	}

}
