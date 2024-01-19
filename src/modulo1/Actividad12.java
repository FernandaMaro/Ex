package modulo1;

import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce el primer numero:");
		int numero1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero:");
		int numero2 = teclado.nextInt();
		
		System.out.println("La suma de "+ numero1+" y "+numero2+" es "+(numero1+numero2));
		teclado.close();

	}

}
