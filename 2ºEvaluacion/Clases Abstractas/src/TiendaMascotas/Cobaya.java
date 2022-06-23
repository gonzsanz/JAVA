package TiendaMascotas;

public class Cobaya extends Mascota {

    public Cobaya(String nombre, Sexo sexo) {

        super(nombre, sexo);
    }

    public void decirAlgo() {

        System.out.println("iiiiihhhh");
    }

    public void gustosAlimentarios() {
        System.out.println("Quiero zanahorias");
    }

    public String toString() {
        return super.toString() + ": Raza= ";
    }

    public Mascota cruzar(Mascota otra) {
        Mascota hijo = null;
        // Si es de mi especie y es de distinto sex
        if ((this.getClass() == otra.getClass()) && (this.sexo != otra.sexo)) {
            Sexo sexohijo = (Math.random() > 0.5) ? Sexo.MACHO : Sexo.HEMBRA;
            hijo = new Cobaya("", sexohijo);

        }

        return hijo;
    }

}
