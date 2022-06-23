import java.util.Scanner;

public class PiedraPapelTijera {

	static final int PIEDRA = 1;
	static final int PAPEL = 2;
	static final int TIJERAS = 3;
	static Scanner sc;

	public static void main(String[] args) {

		int valorUsuario; // Valor elegido por el usuario
		int contadorUsuario = 0; // Contador de partidas ganadas por el usuario
		int valorOrdenador; // Valor elegido por el ordenador
		int contadorOrdenador = 0; // Contador de partidas ganadas por el ordenador.
		char continuar;

		sc = new Scanner(System.in);

		do {
			System.out.print("Valor del usuario: ");
			// Obtengo el valor del usuario
			valorUsuario = obtenerValorUsuario();

			// La mitad de las veces hace trampa
			if (Math.random() > 0.5) {
				valorOrdenador = generarValor();
			} else {
				// Con trampa genero el valor a partir del valor del usuario
				valorOrdenador = generarValor(valorUsuario);
			}

			// Muestro los valores elegidos y quien es el ganador;
			System.out.println(" Usuario  :" + valorString(valorUsuario));
			System.out.println(" Ordenador:" + valorString(valorOrdenador));

			int ganador = calcularGanador(valorUsuario, valorOrdenador);
			switch (ganador) {
			case 0:
				System.out.println("Empate.");
				break;
			case 1:
				System.out.println(" Gana el Usuario.");
				contadorUsuario++;
				break;
			case 2:
				System.out.println(" Gana el Ordenador");
				contadorOrdenador++;
				break;
			}
			System.out.print("\n ¿Otra Partidita? (s/n):");
			continuar = sc.next().charAt(0);
		} while ((continuar == 'S') || (continuar == 's'));

		// Muestro el resultado final.
		System.out.println("Partidas ganadas por el ordenador :" + contadorOrdenador);
		System.out.println("Partidas ganadas por el usuario   :" + contadorUsuario);
		System.out.println(" Bye Bye.");
		sc.close();
	}

	/*
	 * Leer la opción de usuario, solo admite valores correctos: 1,2 o 3
	 */

	static int obtenerValorUsuario() {
		int num;
		num = sc.nextInt();
		return num;
	}

	/*
	 * Funcion auxiliar que devuelve la cadena equivalente al valor 1, 2, 3
	 */
	static String valorString(int valor) {
		String cadena = "Error";
		switch (valor) {
		case 1:
			cadena = "PIEDRA";
			break;
		case 2:
			cadena = "PAPEL";
			break;
		case 3:
			cadena = "TIJERAS";
			break;
		}
		return cadena;
	}

	/*
	 * Devuelve 0 si empate o 1 si gana el jugador 1 o 2 en el otro caso
	 */
	static int calcularGanador(int jugador1, int jugador2) {
		int gana = 0;
		if (jugador1 == PIEDRA && jugador2 == TIJERAS) {
			gana = 1;
		}
		if (jugador1 == PAPEL && jugador2 == PIEDRA) {
			gana = 1;
		}
		if (jugador1 == TIJERAS && jugador2 == PAPEL) {
			gana = 1;
		}
		if (jugador1 == jugador2) {
			gana = 0;
		}
		if (jugador1 == PIEDRA && jugador2 == PAPEL) {
			gana = 2;
		}
		if (jugador1 == TIJERAS && jugador2 == PIEDRA) {
			gana = 2;
		}
		if (jugador1 == PAPEL && jugador2 == TIJERAS) {
			gana = 2;
		}
		return gana;
	}

	/*
	 * Genera aleatoriamento un valor entre 1 y 3 ( PIEDRA,PAPEL o TIJERAS)
	 */
	static int generarValor() {
		int aleatorio;
		aleatorio = (int) Math.floor(Math.random() * 3 + 1);
		return aleatorio;
	}

	/*
	 * 
	 * HACE trampa Genera el valor de ordenador en funcion del valor de usuario para
	 * que ganar
	 */

	static int generarValor(int valorUsuario) {
		int trampa = 0;
		if (valorUsuario == PIEDRA) {
			trampa = PAPEL;
		}
		if (valorUsuario == PAPEL) {
			trampa = TIJERAS;
		}
		if (valorUsuario == TIJERAS) {
			trampa = PIEDRA;
		}
		return trampa;
	}
}
