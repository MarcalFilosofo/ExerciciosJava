package fundamentos;

public class ConversaoNumericos {
	public static void main(String[] args) {
		double a = 1;
		System.out.println(a);
		
		float b = (float) 1.123456;
		System.out.println(b);
		
		int c = 128;
		byte d = (byte) c;
		
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;
		System.out.println(f);
	}
}
