package aula_oito_de_marco;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner in = new Scanner (System.in);
		 Secundario s = new Secundario ();
		 int e;
		 int f;
		 
		 System.out.println("Digite o primeiro numero");
		 e = in.nextInt();
		 System.out.println("Digite o segundo numero");
		 f = in.nextInt();
		 System.out.println("resultado " +s.Somar(e, f));
		 
	}

}
