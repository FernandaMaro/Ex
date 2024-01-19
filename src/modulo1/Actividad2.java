package modulo1;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		String nombre, apellido;
		int edad;
		
		System.out.println("Introduce tu nombre:");
		nombre = teclado.nextLine();
		System.out.println("Introduce tu apellido:");
		apellido = teclado.nextLine();
		System.out.println("Introduce tu edad:");
		edad = teclado.nextInt();
		System.out.println("Hola "+nombre+" "+apellido+" tienes "+edad+" años" );
		teclado.close();
	}

}
