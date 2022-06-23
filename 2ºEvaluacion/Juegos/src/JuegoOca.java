import java.util.*;

public class JuegoOca {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String tablero = "SNNNNONNNONNNNONNNOPNNNONNDONNNNONNNONNNNOLNNONNNNONCDONNNMONNNF";

		/*
		 * TABLERO
		 * S - salida N - casilla normal O - casilla oca D - casilla dado L -
		 * laberinto P - posada C - cárcel M - calavera - muerte F - final
		 */

		int casilla = 0;
		int dado = 0;
		boolean victoria = false;

		System.out.println("Posicion inicial: " + casilla);
		do {
			dado = valorDado(dado);

			casilla += dado;
			if (casilla < tablero.length()) {

				switch (tablero.charAt(casilla)) {
				case 'O':
					for (int i = casilla + 1; i <= tablero.length(); i++) {
						if (tablero.charAt(i) == 'O') {
							casilla = i;
							break;
						}
						if (tablero.charAt(i) == 'F') {
							casilla = i;
							victoria = true;
							break;
						}

					}
					System.out.println(">De oca a oca y tira porque te toca, Vaya a la casilla  " + casilla);
					break;
				case 'D':
					casilla = casillaDado(casilla);

					System.out.println("De dado a dado y tira porque te ha tocado, Vaya a la casilla " + casilla);
					break;
				case 'L':
					System.out.println("Te has perdido en el laberinto, te pierdes 1 turno");
					break;
				case 'P':
					System.out.println("Descansa 1 turno en la posada");
					break;
				case 'C':
					System.out.println("Pierdes 2 turnos encerrado en la cárcel");
					break;
				case 'M':
					System.out.println("Has muerto, vuelve a la casilla de salida");
					casilla = 0;
					break;
				case 'F':
					System.out.println(">Vaya a la casilla nº 63");
					victoria = true;
					break;
				case 'N':
					System.out.println(">Vaya a la casilla nº " + casilla);
					break;

				}
			} else {
				System.out.println("Te has pasado, vuelva a intentarlo");
				casilla -= dado;
			}

		} while (victoria == false);

		System.out.println("¡¡ENHORABUENA HAS GANADO!!");
	}

	// Devuelve el valor del dado introducido
	static int valorDado(int dado) {
		do {
			System.out.print("Indique el valor del dado: ");
			dado = sc.nextInt();

		} while (dado < 1 || dado > 6);
		return dado;
	}


	
	static int casillaDado(int casilla) {
		if (casilla == 26) {
			casilla = 53;
		} else if (casilla == 53) {
			casilla = 26;
		}
		return casilla;
	}
}
