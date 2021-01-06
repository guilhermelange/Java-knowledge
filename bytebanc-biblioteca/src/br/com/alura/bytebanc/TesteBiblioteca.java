package br.com.alura.bytebanc;

import br.com.ByteBanc.Banco.Modelo.*;

public class TesteBiblioteca {
	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(2222, 3333);
		c.deposita(200);
		System.out.println(c.getSaldo());
	}
}
