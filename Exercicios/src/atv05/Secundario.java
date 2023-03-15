package atv05;

public class Secundario {
	public static String pareimpar (int x) {
	String resultado;
		
	if (x % 2 == 0) {
		resultado = "PAR";

	} else {
		resultado = "ÍMPAR";

	}
	return resultado;
}
	public static String primo_ou_nao_primo (int x) {
	String resultado_2 = null;	
		
	for (int i = 2; i < x; i++) {
		
		if ((x % i) != 0) {
        resultado_2 = "O valor inserido é PRIMO";


		} else {
         resultado_2 = "O valor inserido NÃO É PRIMO";
	

		}

	}
	return resultado_2;

}

}
