public class FluxoComError {

	public static void main(String[] args){
		System.out.println("Ini do main");
		try {
			metodo1();

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

	private static void metodo2() {
		//metodo2();
	}
}