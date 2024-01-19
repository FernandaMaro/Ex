package modulo1;

public class Actividad1 {
	public static void main(String[] args) {
		int inta = 65;
		long longa = (long) inta;
		char chara = (char) inta;
		long longb = 10;
		double doublea = (double) longb;
		int intb = (int) longb;
		char charb = 'A';
		int intc = (int) charb;
		double doubleb = 1.8;
		float floata = (float) doubleb;
		int intd = (int) doubleb;

		System.out.println("Variable inta convertida a long: " + longa);
		System.out.println("Variable inta convertida a char: " + chara);
		System.out.println("Variable longb convertida a double: " + doublea );
		System.out.println("Variable longb convertida a int: " + intb);
		System.out.println("Variable charb convertida a int: " + intc);
		System.out.println("Variable doubleb convertida a float: " + floata);
		System.out.println("Variable doubleb convertida a int: " + intd);

	}

}
