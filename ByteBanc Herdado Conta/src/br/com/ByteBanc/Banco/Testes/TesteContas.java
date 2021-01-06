package br.com.ByteBanc.Banco.Testes;
import br.com.ByteBanc.Banco.Modelo.ContaCorrente;
import br.com.ByteBanc.Banco.Especial.*;
import br.com.ByteBanc.Banco.Modelo.ContaPoupanca;
import br.com.ByteBanc.Banco.Modelo.SaldoInsuficienteException;

public class TesteContas {
	public static void main(String[] args) throws SaldoInsuficienteException{
		
		ContaEspecial ce = new ContaEspecial(2222, 3333);
		ce.getSaldo();
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100);
		
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200);
				
		cc.transfere(10, cp);
		System.out.println("Corrente: " + cc.getSaldo());
		System.out.println("Poupança: " + cp.getSaldo());
	}
}
