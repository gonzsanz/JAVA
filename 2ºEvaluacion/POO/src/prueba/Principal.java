package prueba;


public class Principal {

	public static void main(String[] args) {
		
		Alumno a1 = new Alumno("Pepe");
		Alumno a2 = new Alumno("Juan");
		
		if (a1.igual(a2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintos");
		}
		
		
		a2.setNota(9.5f);
		
		System.out.println(a1.getNombre() + ":" + a1.getNota());
		System.out.println(a2.getNombre() + ": " + a2.getNota() + ", Nº Matricula: " + a2.getMatricula());
		
		if (a1.igual(a2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintos");
		}
	}
}
