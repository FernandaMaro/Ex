package modulo1;

import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	final double iva= 0.21;
	System.out.println("Ingresa el precio de un producto:");
	double precio= teclado.nextDouble();
	double totalIva= precio*iva;
	System.out.println("El total del iva es: "+ totalIva);
	teclado.close();
	}

}
