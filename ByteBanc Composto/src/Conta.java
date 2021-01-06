public class Conta {

	private double saldo = 100;
	int agencia;
	int numero;
	// Cliente titular = new Cliente();
	Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;
		// this.saldo (fica implícito)
	}

	public boolean saca(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;

	}

	public double getSaldo() {
		return this.saldo;
	}

}