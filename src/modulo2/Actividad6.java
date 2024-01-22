package modulo2;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int num;
		do{
			System.out.println("Introduce un numero");
			num = teclado.nextInt();
		}while(num<=0);{
			System.out.println(num);
		}
		teclado.close();

	}

}
