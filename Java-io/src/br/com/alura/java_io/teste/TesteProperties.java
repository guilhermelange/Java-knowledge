package br.com.alura.java_io.teste;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class TesteProperties {
	public static void main(String[] args) throws IOException  {
		Properties props = new Properties(); 
		props.setProperty("login", "alura"); 
		props.setProperty("senha", "alurapass");
		props.setProperty("endereco", "www.alura.com.br");
		props.store(new FileWriter("conf.properties"), "Propriedade de Conexão ao DB");
		
		props.load(new FileReader("conf.properties"));
		String login = props.getProperty("login");
		String senha = props.getProperty("senha");
		String endereco = props.getProperty("endereco");
		System.out.println(login + ", " + senha  + ", " +  endereco);
		
	}
}
