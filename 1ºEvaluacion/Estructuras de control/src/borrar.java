
public class borrar {

	public static void main (String args[]) {
		generarHTMLTable(3, 5, "Pepe");
		}


	 static void generarHTMLTable(int filas, int columnas, String contenido) {
		 System.out.println("<table border =1>");
		for (int i = 1; i <= filas; i++) {
			System.out.println("<tr>");
			for (int j = 1; j <= columnas; j++) {
				System.out.println("<td>" + contenido + "</td>");
			}
			System.out.println("</tr>");
		}
		System.out.println("</table>");
	}

}
