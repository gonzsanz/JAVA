import java.util.*;

public class Banco {

	
	public static Scanner sc;
	public static void main(String args[]) throws InterruptedException {
		 sc = new Scanner(System.in);

		int saldo = 0;
		int orden;
		System.out.println("Espere mientras el sistema arranca");
		for (int i = 1; i <= 5; i++) {
			System.out.println(".............");
			Thread.sleep(500); // 0,5 seg
		}
		do {
			System.out.println("MI BANCO JAVA");
			System.out.println("1.- Inicializar Cuenta");
			System.out.println("2.- Realizar Ingreso");
			System.out.println("3.- Mostrar Saldo");
			System.out.println("4.- Realizar Reintegro");
			System.out.println("0.- Terminar");
			System.out.println("Elegir opción [0-4]:");
			orden = sc.nextInt();
			switch (orden) {
			case 1:
				saldo = initCuenta(saldo);
				break;
			case 2:
				saldo = realizarIngreso(saldo);
				break;
			case 3:
				mostrarSaldo(saldo);
				break;
			case 4:
				saldo = realizarReintegro(saldo);
				break;
			case 0:
				terminar();
				break;
			default:
				System.out.println("Opción errónea");
			}
		} while (orden != 0);
	}

	// ----------------------------------------------------------
	// Inicializa la cuenta con el valor indicado
	// ----------------------------------------------------------
	public static int initCuenta(int nuevoSaldo) {
		
		System.out.print("Indique el valor de su saldo actual: ");
		nuevoSaldo = sc.nextInt();
		while (nuevoSaldo <= 0) {
			System.out.println(">Operación no permitida, su saldo no puede ser negativo o cero");
			nuevoSaldo = sc.nextInt();
		}
		return nuevoSaldo;
	}
	
	// ----------------------------------------------------------
	// Realiza un ingreso en la cuenta siempre que su valor sea > 0
	// ----------------------------------------------------------
	public static int realizarIngreso(int saldoActual) {
		int cantidad;
		System.out.print("Indicar la cantidad a INGRESAR: ");
		cantidad = sc.nextInt();
		if (cantidad <= 0) {
			System.out.println("Operación no permitida, su ingreso debe ser mayor a 0 Euros");
		}
		else {
			saldoActual = saldoActual + cantidad;
			System.out.println("Operación realizada");
		}
		return saldoActual;
	}

	// ----------------------------------------------------------
	// Muestra el salario actual
	// ----------------------------------------------------------
	public static int mostrarSaldo(int saldoActual) {
		System.out.println("Su saldo actual es " + saldoActual + " Euros");
		return saldoActual;
	}

	// ----------------------------------------------------------
	// Muestra un mensaje de despedida
	// ----------------------------------------------------------
	public static void terminar() {
		System.out.println("Hasta la próxima");
	}
	
	// ----------------------------------------------------------
	// Muestra el reintegro
	// ----------------------------------------------------------
	public static int realizarReintegro(int nuevoSaldo) {
		int reintegro;
		System.out.print("Indicar la cantidad a INTEGRAR: ");
		reintegro = sc.nextInt();
		if (reintegro <= 0) {
			System.out.println("Operación no permitida, su integro debe ser mayor a 0 Euros");
		}
		else {
			nuevoSaldo = nuevoSaldo - reintegro;
			System.out.println("Operación realizada");
		}
		return nuevoSaldo;
	}
}
