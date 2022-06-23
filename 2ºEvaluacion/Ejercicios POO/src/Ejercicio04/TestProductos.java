package Ejercicio04;

import java.util.Random;

public class TestProductos {

	public static void main(String[] argv) {

		Random valores = new Random();

		Producto mitienda[] = new Producto[8];

		mitienda[0] = new Producto("Morcilla", 2.5f, 15);
		mitienda[1] = new Producto("Chorizo", 2.0f, 50);
		mitienda[2] = new Producto("Salchichón", 2.0f, 25);
		mitienda[3] = new Producto("Chope", 1.5f, 15);
		mitienda[4] = new Producto("Jamón Serrano", 4.0f, 50);
		mitienda[5] = new Producto("Jamón Ibérico", 10.0f, 50);
		mitienda[6] = new Producto("Jamón York", 3.0f, 5);
		mitienda[7] = new Producto("Lacón", 4.0f, 10);

		for (int i = 0; i < mitienda.length; i++) {
			mitienda[i].entrada(valores.nextInt(10));
			mitienda[i].salida(valores.nextInt(10));
		}

		// Muestra un informe de los productos: nombre, precio y existencias de la
		// tienda
		// el valor total de todos los productos en la tienda
		informeTienda(mitienda);

		// Realizar un descuento del 10% a los productos con existencias mayores
		// que 10

		// Poner el código ........
		
		
		
		informeTienda(mitienda);

	}

	static void informeTienda(Producto tablaP[]) {
		for (int i=0; i<tablaP.length;  i++) {
			tablaP[i].hacerDescuento(10);
			System.out.println(tablaP[i].getNombre() + " " + tablaP[i].getExistencia() +  " " +  tablaP[i].getPrecio());
		}
	}
}
