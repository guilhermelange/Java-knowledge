package br.com.ByteBanc.Banco.Modelo;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta;
 * @author Guilherme
 *
 */

public abstract class Conta implements Comparable<Conta>, Serializable{

	// private double saldo;
	protected double saldo;
	private int agencia;
	private int numero;
	// Cliente titular = new Cliente();
	private transient Cliente titular;
	private static int total = 0;

	public Conta(int agencia, int numero) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
	}

	public abstract void deposita(double valor);

//	public void deposita(double valor) {
//		this.saldo += valor;
//	}

//	public void saca(double valor) {
//		if (this.saldo < valor) {
//			throw new SaldoInsuficienteException("\nNão há saldo suficiente para esta operação. \nSaldo: " + this.saldo + "\nValor Sacar: " + valor);
//		} else {
//			this.saldo -= valor;
//		}
//	}

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(
					"\nNão há saldo suficiente para esta operação. \nSaldo: " + this.saldo + "\nValor Sacar: " + valor);
		} else {
			this.saldo -= valor;
		}
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException  {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode valor menor ou igual a 0.");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não permitida agência menor que 0.");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return total;
	}
	
	
	@Override
	public String toString() {
		return "Conta, número " + this.getNumero();
	}
	
	public boolean Igual(Conta conta) {
		if (this.agencia != conta.agencia) {
			return false;
		} 
		
		if (this.numero != conta.numero) {
			return false;
		}
	
		return true;
	}
	
	public boolean equals(Object ref) {
		Conta conta = (Conta) ref;
		if (this.agencia != conta.agencia) {
			return false;
		} 
		
		if (this.numero != conta.numero) {
			return false;
		}
	
		return true;
	}
	
	
	@Override
	public int compareTo(Conta c2) {
		return Double.compare(this.saldo, c2.saldo); 
	}

}