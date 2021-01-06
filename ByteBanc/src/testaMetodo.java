
public class testaMetodo {
	public static void main(String[] args) {
		
		Conta contaGuilherme = new Conta();
		contaGuilherme.deposita(50);
	//	contaGuilherme.saca(20);
		boolean conseguiuRetirar = contaGuilherme.saca(20);
		System.out.println(contaGuilherme.saldo);
		
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1500);
		contaMarcela.transfere(500, contaGuilherme);
		
		System.out.println(contaMarcela.saldo);
	}
}
