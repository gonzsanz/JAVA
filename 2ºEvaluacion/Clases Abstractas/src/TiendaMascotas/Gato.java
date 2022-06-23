package TiendaMascotas;

public class Gato extends Mascota {

    private String raza;

    public Gato(String nombre, Sexo sexo, String raza) {
        super(nombre, sexo);
        this.raza = raza;
    }

    public void decirAlgo() {

        System.out.println("Miaauuuu");
    }

    public void gustosAlimentarios() {
        System.out.println("Quiero pescado");
    }

    public String toString() {
        return super.toString() + ": Raza= " + raza;
    }

    public Mascota cruzar(Mascota otra) {
        Mascota hijo = null;

        if ((this.getClass() == otra.getClass()) && (this.sexo != otra.sexo)) {

            Sexo sexohijo = (Math.random() > 0.5) ? Sexo.MACHO : Sexo.HEMBRA;

            String razaHijo;

            if (this.raza.equals(((Gato) otra).raza)) {

                razaHijo = this.raza;
            } else {
                razaHijo = "Mezcla";
            }

            hijo = new Gato("", sexohijo, razaHijo);
        }
        return hijo;
    }

}
