
public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1567, 1563);
		conta.setNumero(1567);
		
		System.out.println(conta.getNumero());
		System.out.println(conta.getSaldo());
		
		
		Cliente guilherme = new Cliente();
		guilherme.setNome("Guilherme Luiz Lange");
		
		conta.setTitular(guilherme);
		System.out.println(conta.getTitular().getNome());
	}
}
