package Ejercicio05;

public class Fraccion {
    
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador){

        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void sumar(Fraccion f){
        if (this.denominador != f.denominador){
            this.numerador = (this.numerador * f.denominador) + (this.denominador * f.numerador);
            this.denominador = this.denominador * f.denominador;
        } else {
            this.numerador += f.numerador;
        }
    }

    public void restar(Fraccion f){

        if (this.denominador != f.denominador){
            this.numerador = (this.numerador * f.denominador) - (this.denominador * f.numerador);
            this.denominador = this.denominador * f.denominador;
        } else {
            this.numerador -= f.numerador;
        }

    }

    public void multiplicar(Fraccion f){

        this.numerador *= f.numerador;
        this.denominador *= f.denominador;
    }

    public void dividir(Fraccion f){

        this.numerador *= f.denominador;
        this.denominador *= f.numerador;
    }

    public String toString(){

        return "El resultado es: " + numerador + "/" + denominador;
    }

}
