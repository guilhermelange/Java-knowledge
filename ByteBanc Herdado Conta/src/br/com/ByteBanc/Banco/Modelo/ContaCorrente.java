package br.com.ByteBanc.Banco.Modelo;

import java.io.Serializable;

public class ContaCorrente extends Conta implements Tributavel{

	//private static final long serialVersionUID = 1L;

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valoraSacar = valor + 0.2;
		super.saca(valoraSacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente " + super.toString();
	}

}
