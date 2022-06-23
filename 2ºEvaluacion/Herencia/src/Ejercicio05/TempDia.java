package Ejercicio05;


public class TempDia {

    private int dia;
    private int mes;
    private int año;
	private int max;
	private int min;
	
	public TempDia(){
		
		this.max = 0;
		this.min = 0;
		this.dia = 0;
		this.mes = 0;
		this.año = 0;

	}
	
	public TempDia(int dia, int mes, int año, int max, int min) {
		
		this.max = max;
		this.min = min;
		this.dia = dia;
		this.mes = mes;
		this.año = año;

	}
}
