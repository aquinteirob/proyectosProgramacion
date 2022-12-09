package casosAvanazdos;

import java.util.Scanner;

public class basicos {

	public static void main(String[] args) {

	}

	public static int numericos (String texto) {
		int numero;
		Scanner lector=new Scanner(System.in);
		System.out.println(texto);
		numero=lector.nextInt();
		lector.nextLine();
		return numero;
	}
	
	public static String caracteres(String texto) {
		String caracter;
		Scanner lector=new Scanner(System.in);
		System.out.println(texto);
		caracter=lector.nextLine();
		return caracter;
	}
	
	/*public static String[] meses(int a) {
		String[] meses= {"Enero", "Febrero","Marzo","Abril", "Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		for (int i=0;i<12;i++) {
			System.out.println(meses[i]);
		}
		return meses;
	}*/
}
