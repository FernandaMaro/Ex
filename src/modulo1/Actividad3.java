package modulo1;

import java.util.Scanner;

public class Actividad3 {
	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	final double pi= Math.PI;
	System.out.println("Introduce el radio:");
	String radioTeclado= teclado.nextLine();
	double radio = Double.parseDouble(radioTeclado);
	double area= pi* Math.pow(radio, 2);
	 System.out.println("El área del círculo con radio " + radio + " es: " + area);
	 teclado.close();
	}

}
