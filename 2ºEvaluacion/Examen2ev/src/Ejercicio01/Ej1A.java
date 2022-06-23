package Ejercicio01;

public class Ej1A {

	static String quitarVocales (String parametro) {

		String aux = "";
		
		for (int i = 0; i<parametro.length(); i++){
			if (parametro.charAt(i) != 'a' && parametro.charAt(i) != 'e' && parametro.charAt(i) != 'i'
			&& parametro.charAt(i) != 'o' && parametro.charAt(i) != 'u'){

				aux += parametro.charAt(i);
			} 
		}
		return aux;
	}
}
