package br.com.alura.java_io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {
	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada do arquivo
		InputStream fils = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fils, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println("Linha: " + linha);
			//System.out.println(linha.substring(linha.indexOf(" ") != 0 ? linha.indexOf(" ") : 1));
			linha = br.readLine();
		}
		
		br.close();
	}
}
