import java.util.Arrays;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		double t1[] = {0.2, 10.5, 92.23};
		double t2[] = {53.0, -23.3};
		
		unirTablas(t1,t2);
		System.out.println(Arrays.toString(unirTablas(t1,t2)));

		
	}
	
	//Une las tablas t1 y t2
	static double[] unirTablas (double[]t1, double[] t2) {
		int leng = t1.length + t2.length;
		double[] tabla = new double[leng];
		
		System.arraycopy(t1, 0, tabla, 0, t1.length);
		System.arraycopy(t2, 0, tabla, t1.length, t2.length);
	
		return tabla;
	}
	
}
