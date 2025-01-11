package ut01_a01;

import java.util.Scanner;

public abstract class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el nombre del directorio a listar:");
		String directorio = entrada.nextLine();
		VerDir.VerDirectorio(directorio);
	}
}
