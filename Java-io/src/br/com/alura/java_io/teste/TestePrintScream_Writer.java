package br.com.alura.java_io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TestePrintScream_Writer {
	public static void main(String[] args) throws IOException {
//		PrintStream ps = new PrintStream("lorem2.txt");

		PrintWriter ps = new PrintWriter("lorem2.txt", "UTF-8");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.print("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");

		ps.close();
	}
}
