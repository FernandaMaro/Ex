package modulo2;

import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int num,digitos;
		
		do {
		System.out.println("Introduce un numero entero positivo");
		num=teclado.nextInt();
		
		}while(num<0);{
			digitos = (int)(Math.log10(num)+1);
			System.out.println("El numero tiene "+ digitos+" digitos");
		}
		
		
		
	}
}
