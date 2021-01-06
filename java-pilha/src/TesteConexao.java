
public class TesteConexao {
	public static void main(String[] args)  {

		
		
		try (Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch (Exception e) {
			System.out.println("Inconsistências: " + e.getMessage());
		}
		
		//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (Exception e) {
//			System.out.println("Inconsistências: " + e.getMessage());
//		} finally {
//			if (con != null) {
//				con.fecha();
//			}
//		}

//		try {
//			con = new Conexao();
//			con.leDados();
//		} finally {
//			con.fecha();
//		}
	}
}
