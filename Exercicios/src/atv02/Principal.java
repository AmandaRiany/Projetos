package atv02;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x, y;
		char z;
		
		System.out.println("Insira um valor: ");
		x = scan.nextInt();
		System.out.println("Insira um valor: ");
		y = scan.nextInt();
		System.out.println("Insira a operação: ");
		z = scan.next().charAt(0);
		
		System.out.println(Secundario.operacao(x, y, z));
		
		scan.close();
	}
}
