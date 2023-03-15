package atv01;

public class Secundario {
	public static void tabu (int numero) {
		int i = 0;
		int resposta;
		
		while (i <= 10) {
			resposta = i * numero;
			System.out.println(resposta);
			i++;
		}
	}
}
