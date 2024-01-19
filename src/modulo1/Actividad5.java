package modulo1;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un cáracter:");
		String valor=teclado.next();
		char numero= valor.charAt(0);
		int asciiCode = (int) numero;
		System.out.println("El codigo ASCII es:" + asciiCode);
		teclado.close();

	}
}
