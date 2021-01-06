package br.com.alura.java_io.teste;

import java.beans.beancontext.BeanContext;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteWrite {
	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada do arquivo
		OutputStream fas = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fas);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		//bw.newLine();
		bw.newLine();
		bw.write("adjkfhasjk asdjklhfasui asdjklfhjk ");
		
		bw.close();
	}
}
