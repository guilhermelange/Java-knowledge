package br.com.alura.java_io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteWriteFileWriter {
	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada do arquivo
//		OutputStream fas = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fas);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		//w.write("\r\n");
		bw.newLine();
		bw.write("adjkfhasjk asdjklhfasui asdjklfhjk ");
		
		bw.close();
	}
}
