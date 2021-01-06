import java.util.Date;
import java.util.Calendar;
import java.util.jar.Attributes;
	

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337,4265);
		
		
		Calendar datahora = Calendar.getInstance();
		System.out.println(datahora.getTime());
		//conta.setAgencia(-50);
		//conta.setNumero(-3113);
		//System.out.println(Conta.getTotal());		
	}
}
