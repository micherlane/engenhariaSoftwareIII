package br.com.cardshop;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CartaoDeCredito {
	private int numero;
	private String bandeira ;
	private Date validade;
	private String titular;
	private double rendaMensal;
	private double limiteTotal;
	private double limiteCompras;
	private int senha;
	
	private String formato = "MM/yyyy";
	private DateFormat dateFormat = new SimpleDateFormat(formato);
	
	public static int contCartoes = 0;
	public static double totalCompras = 0;
	
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getRendaMensal() {
		return rendaMensal;
	}
	public void setRendaMensal(double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	public double getLimiteCompras() {
		return limiteCompras;
	}
	public void setLimiteCompras(double limiteCompras) {
		this.limiteCompras = limiteCompras;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getNumero() {
		return numero;
	}
	public String getBandeira() {
		return bandeira;
	}
	
	public CartaoDeCredito(int numero, String bandeira, Date validade, String titular, double rendaMensal, int senha) {
		this.numero = numero;
		this.bandeira = bandeira;
		this.validade = validade;
		this.rendaMensal = rendaMensal;
		this.titular = titular;
		this.limiteTotal = this.rendaMensal * 0.8;
		this.limiteCompras = this.limiteTotal;
		this.senha = senha;
		CartaoDeCredito.contCartoes++;
	}
	
	
	public String toString() {
		return "Número do cartão: "+getNumero()+"\nBandeira: "+
				getBandeira()+"\nValidade: "+dateFormat.format(getValidade())
				+"\ntitular: "+getTitular()+"\nRenda Mensal: "+getRendaMensal()
				+"\nLimite de compras: "+getLimiteCompras()+"\nSenha: "+getSenha();
	}
	
	public String comprar(double valorCompra, int senha) {
		Date data = new Date();
		
		if(calcularDiferencaData(data)<0) {
			return "A compra não pode ser concluída, pois o cartão está vencido";
		}
		
		if(valorCompra >= getLimiteCompras() || senha != getSenha()) {
				return "Compra não concluída";
		}
		
		CartaoDeCredito.totalCompras += valorCompra;
		return "Compra realizada com sucesso!";
			
	}
	
	public boolean estahVencido() {
		Date data = new Date();
		if(this.calcularDiferencaData(data) < 0) {
			return true;
		}
		return false;
	}
	
	public void mostrarVencido() {
		if(this.estahVencido()){
			System.out.println(this);
		}
	}
			
	public long calcularDiferencaData(Date data) {
		Calendar val = Calendar.getInstance();
		Calendar com = Calendar.getInstance();
		val.setTime(getValidade());
		com.setTime(data);
		long datav = val.getTimeInMillis();
		long datac = com.getTimeInMillis();
		long dif = datav - datac;
		return dif;
	    }
	}