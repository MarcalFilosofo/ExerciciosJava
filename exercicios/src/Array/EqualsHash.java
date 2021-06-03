package Array;

public class EqualsHash {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silve";
		u1.email = "pedro.silva@eze.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silve";
		u2.email = "pedro.silva@eze.com.br";

		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
	}
}
