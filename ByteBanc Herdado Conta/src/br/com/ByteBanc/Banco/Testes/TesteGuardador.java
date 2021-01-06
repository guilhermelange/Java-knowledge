package br.com.ByteBanc.Banco.Testes;

import br.com.ByteBanc.Banco.Modelo.Conta;
import br.com.ByteBanc.Banco.Modelo.ContaCorrente;
import br.com.ByteBanc.Banco.Modelo.GuardadorDeReferencias;

public class TesteGuardador {
	public static void main(String[] args) {
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		Conta cc = new ContaCorrente(222,333);
		guardador.adiciona(cc);
		
		Conta cco = new ContaCorrente(222,333);
		guardador.adiciona(cco);
		
		
		int tamanho = guardador.getQuantidadeElementos();
		System.out.println(tamanho);
		
		
		Conta contaRef = (Conta) guardador.getReferencia(0); 
		System.out.println(contaRef.getAgencia()); 
	}
}
