package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (ºF - 32) * 5/9 = ºC
		final double cincoPorNove = 5 / 9.0;
		final double trintaEDois = 32;
		double F = 160;
		double C = (F - trintaEDois) * cincoPorNove;
		System.out.println(C);
	}
}
