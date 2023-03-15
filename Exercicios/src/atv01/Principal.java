package atv01;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Insira um valor: ");
		numero = scan.nextInt();
		
		Secundario.tabu(numero);
		
		scan.close();
	}
}
