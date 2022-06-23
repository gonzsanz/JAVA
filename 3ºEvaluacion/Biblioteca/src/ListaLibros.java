public class ListaLibros {

    Libro primero;

    public ListaLibros() {
        primero = null;
    }

    public void pon(Libro valor) {
        valor.siguiente = primero;
        primero = valor;
    }

    public boolean estaVacia() {
        return (primero == null);

    }

    // Devuelve el Id de un libro o -1 si no lo encuentra
    public int buscarId(String titulo) {
        int idresu = -1;
        Libro paux = primero;
        while (paux != null) {
            if (paux.titulo.equals(titulo)) {
                idresu = paux.id;
                break;
            }
            paux = paux.siguiente;
        }
        return idresu;
    }

    // Devuelve un libro o null si no exite
    public Libro quitar(int id) {

        Libro resu = null;
        // Si esta vacia = 0;
        if (estaVacia())
            return null;
        // Si es el primero;
        if (primero.id == id) {
            resu = primero;
            primero = primero.siguiente;
        }
        Libro p2 = primero;
        Libro p1 = primero.siguiente;
        while (p1 != null) {
            // Es el que hay que eliminar
            if (p1.id == id) {
                resu = p1; // Guardo su referencia
                p2.siguiente = p1.siguiente;
                break;
            }
            p2 = p1;
            p1 = p1.siguiente;
        }
        return resu;
    }

    public void verCatalogo() {
        Libro paux = primero;
        while (paux != null) {
            System.out.println(paux);
            paux = paux.siguiente;
        }
    }

}
