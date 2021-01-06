package br.com.ByteBanc.Banco.Testes;

import br.com.ByteBanc.Banco.Modelo.*;
import br.com.ByteBanc.Banco.Modelo.ContaCorrente;
import br.com.ByteBanc.Banco.Modelo.ContaPoupanca;

public class TesteArrayList {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(22, 333);
		ContaPoupanca cp = new ContaPoupanca(33 , 22);
		//println(cc);	
		
		System.out.println(cc.toString());
	}	
	
	static void println(Object referencia) {
		
	}
}
