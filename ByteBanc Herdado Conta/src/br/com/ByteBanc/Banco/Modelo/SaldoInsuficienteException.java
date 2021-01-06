package br.com.ByteBanc.Banco.Modelo;
public class SaldoInsuficienteException extends Exception{

	private static final long serialVersionUID = 9161964833393793322L;

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
	
}
