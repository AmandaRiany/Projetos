package atv07;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double hrs, salario;
		
		System.out.println("horas trabalhadas");
	    hrs = scan.nextFloat();
	    
	    System.out.println(Secundario.salario(hrs));
	    
	    salario = Secundario.salario(hrs);
	    
	    Secundario.verificacao(salario);
	    
	    scan.close();
	}
}
