package modulo1;

import java.util.Scanner;

public class Actividad11 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		teclado.useDelimiter("\n");
		System.out.println("Introduce una frase:");
		String frase= teclado.next();
		String palabra[] = frase.split(" "); 
		for(int i=0;i<palabra.length;i++){
			System.out.println(palabra[i]);
		}
		
		teclado.close();
	}
}
