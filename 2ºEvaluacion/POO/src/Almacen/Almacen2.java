package Almacen;

import java.util.Arrays;

/*
 * Implementar un almacén de enteros mediante una tabla de huecos
 * se supone que no puede contener el valor 0 ya que indica posiciones libre.
 */
public class Almacen2 {

	static private final int LIBRE = 0;
	// Array con los valores almacenados
	private int tvalores[];
	private int valoresAlmacenados = 0;

	// Constructores sin parámetros creo una tabla de 10 elementos
	public Almacen2() {
		this(10); // Llamo al constructor con parámetros
	}

	// Constructor donde se fija tamaño máximo del Almacén
	public Almacen2(int tamaño) {
		tvalores = new int[tamaño];
		init();
	}

	// Pone todas las posiciones a LIBRES
	public void init() {
		for (int i = 0; i < tvalores.length; i++) {
			tvalores[i] = Almacen2.LIBRE;
		}
		valoresAlmacenados = 0;
	}

	// Muestra una cadena con los valores de la tabla
	public String toString() {
		return Arrays.toString(tvalores);
	}

	// Devuelve el números de posiciones libres
	public int numPosicionesLibres() {
		
		return tvalores.length-valoresAlmacenados;
	}

	// Devuelve el número de posiones ocupadas
	public int numPosicionesOcupadas() {
		
		
		return valoresAlmacenados;
	}

	// Devuelve verdadero o falso si está almacenado el valor en la tabla
	public boolean estaValor(int num) {
		
		for (int i=0; i<tvalores.length; i++) {
			if (tvalores[i] == num) {
				return true;
			}
		}
		return false;
	}

	// Almacena el valor el la tabla, devuelve false sin no puede almacenarlo
	public boolean ponValor(int num) {

		for (int i=0; i<tvalores.length; i++) {
			if (tvalores[i] == LIBRE) {
				tvalores[i] = num;
				valoresAlmacenados++;
				return true;
			}
		}
		return false;
	}

	// Elimina el elemento de la tabla, si no esta devuelve false
	public boolean sacarValor(int num) {
		
		for (int i=0; i<tvalores.length; i++) {
			if (tvalores[i] == num) {
				tvalores[i] = LIBRE;
				valoresAlmacenados--;
				cerosAlfinal();
				return true;
			}
		}
		return false;
	}

	// Indica si el almacén esta lleno
	public boolean estaLleno() {
		for (int i=0; i<tvalores.length; i++) {
			if (tvalores[i] != LIBRE) {
				return true;
			}
		}
		return false;
	}
	
	public void cerosAlfinal() {
		  int cont = 0;

	        for (int i = 0; i < tvalores.length; i++)
	            if (tvalores[i] != 0)
	                tvalores[cont++] = tvalores[i];

	        while (cont < tvalores.length)
	            tvalores[cont++] = 0;
	}
}