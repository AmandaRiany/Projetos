package atv08;

public class Secundario {
	public static String v_c(float c, float v) {
		String x;
		
		if (v > c*1.5) {
			x = "lucro";
		} else {
			x = "prejuízo";
		}
		return x;
	}
}
