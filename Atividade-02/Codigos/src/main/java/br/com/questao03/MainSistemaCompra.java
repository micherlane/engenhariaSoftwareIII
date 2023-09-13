package br.com.questao03;

public class MainSistemaCompra {
	
	public static void main(String[] args) {
		Conta conta = new Conta("24330", 1000);
		Produto produto = new Produto("Teclado", "Teclado eletrônico", 455);
		Cliente cliente = new Cliente(24, "Ricardo Ramos", "IFPI", conta );
		
		System.out.println("CLIENTE");
		System.out.println(cliente.getNome());
		System.out.println("Saldo da conta: " +cliente.getConta().getSaldo());
		
		
		System.out.println("\nPRODUTO");
		System.out.println(produto.getNome());
		System.out.println("Valor do produto: " + produto.getValor());
				
		System.out.println("\nCOMPRA");
		System.out.println(cliente.getNome() + " compra produto " + produto.getNome());
		Compra.realizarCompra(cliente, produto);
		
		System.out.println("Saldo do cliente " + cliente.getNome() + " após a compra " + cliente.getConta().getSaldo());
				

	}

}
