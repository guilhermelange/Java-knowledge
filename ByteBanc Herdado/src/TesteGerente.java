
public class TesteGerente {
	public static void main(String[] args) {
		//S� consegue autenticar se referenciarmos Autentic�vel
		Autenticavel referencia = new Gerente();
		
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setCpf("2624654560");
		g1.setSalario(5000);
		g1.setSenha(3123);
		
		boolean autentica = g1.autentica(3123);
		System.out.println(autentica);
		System.out.println("Bonifica��o de: " + g1.getBonificacao());
	}
}
