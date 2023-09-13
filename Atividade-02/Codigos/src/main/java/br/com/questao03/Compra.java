package br.com.questao03;

public class Compra {
	private Cliente cliente;
	private Produto produto;
	
	
	public Compra(Cliente cliente, Produto produto) {
		super();
		this.cliente = cliente;
		this.produto = produto;
	}

	
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public boolean validarCompra() {
		return cliente.getConta().getSaldo() >= produto.getValor();
	}
	

}
