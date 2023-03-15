package atv02;

public class Secundario {
	public static double operacao (double x, double y, char z) {
		double resposta = 0;
		
		switch (z) {
		case '-':
			resposta = x - y;
			break;
		case '+':
			resposta = x + y;
			break;
		case '*':
			resposta = x * y;
			break;
		case '/':
			resposta = x / y;
			break;
		}
		return resposta;
	}
}
