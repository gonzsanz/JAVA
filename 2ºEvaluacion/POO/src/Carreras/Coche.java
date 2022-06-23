package Carreras;

public class Coche {

	// Definir los atributos

	private String modelo;
	private int dtotal;
	private int dparcial;
	private boolean motor;
	private int velocidad;
	private int vmax;

	// Definir los métodos

	Coche(String modelo, int velocidadMax) {

		this.modelo = modelo;
		vmax = velocidadMax;
		dtotal = 0;
		dparcial = 0;
		motor = false;
		velocidad = 0;

	}

	public boolean arrancar() {

		if (motor) {
			infoError("El motor ya está arrancado");
			return false;
		} else
			motor = true;
		return true;
	}

	public boolean parar() {

		if (motor) {
			motor = false;
			velocidad = 0;
			dparcial = 0;
			return true;
		} else
			infoError("El motor está apagado");
		return false;
	}

	public boolean acelera(int cantidad) {
		if (motor) {
			velocidad += cantidad;
			
			if (velocidad > vmax) {
				infoError("No se puede superar la velocidad máxima");
				velocidad = vmax;
				return false;
			}
			return true;
		} else
			infoError("El motor está apagado");
		return false;

	}

	public boolean frena(int cantidad) {
		if (motor) {
			velocidad -= cantidad;
			if (velocidad < 0) {
				infoError("No puedes frenar si la velocidad ya es 0");
				velocidad = 0;
				return false;
			}
			return true;
		} else
			infoError("El motor está apagado");
		return false;
	}

	public boolean recorre() {
		if (motor) {
			dtotal += velocidad;

			return true;

		} else
			infoError("El motor está apagado");
		return false;
	}

	public String info() {
		return "Modelo: " + modelo + " Velocidad actual: " + velocidad + " Estado: " + motor + " Km totales: "
				+ getKilometros() + " Km parciales: " + dparcial;
	}

	public int getKilometros() {

		return dtotal;
	}

	private void infoError(String mensaje) {

		System.err.println(mensaje);
	}

}
