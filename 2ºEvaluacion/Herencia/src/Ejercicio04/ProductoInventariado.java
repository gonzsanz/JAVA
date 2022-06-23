package Ejercicio04;

public class ProductoInventariado extends Producto {

	private int cantidad;
	private int beneficio;

	public ProductoInventariado(String identificacion, double precioBase, int beneficio, int cantidad) {

		super(identificacion, precioBase);
		this.cantidad = cantidad;
		this.beneficio = beneficio;

	}

	public int getCantidad() {

		return cantidad;
	}

	public int getBeneficio() {

		return beneficio;
	}

	public void setCantidad(int cantidad) {

		this.cantidad = cantidad;
	}

	public void setBeneficio(int beneficio) {

		this.beneficio = beneficio;
	}

	public double precioFinal() {

		return getPrecioBase() * cantidad;
	}

	public String toString() {

		return super.toString() + " 	   (+" + beneficio + "%)	   " + cantidad + "	" + precioFinal();
	}

}
