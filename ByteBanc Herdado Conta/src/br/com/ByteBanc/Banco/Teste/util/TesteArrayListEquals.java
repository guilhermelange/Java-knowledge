package br.com.ByteBanc.Banco.Teste.util;
import java.util.*;
import br.com.ByteBanc.Banco.Modelo.Conta;
import br.com.ByteBanc.Banco.Modelo.ContaCorrente;

public class TesteArrayListEquals {
	public static void main(String[] args) {
		//List<String> argumentos = Arrays.asList(args);
		//List<Conta> lista = new ArrayList<Conta>();
		List<Conta> lista = new Vector<Conta>();
		
		Conta cc = new ContaCorrente(2121, 333);
		lista.add(cc);

		Conta cco = new ContaCorrente(222, 456);
		lista.add(cco);

		Conta cco2 = new ContaCorrente(222, 456);
		// lista.add(cco2);

		boolean existe = lista.contains(cco);
		//boolean existe = cc.equals(cco);
		System.out.println("Já existe: " + existe);

		

		for (Conta contas : lista) {
			if (contas.equals(cco2)) {
				System.out.println(contas);	
			}
		}

	}
}
