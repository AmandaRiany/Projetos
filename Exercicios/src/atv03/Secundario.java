package atv03;

public class Secundario {
	public static void fibona () {
		int a = 0, b = 1;
		
		for (int i = 0; i < 11; i++) {
			b = b + a;
			a = b - a;
			
			System.out.println(b);
		}
	}
}
