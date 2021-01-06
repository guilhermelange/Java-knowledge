package br.com.ByteBanc.Banco.Testes;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import br.com.ByteBanc.Banco.Modelo.Conta;

public class TesteFormatacaoArredondamento {
	public static void main(String[] args) {
		double val1 = 9.25;
		double val2 = 4.25;
		double val3 = 3.235;
		
		Arredondamento Arredondar = new Arredondamento();
		double media = (val1 + val2 +val3 ) / 3;
		//String valCorreto = Arredondar.arredonda(media);
		String valCorreto = Arredondamentov2(media);
		System.out.println("média Original: " +media);
		System.out.println("Média Formatada: " + valCorreto);
		
		String cpf = formataDados("095.030.379-80");
		System.out.println(cpf);
		
		
	}
	
	public static String formataDados(String dados) {
		return dados.replaceAll("[^0-9]+", "");
	}
	
	public static String Arredondamentov2(double val) {
		DecimalFormat df = new DecimalFormat("0.00");
	   df.setRoundingMode(RoundingMode.HALF_UP);
	   return df.format(val);
	}
}


class Arredondamento {
	
	public String arredonda(double val) {
	   DecimalFormat df = new DecimalFormat("0.00");
	   df.setRoundingMode(RoundingMode.HALF_UP);
	   return df.format(val);
	}
}

