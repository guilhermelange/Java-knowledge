
public class TesteFuncionario {
	public static void main(String[] args) {
		Gerente nico = new Gerente();
		nico.setNome("Nico teste");
		nico.setCpf("09503037980");
		nico.setSalario(2500);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}
}
