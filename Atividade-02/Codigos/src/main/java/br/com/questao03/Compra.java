package br.com.questao03;

public class Compra {
	public static void realizarCompra(Cliente cliente, Produto produto) {
		if(validarCompra(cliente, produto)) {
			return ;
		}
		
		double valorDebito = cliente.getConta().getSaldo() - produto.getValor();
		
		debitarSaldo(cliente, valorDebito);
		
	}
	
	private static boolean validarCompra(Cliente cliente, Produto produto) {
		return cliente.getConta().getSaldo() < produto.getValor();
	}
	
	private static void debitarSaldo(Cliente cliente, double valor) {
		
		cliente.getConta().setSaldo(valor);
	}
}
