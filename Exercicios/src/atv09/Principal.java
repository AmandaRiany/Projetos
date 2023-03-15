package atv09;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.println("digite um número");
		num = scan.nextInt();
		
		
		System.out.println(Secundario.mes(num));
		
		scan.close();
	}
}
