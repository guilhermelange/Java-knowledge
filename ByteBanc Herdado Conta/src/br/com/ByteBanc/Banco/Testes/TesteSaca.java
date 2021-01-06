package br.com.ByteBanc.Banco.Testes;
import br.com.ByteBanc.Banco.Modelo.*;

public class TesteSaca {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(2222, 3333);
		conta.deposita(200);
		try {
			conta.saca(250);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Saldo Atual: " + conta.getSaldo());
	}
}
