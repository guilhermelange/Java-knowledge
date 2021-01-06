package br.com.ByteBanc.Banco.Testes;	
import br.com.ByteBanc.Banco.Modelo.*;

public class TesteTributaveis {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100);
		
		SeguroVida sv = new  SeguroVida();
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.Registro(cc);
		calc.Registro(sv);
		
		System.out.println(calc.getTotalImposto());
		
		
	}
}
