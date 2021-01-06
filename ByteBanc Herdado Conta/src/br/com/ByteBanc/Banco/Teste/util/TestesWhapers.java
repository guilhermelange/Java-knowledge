package br.com.ByteBanc.Banco.Teste.util;

import java.util.ArrayList;
import java.util.List;

public class TestesWhapers {
	public static void main(String[] args) {
		Integer idadeRef = Integer.valueOf(29);
		int value = idadeRef.intValue();
		
		//Double dRef = 3.4;
		Double dRef = Double.valueOf(3.4); 		//Autoboxing
		System.out.println(dRef.doubleValue());	   //Unboxing
		
		Number numero = Float.valueOf(15.6f);
		
		List<Number> lista = new ArrayList<Number>();
		lista.add(32.5);
		lista.add(45.6f);
	}
}
