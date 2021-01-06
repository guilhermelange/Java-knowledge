package br.com.alura.java_io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncoding {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "Coç";
		//System.out.println(s.codePointAt(0));
		
		//byte[] bytes = s.getBytes(cchar);
		
		System.out.println("Charset Padrão: " +Charset.defaultCharset() + System.lineSeparator());
		byte[] bytes = s.getBytes("windows-1252");
		System.out.println("windows-1252: " + bytes.length);
		String sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo + System.lineSeparator());
		
		
		bytes = s.getBytes("UTF-16");
		System.out.println("UTF-16: " + bytes.length);
		sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo + System.lineSeparator());
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.println("US_ASCII: " + bytes.length);
	    sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo + System.lineSeparator());
		
		bytes = s.getBytes("UTF-8");
		System.out.println("UTF-8: " + bytes.length);
		sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo + System.lineSeparator());
		

	}
}
