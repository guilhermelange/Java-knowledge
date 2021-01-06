package br.com.alura.java_io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("contas.csv"), "UTF-8");
		while (s.hasNextLine()) {
			String linha = s.nextLine();
//			System.out.println(linha);

			Scanner campos = new Scanner(linha);
			campos.useLocale(Locale.US);
			campos.useDelimiter(",");

			String tipoConta = campos.next();
			int agencia = campos.nextInt();
			int numero = campos.nextInt();
			String titular = campos.next();
			double saldo = campos.nextDouble();

//			String valorFormatado = String.format(new Locale("pt","BR"),"%s: %04d-%08d - %s: %05.2f", tipoConta,agencia,numero,titular,saldo);
			System.out.format(new Locale("pt", "BR"), "%s: %04d-%08d - %s: %05.2f %n", tipoConta, agencia, numero,
					titular, saldo);
			campos.close();
//			String[] valores = linha.split(",");
		}

		s.close();
	}
}
