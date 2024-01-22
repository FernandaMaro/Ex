package modulo2;

import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un día de la semana");
		String dia = teclado.nextLine();
		switch (dia) {
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			System.out.println("Es día laboral");
			break;
		case "sabado":
		case "domingo":
			System.out.println("No es día laboral");
			break;
		default:
			System.out.println("Introduce un día valido");
			break;
		}
		teclado.close();

	}

}
