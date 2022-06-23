package Reloj;

import javax.swing.JOptionPane;

/**
 * Clase Reloj con Alarma que hereda de la clase Reloj
 * 
 * @author david
 *
 */
public class RelojAlarmaH extends Reloj {

	private int segundosalarma;
	private boolean alarmaActivada;

	// Constructor de la nueva clase
	RelojAlarmaH(int hora, int minutos, int segundos) {
		// Constructor clase padre 1º Instrucción
		super(hora, minutos, segundos);
		this.alarmaActivada = false;
	}

	// Nuevo método
	void setAlarma(int hora, int minutos) {
		segundosalarma = hora * 3600 + minutos * 60;
		alarmaActivada = true;
	}

	// Nuevo método
	void activarAlarma(boolean estado) {
		alarmaActivada = estado;
	}

	// Incrementa en un segundo el valor de reloj y chequea la alarma
	// Sobrescribe el método de tictac
	@Override
	public void tictac() {
		segundos++;
		// Mayor 3600 * 24
		if (segundos > 86400)
			segundos = 0;
		if (segundos == segundosalarma && alarmaActivada) {
			JOptionPane.showMessageDialog(null, " ALARMA... " + mostrar());
		}
	}
}
