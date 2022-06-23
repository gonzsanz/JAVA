package Ejercicio04;

public class Producto {

	String nombre;
	float precio;
	int existencia;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}

	public Producto(String nombre, float precio, int existencias) {

		setNombre(nombre);
		setPrecio(precio);
		setExistencia(existencias);
	}

	public void entrada(int cantidad) {

		existencia += cantidad;
	}

	public void salida(int cantidad) {

		existencia += cantidad;
	}

	public void hacerDescuento(int porcentaje) {

		if (existencia > 10) {

			this.precio -= precio * porcentaje/100; 
		}
	}

}