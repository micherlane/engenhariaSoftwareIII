package br.com.questao03;

public class Loja {
	public static String realizarCompra(Cliente cliente, Produto produto) {
		Compra compra = new Compra(cliente, produto);
		if(compra.validarCompra() == false) {
			return "Não foi possível realizar a compra.";
		}
		
		double saldoAtualizado = cliente.getConta().getSaldo() - produto.getValor();
		
		;
		
		atualizarSaldo(cliente, saldoAtualizado);
		
		return "Compra realizada com sucesso!";
		
	}
	
	private static void atualizarSaldo(Cliente cliente, double valor) {
		cliente.getConta().setSaldo(valor);
	}
	
}
