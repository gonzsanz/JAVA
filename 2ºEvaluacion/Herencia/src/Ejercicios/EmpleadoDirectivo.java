package Ejercicios;

public class EmpleadoDirectivo extends Empleado {
	
	private int porcentaje;
	private int beneficios;
	
	public EmpleadoDirectivo(String nombre, Fecha fechaNacimiento, int dni, int sueldoBase) {
		super(nombre, fechaNacimiento, dni, sueldoBase);
	}

	public void setBeneficios (int valor) {
		this.beneficios = valor;
	}
	

	public int getSueldo(int sueldo) {
		sueldo += porcentaje;
		return sueldo;
	}
	
}
