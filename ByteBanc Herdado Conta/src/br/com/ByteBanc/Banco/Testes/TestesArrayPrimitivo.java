package br.com.ByteBanc.Banco.Testes;

import javax.swing.JOptionPane;

public class TestesArrayPrimitivo {
	public static void main(String[] args) {

		int qtdIdade = Integer.valueOf(JOptionPane.showInputDialog("Informa quantas idades você deseja informar"));
		int[] idades = new int[qtdIdade];
		
		
		System.out.println("As idades escolhidas foram: ");
		for(int cont = 0; cont < idades.length; cont++) {
			idades[cont] =  Integer.valueOf(JOptionPane.showInputDialog("Informe o valor da idade " + (cont + 1)));
			System.out.println((cont+1) + "º : " + idades[cont]);
		}
		
	}
}
