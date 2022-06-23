package TiendaMascotas;

public class Perro extends Mascota {
    private String raza;

    public Perro(String nombre, Sexo sexo, String raza) {
        super(nombre, sexo);
        this.raza = raza;
    }

    public void decirAlgo() {

        System.out.println("Guaauuu");
    }

    public void gustosAlimentarios() {
        System.out.println("Quiero huesos");
    }

    public String toString() {
        return super.toString() + ": Raza= " + raza;
    }

    public Mascota cruzar(Mascota otra) {
        Mascota hijo = null;

        if ((this.getClass() == otra.getClass()) && (this.sexo != otra.sexo)) {

            Sexo sexohijo = (Math.random() > 0.5) ? Sexo.MACHO : Sexo.HEMBRA;

            String razaHijo;

            if (this.raza.equals(((Perro) otra).raza)) {

                razaHijo = this.raza;
            } else {
                razaHijo = "Mezcla";
            }

            hijo = new Perro("", sexohijo, razaHijo);
        }
        return hijo;
    }

}
