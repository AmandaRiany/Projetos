package atv04;

public class Secundario {
	
	public static int metodo_1 () {
		int soma = 0;
		
		for (int i = 0; i <= 30; i++) {
			if (i%2 != 0) {
				soma = soma + i;
			}
		}
		return soma;
	}
	public static int metodo_2 () {
		int multiplicar = 0;
		
		for (int i = 0; i <= 30; i++) {
			if (i%2 == 0) {
				multiplicar = multiplicar * i;
			}
		}
		return multiplicar;
	}
	
	
}
