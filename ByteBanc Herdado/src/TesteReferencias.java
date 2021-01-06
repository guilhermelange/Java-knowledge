
public class TesteReferencias {	
	public static void main(String[] args) {
		//Gerente g1 = new Gerente();
		Gerente g1 = new Gerente();
		g1.setNome("Guilherme");
		g1.setSalario(5000);
		String nome = g1.getNome();
		
//		Funcionario f1 = new Funcionario();
//		f1.setNome("Teste");
//		f1.setSalario(1200);
		
		EditorVideo ed1 = new EditorVideo();
		ed1.setSalario(1800);
		
		Designer d1 = new Designer();
		d1.setSalario(2000);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g1);	
	//	controle.registra(f1);
		controle.registra(ed1);
		controle.registra(d1);
		
		
		System.out.println(nome);
		
		
		System.out.println(controle.getSoma());
	}
}
