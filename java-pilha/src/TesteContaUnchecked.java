
public class TesteContaUnchecked {
	public static void main(String[] args) {
		Conta c = new Conta();
		try {
			c.deposita();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
