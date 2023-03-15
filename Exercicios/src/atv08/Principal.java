package atv08;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float v, c;
		
		System.out.println("valor de custo");
		c = scan.nextFloat();
		
		System.out.println("valor de vendas");
		v = scan.nextFloat();
		
		System.out.println(Secundario.v_c(c, v));
		scan.close();
	}
}
