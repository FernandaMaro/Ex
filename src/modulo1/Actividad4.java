package modulo1;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduce un numero:");
	String valor=teclado.next();
	int numero= Integer.parseInt(valor);
	char ascii = (char) numero;
	System.out.println("El carácter ASCII es:" + ascii);
	teclado.close();

	}

}
