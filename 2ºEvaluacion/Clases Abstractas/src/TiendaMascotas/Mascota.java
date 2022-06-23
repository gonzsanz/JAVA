package TiendaMascotas;

public abstract class Mascota {

    protected String nombre;
    protected Sexo sexo;

    public Mascota(String nombre, Sexo sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "Soy un " + this.getClass().getSimpleName() + ", mi nombre es " + nombre + " Sexo= " + sexo;
    }

    public abstract void decirAlgo();

    public abstract void gustosAlimentarios();

    public abstract Mascota cruzar(Mascota otra);
}
