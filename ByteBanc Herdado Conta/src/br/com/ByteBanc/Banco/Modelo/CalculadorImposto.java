package br.com.ByteBanc.Banco.Modelo;

public class CalculadorImposto {

	private double totalImposto;
	
	public void Registro(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
	
}
