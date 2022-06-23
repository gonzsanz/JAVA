package Ejercicio04;

import java.util.*;

public class TestProducto {

    protected static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Tienda mitienda = new Tienda("HiperDAW", 785.89, 10); // Mi tienda
        int opcion;

        mostrarMenu();
        opcion = sc.nextInt();
        while (opcion != 0) {
            procesarOpcion(opcion, mitienda);
            mostrarMenu();
            opcion = sc.nextInt();
        }
        infoTienda(mitienda);

    }

    static void mostrarMenu() {

        System.out.println("1.- Añadir producto");
        System.out.println("2.- Buscar producto");
        System.out.println("3.- Vender producto");
        System.out.println("0.- Terminar");
        System.out.println("Introduce una opción [1-3]");
    }

    static void infoTienda(Tienda mitienda) {

        System.out.println("INFORME DE LA TIENDA: " + mitienda.nombre);
        System.out.println("=============================================================");
        System.out.printf("Nombre    Precio Base     Beneficio   Cantidad    Total\n");
        System.out.println("=============================================================");
        for (int i=0; i<mitienda.inventario.length;i++){
            if (mitienda.inventario[i] !=null){
                System.out.println(mitienda.inventario[i]);
            }
        }
        System.out.println("=============================================================");
        System.out.println("                                     SALDO EN CAJA   " + mitienda.caja);
    }
    

    static void procesarOpcion(int opcion, Tienda tienda) {

        String producto;
        double precio;
        int cantidad;
        int beneficio;

        switch (opcion) {
            case 1:
                System.out.print("Nombre del producto: ");
                producto = sc.next();
                System.out.print("Precio Base: ");
                precio = sc.nextDouble();
                System.out.print("Beneficio: ");
                beneficio = sc.nextInt();
                System.out.print("Cantidad: ");
                cantidad = sc.nextInt();
                if (tienda.añadirProducto(producto, precio, cantidad, beneficio)) {
                    System.out.println(producto + " se ha añadido al inventario");
                } else {
                    System.out.println("El inventario está lleno o no hay dinero en caja");
                }
                break;
            case 2:
                System.out.println("¿Que producto quiere buscar?");
                producto = sc.next();
                if (!tienda.buscarProducto(producto)) {
                    System.out.println("No está el producto en la tienda");
                } else
                    System.out.println("El producto si está en la tienda");
                break;
            case 3:
                System.out.print("Nombre del producto: ");
                producto = sc.next();
                System.out.print("Cantidad: ");
                cantidad = sc.nextInt();
                if (!tienda.venderProducto(producto, cantidad)){
                    System.out.println("No disponemos de tanto stock");
                }else
                    System.out.println("Gracias por su compra");
                break;                

        }

    }

}
