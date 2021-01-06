
public class Gerente extends Funcionario implements Autenticavel{
	// private String nome; herdado
	// private String cpf;
	// private double salario;
	private AutenticacaoUtil util;
	
//	public double getBonificacao() {
//		return this.getSalario();
//	}

//	public double getBonificacao() {
//		return super.salario;	//apenas para saber que � da classe m�e
//}

//	public double getBonificacao() {
//	return super.getBonificacao() + super.salario;	//apenas para saber que � da classe m�e
//}
	public Gerente() {
		this.util =  new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		return super.getSalario(); // apenas para saber que � da classe m�e
	}
	@Override
	public void setSenha(int senha) { 
		this.util.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}
}
