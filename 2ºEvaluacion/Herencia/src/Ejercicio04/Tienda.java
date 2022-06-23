package Ejercicio04;

public class Tienda {

    protected String nombre; // Nombre de la tienda
    protected double caja; // Cantidad de saldo en caja
    protected ProductoInventariado[] inventario;

    public Tienda(String nombre, double caja, int max) {

        this.nombre = nombre;
        this.caja = caja;
        inventario = new ProductoInventariado[max];
    }

    public boolean buscarProducto(String id) {

        for (int i = 0; i < inventario.length; i++) {

            if (inventario[i] != null) {
                if (inventario[i].getIdentificacion().equals(id)) {
                    return true;
                }

            } else
                return false;

        }

        return false;
    }

    public boolean añadirProducto(String id, double precio, int cantidad, int beneficio) {

        ProductoInventariado producto = new ProductoInventariado(id, precio, beneficio, cantidad);
        double total = cantidad * precio;

        if (total <= caja) {

            for (int i = 0; i < inventario.length; i++) {
                if (inventario[i] == null) {
                    inventario[i] = producto;
                    break;
                }
                if (inventario[i].getIdentificacion().contains(id)) {
                    inventario[i].setCantidad(cantidad);
                    inventario[i].setBeneficio(beneficio);
                    inventario[i].setPrecioBase(precio);
                }

            }
            return true;
        }
        return false;
    }

    public boolean venderProducto(String id, int cantidad) {

        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i].getIdentificacion().contains(id)) {
                if (inventario[i].getCantidad() > cantidad) {
                    inventario[i].setCantidad(inventario[i].getCantidad() - cantidad);
                    return true;
                } else
                    return false;
            }
        }
        return false;
    }
}
