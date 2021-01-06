package br.com.ByteBanc.Banco.Testes;

import javax.swing.JOptionPane;

import br.com.ByteBanc.Banco.Modelo.*;

public class TesteArrayReferencias {
	public static void main(String[] args) {
		
		int qtdContas = Integer.valueOf(JOptionPane.showInputDialog("Quantas contas voc� deseja abrir?"));
		//Conta[] contas = new Conta[qtdContas];
		Object[] referencias = new Conta[qtdContas];
		
		for (int cont = 0; cont < referencias.length; cont++) {
			int tipoConta = Integer.valueOf(JOptionPane.showInputDialog(null, (cont+1) + "� Conta: Conta Corrente[1] ou Poupan�a[2] ou Cliente[3]"));
			int numero = Integer.valueOf(JOptionPane.showInputDialog(null, "Informe o n�mero da Conta"));
			int agencia = Integer.valueOf(JOptionPane.showInputDialog(null, "Informe a Ag�ncia"));
			//ContaCorrente cc = new ContaCorrente(agencia, numero);
			if(tipoConta == 1) 
			referencias[cont] = new ContaCorrente(agencia, numero);
			if(tipoConta == 2)  
			referencias[cont] = new ContaPoupanca(agencia, numero);
			else 
			referencias[cont] = new Cliente();
		}
		
		ContaPoupanca cc = (ContaPoupanca) referencias[0]; // S� funcionar� se a primeira for ContaPoupanca mas deixa compilar
		System.out.println(cc.getSaldo());
		
	}
}
