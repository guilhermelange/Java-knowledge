
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaTeste = new Conta();
		
		contaTeste.titular = new Cliente();
		contaTeste.titular.nome =  "Guilherme";
		System.out.println(contaTeste.titular.nome);
		
	}
}
