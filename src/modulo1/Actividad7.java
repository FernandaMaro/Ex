package modulo1;

import java.util.Scanner;

public class Actividad7 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		String palabra1;
		String palabra2;
		System.out.println("Introduce la primera palabra");
		palabra1=teclado.nextLine();
		System.out.println("Introduce la segunda palabra");
		palabra2=teclado.nextLine();
		if (palabra1.equals(palabra2)) {
			System.out.println("Las palabras son iguales");
		}else {
			System.out.println("Las palabras no son iguales");
		}
		teclado.close();
	}
}
