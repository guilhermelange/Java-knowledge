public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
			} catch (ArithmeticException | NullPointerException | ExceptionManual e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Fim do main");
	}	

	
	private static void metodo1() throws ExceptionManual{
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	//Ideia: O perigo fique explícito na chamada do método.
	private static void metodo2() throws ExceptionManual{  
		System.out.println("Ini do metodo2");
		
		throw new ExceptionManual("Inconsistência");
		
		//System.out.println("Fim do metodo2");
	}
}