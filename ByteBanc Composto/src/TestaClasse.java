
public class TestaClasse {
	public static void main(String[] args) {
		Cliente guilherme = new Cliente();	
		guilherme.cpf = "9503037980";
		guilherme.nome = "Guilherme Luiz Lange";
		guilherme.profissao = "Analista de Sistemas";
		
		Conta contaGuilhermeConta = new Conta();
		contaGuilhermeConta.deposita(1500);
		contaGuilhermeConta.titular = guilherme;
		
		System.out.println(contaGuilhermeConta.titular.nome);
	}
}
