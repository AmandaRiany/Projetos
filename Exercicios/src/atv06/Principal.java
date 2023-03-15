package atv06;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		double hrs;
		
		System.out.println("Digite as Horas");
		hrs = scan.nextFloat();
		
		System.out.println(Secundario.salario(hrs));
		scan.close();
	}
}
