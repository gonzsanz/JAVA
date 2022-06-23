package Almacen;

//Clase de prueba COMPLETAR EL CÓDIGO DEL MÉTODO procesar Opción
import java.util.Scanner;

public class TestAlmacen1 {

	static Scanner sc = new Scanner(System.in);
	static public void main(String[] argv) {

		Almacen1 prueba = new Almacen1();
		int opcion;

		mostrarMenu();
		opcion = sc.nextInt();
		while (opcion != 0) {
			procesarOpcion(opcion, prueba);
			mostrarMenu();
			opcion = sc.nextInt();
		}
		sc.close();

	}

	static void mostrarMenu() {
		System.out.println("--- MENÚ DE  CONTROL DEL ALMACÉN -----");
		System.out.println(" 1.- Mostrar contenido del Almacén");
		System.out.println(" 2.- Poner un Valor  ");
		System.out.println(" 3.- Buscar un Valor ");
		System.out.println(" 4.- Borrar un Valor");
		System.out.println(" 5.- Contar posiciones ocupadas.");
		System.out.println(" 6.- Contar posiciones libres.");
		System.out.println(" 0.- Terminar");
		System.out.print(" Introduzca una opción:[1-6]:");
	}

	// Procesa la opción introducida operando sobre el objeto Almacen1
	static void procesarOpcion(int opcion, Almacen1 parAlmacen) {
		// Completar......
		int num = 0; 
		switch (opcion) {
		case 1:
			System.out.print("Contenido del Almacen: ");
			System.out.println(parAlmacen.toString());
			break;
		case 2:
			System.out.print("Intoduce un valor: ");
			num = sc.nextInt();
			if (!parAlmacen.ponValor(num)) {
				System.out.println("El valor no se ha podido almacenar");
			} else {
				System.out.println("El valor se ha almacenado correctamente");
			}

			break;
		case 3:
			System.out.print("Intoduce un valor: ");
			num = sc.nextInt();
			if (!parAlmacen.estaValor(num)) {
				System.out.println("El valor no está en el almacén");
			} else {
				System.out.println("El valor está en el amalmacén");
			}
			break;
		case 4:
			System.out.print("Intoduce un valor: ");
			num = sc.nextInt();
			if (!parAlmacen.sacarValor(num)) {
				System.out.println("El valor no se ha podido borrar");
			} else {
				System.out.println("El valor se ha borrado");
			}
			break;
		case 5:
			System.out.println(" Posiciones ocupadas = " + parAlmacen.numPosicionesOcupadas());
			break;
		case 6:
			System.out.println(" Posiciones libres = " + parAlmacen.numPosicionesLibres());
		}

	}

}
