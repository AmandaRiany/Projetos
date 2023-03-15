package atv07;

public class Secundario {

	public static double salario (double hrs ) {
		double salario;
		
		salario = 12.25*hrs;
		System.out.println(salario);
		
		return salario;
	}
	
	public static void verificacao (double salario) {
		if (salario < 50) {
			System.out.println("ATENÇÃO, DIRIJA-SE Á DIREÇÃO DO HOTEL");
		}
	}
}
