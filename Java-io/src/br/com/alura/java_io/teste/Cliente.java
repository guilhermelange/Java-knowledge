package br.com.alura.java_io.teste;

import java.io.Serializable;

/**
 * Classe que representa um cliente no ByteBanc
 *  
 * 
 * @author Guilherme;
 * @version 0.1;
 */

public class Cliente implements Serializable{
	private static final long serialVersionUID = -3228948143449067177L;
	private String nome;
	private String cpf;
	private String profissao;
	
	
	public String getNomeCpf() {
		return nome + ", " + cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
