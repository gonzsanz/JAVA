import java.util.*;

public class Ahorcado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce una película: ");
		String pelicula = sc.nextLine().toLowerCase();

		char[] letras = pelicula.toCharArray();
		char[] guiones = new char[letras.length];

		guiones = transformaGuiones(letras, guiones);

		// adivinar la palabra
		boolean ganar = false;
		int cont = 0;
		String error = "";

		do {
			System.out.print("Película a adivinar: ");
			System.out.print(guiones);
			System.out.print("> ERROR: ");
			System.out.print(error);
			if (Arrays.equals(letras, guiones)) {
				ganar = true;
				break;
			}
			if (cont == 8)
				break;
			System.out.print("\nIntroduce una letra: ");
			char letraIntroducida = sc.next().toLowerCase().charAt(0);
			boolean encontrado = false;

			rellenarPalabra(pelicula,letraIntroducida,guiones);

			if (!noEncontrado(pelicula,letraIntroducida, guiones, encontrado)) {
				cont++;
				error = ahorcado(error, cont);
			}

		} while (ganar == false);

		if (ganar == true)
			System.out.println("\n¡¡ ENHORABUENA HAS ACERTADO!!");
		if (cont == 8)
			System.out.println("\nLO SENTIMOS HAS PERDIDO");
		System.out.println("La película era: " + pelicula);

		sc.close();
	}

	// Transforma película a guiones
	static char[] transformaGuiones(char[] letras, char[] guiones) {
		for (int i = 0; i < letras.length; i++) {
			if (letras[i] == ' ') {
				guiones[i] = ' ';
			} else
				guiones[i] = '-';
		}
		return guiones;
	}
	
	//Rellena palabra cambiando guiones por letras introducidas
	static char[] rellenarPalabra(String pelicula, char letra, char[] guiones) {
		for (int i = 0; i < pelicula.length(); i++) {
			if (letra == pelicula.charAt(i)) {
				guiones[i] = pelicula.charAt(i);
			}
		}
		return guiones;
	}
	
	//Si no encuentra la letra
	static boolean noEncontrado (String pelicula, char letra, char[] guiones, boolean encontrado) {
		for (int i = 0; i < pelicula.length(); i++) {
			if (letra == pelicula.charAt(i)) {
				guiones[i] = letra;
				encontrado = true;
			}
		}
		return encontrado;
	}

	// Imprime 'AHORCADO' si falla al introducir la letra
	static String ahorcado(String error, int cont) {
		switch (cont) {
		case 0:
			error += ' ';
			break;
		case 1:
			error = "";
			error += 'A';
			break;
		case 2:
			error = "";
			error += "AH";
			break;
		case 3:
			error = "";
			error += "AHO";
			break;
		case 4:
			error = "";
			error += "AHOR";
			break;
		case 5:
			error = "";
			error += "AHORC";
			break;
		case 6:
			error = "";
			error += "AHORCA";
			break;
		case 7:
			error = "";
			error += "AHORCAD";
			break;
		case 8:
			error = "";
			error += "AHORCADO";
			break;
		}
		return error;
	}

}
