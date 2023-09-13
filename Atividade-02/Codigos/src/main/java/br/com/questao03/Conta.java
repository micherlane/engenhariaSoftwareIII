package br.com.questao03;

public class Conta {
	private String numeroConta;
	private double saldo;
	
	public Conta(String numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumeroConta() {
		return numeroConta;
	}	
	
	
}
