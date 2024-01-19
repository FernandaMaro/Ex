package modulo2;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un numero:");
		int numero=teclado.nextInt();
		if (numero%2==0) {
			System.out.println("Tu número es divisible entre 2");
		}else {
			System.out.println("\"Tu no número es divisible entre 2\"");
		}
		teclado.close();
	}

}
