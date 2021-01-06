package br.com.alura.java_io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteCopyArchive {
	public static void main(String[] args) throws IOException {
		
		Socket s = new Socket();
		
		//Fluxo de entrada do arquivo
		InputStream fils = System.in;		//new FileInputStream("lorem.txt");  // s.getInputStream
		Reader isr = new InputStreamReader(fils);
		BufferedReader br = new BufferedReader(isr);
		
		
		//Fluxo de escrita
		OutputStream fas = System.out;		//new FileOutputStream("lorem2.txt"); //  s.getOutputStream
		Writer osw = new OutputStreamWriter(fas);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
		
		
		bw.close();
		br.close();
	}
}
