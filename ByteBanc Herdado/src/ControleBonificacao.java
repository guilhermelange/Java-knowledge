
public class ControleBonificacao {

	private double soma;
	
//	public void registra(Gerente g) {
//		double boni = g.getBonificacao();	
//		this.soma = this.soma + boni;
//	}
	
	public void registra(Funcionario f) {      //sempre será chamado o metodo do gerente ou editor se for, pois é solicitado ao filho 
		double boni = f.getBonificacao();	
		this.soma = this.soma + boni;
	}
	
//	public void registra(EditorVideo ed) {
//		double boni = ed.getBonificacao();	
//		this.soma = this.soma + boni;
//	}
	
	
	public double getSoma() {
		return soma;
	}
}
