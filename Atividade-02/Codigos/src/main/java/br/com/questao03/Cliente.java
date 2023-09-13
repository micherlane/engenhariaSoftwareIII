package br.com.questao03;

public class Cliente {
	private int id;
	private String nome;
	private String endereco;
	private Conta conta;
	
	public Cliente(int id, String nome, String endereco, Conta conta) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}
	

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
