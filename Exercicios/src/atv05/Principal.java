package atv05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		System.out.println("Insira um valor: ");

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		
		System.out.println(Secundario.pareimpar(x));
		System.out.println(Secundario.primo_ou_nao_primo(x));
		scan.close();
	}

}