package br.com.ByteBanc.Banco.Teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteParseInteger {
	public static void main(String[] args) {
		
		int idade = 29;
		
		Integer idadeRef = Integer.valueOf(29);
		int value = idadeRef.intValue();
		
		String s = args[0];
		//Integer numero = Integer.valueOf(s);
		
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		System.out.println(idadeRef.doubleValue());
		
		
		
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		
		numeros.add(29); //AutoBoxing
		
	
		
	}
}
