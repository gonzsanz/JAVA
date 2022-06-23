
public class Ejercicio01 {

	public static void main(String[] args) {
		
		int ventas[][] = {
				{ 9, 0, 3, 4, 6, 7, 0, 4, 1, 3,  10,0 },
				{ 9, 2, 3, 4, 6, 1, 0, 4, 1, 3, 100,0 },										
				{ 1, 0, 3, 4, 6, 7, 0, 4, 1, 3,  6, 7 },
				{ 1, 0, 3, 4, 6, 0, 0, 0, 0, 0,  6, 0 },
				{ 1, 0, 3, 4, 6, 7, 0, 4, 1, 3,  6, 0 }
			   };
		String productos[]={"Jamón","Morcilla","Chorizo","Salchichón","Paté"};
		
		int producto[] = new int[ventas.length];
		int mes[] = new int[12];
		
		//Suma ventas por producto
		for (int  i=0; i<producto.length; i++) {
			producto[i] = calcularSuma(ventas[i]);
			for (int j=0; j<mes.length; j++) {
				mes[i] = calcularSuma(ventas[i]);
			}
		}
		
		//Suma ventas por mes
		
		int max = posicionMax(producto);
		int min = posicionMin(producto);
		int mesMax = posicionMesMax(mes);
		
		
		
		System.out.println("El producto mas vendido es " + productos[max]);
		System.out.println("El producto menos vendido es " + productos[min]);
		System.out.println("El mes que mas ventas ha producido es " + mes[mesMax]);
		
	}
	
	//Calcula suma de los productos
	static int calcularSuma (int[]t) {
		int suma = 0;
		
		for (int i=0; i<t.length; i++) {
			suma += t[i];
		}
		return suma;
	}

	//Calcula cual es el producto mas vendido
	static int posicionMax(int[]t) {
		int max = 0;
		for (int i = 0; i<t.length; i++) {
			if (t[i] > t[max]) {
				max = i;
			}
		}
		return max;
	}
	
	//Calcula cual es el producto menos venido
	static int posicionMin(int[]t) {
		int min = 0;
		for (int i=0; i<t.length; i++) {
			if (t[i] < t[min]) {
				min = i;
			}
		}
		return min;
	}
	
	static int posicionMesMax (int[]t) {
		int max = 0;
		for (int i = 0; i<t.length; i++) {
			if (t[i] > t[max]) {
				max = i;
			}
		}
		return max;
	}
}
