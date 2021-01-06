package br.com.ByteBanc.Banco.Teste.util;

import java.util.ArrayList;

import br.com.ByteBanc.Banco.Modelo.*;
import br.com.ByteBanc.Banco.Modelo.Conta;
import br.com.ByteBanc.Banco.Modelo.ContaCorrente;

public class TesteArrayList {
	public static void main(String[] args) {
		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(2121, 333);
		lista.add(cc);

		// Cliente cco = new Cliente(); //Bloqueado pois o array é <Conta>

		Conta cco = new ContaCorrente(222, 456);
		lista.add(cco);

		System.out.println(lista.size());
		System.out.println(lista.get(1));

		Conta aux = (Conta) lista.get(1);
		lista.remove(1);

		System.out.println(lista.size());

		Conta cc1 = new ContaCorrente(2722, 333574);
		lista.add(cc1);

		Conta cco2 = new ContaCorrente(2245, 33453);
		lista.add(cco2);

//		for(int i = 0; i < lista.size(); i++) {
//			System.out.println(lista.get(i));
//		}

		// for(Object ref : lista) {
		for (Conta contas : lista) {
			System.out.println(contas);
		}

	}
}
