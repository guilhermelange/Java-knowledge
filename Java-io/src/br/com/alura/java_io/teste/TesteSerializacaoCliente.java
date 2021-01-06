package br.com.alura.java_io.teste;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacaoCliente {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		String nome = "Guilherme Lange";
		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oos.writeObject(nome);
//		oos.close();
		
		ObjectInputStream ios = new ObjectInputStream(new FileInputStream("objeto.bin"));	
		String nome = (String) ios.readObject();
		ios.close();
		System.out.println(nome);
		
	}
}
