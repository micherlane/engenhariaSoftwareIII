package br.com.cardshop;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class ControleDeCartoes {

	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		final ArrayList<CartaoDeCredito> cartoes = new ArrayList<CartaoDeCredito>();
		String formato = "MM/yyyy";
		DateFormat dateFormat = new SimpleDateFormat(formato);
		int senha,opcao = 0,numero;
		String bandeira, titular,val;
		double rendaMensal;
		Date validade;
		boolean x =true;

		while(x) {
			System.out.println("======================================");
			System.out.println("\n1-Cadastro de cartões");
			System.out.println("2-Realizar compra");
			System.out.println("3-Listar todos os cartões");
			System.out.println("4-O valor total de compras e a média de compras por cartão");
			System.out.println("5-Listar cartões vencidos");
			System.out.println("6-Sair");
			System.out.println("Entre com a opção: ");
			opcao = input.nextInt();
			switch(opcao) {
			case 1:{
				System.out.println("Número do cartão: ");
				numero = input.nextInt();
				System.out.println("bandeira: ");
				bandeira = input.next();
				System.out.println("validade: ");
				val = input.next();
				validade = dateFormat.parse(val);
				System.out.println("Titular: ");
				titular = input.next();
				System.out.println("Renda Mensal: ");
				rendaMensal = input.nextDouble();
				System.out.println("Senha: ");
				senha = input.nextInt();

				cartoes.add(new CartaoDeCredito(numero,bandeira,validade,titular,rendaMensal,senha));

				break;
				
			}
			case 2:{
				int num;
				double compra;
				int se;
				System.out.println("Número do cartão: ");
				num = input.nextInt();
				System.out.println("Senha: ");
				se = input.nextInt();
				System.out.println("Valor da compra: ");
				compra = input.nextDouble();
				realizarCompra(cartoes,num,se,compra);
				break;
			}
			case 3:{
				listarCartoes(cartoes);
				break;
			}
			case 4:{
				System.out.println("Valor total de compras:R$ "+CartaoDeCredito.totalCompras);
				Double media;
				media = CartaoDeCredito.totalCompras/CartaoDeCredito.contCartoes;
				System.out.println("Valor médio de compras por cartão:R$ "+media);
				break;
			}
			case 5:{
				listarCartoesVencidos(cartoes);
				break;
			}
			case 6:{
				x = false;
				break;
			}
			}
		}

		input.close();
		System.out.println("Programa finalizado com sucesso!");
		
	}
	
	public static void percorrerListaCartoes(ArrayList<CartaoDeCredito> cartoes, Callback callback) {
		for (CartaoDeCredito cartao : cartoes) {
	        callback.execute(cartao);
	    }
	}

	
	public static void realizarCompra(ArrayList<CartaoDeCredito> cartoes, final int numero, final int senha, final double valor) {
		percorrerListaCartoes(cartoes,  cartao -> {
				if(cartao.getNumero() == numero) {
					System.out.println(cartao.comprar(valor, senha));
				}
			}
		);
	}
	
	
	public static void listarCartoesVencidos(ArrayList<CartaoDeCredito> cartoes) {
		percorrerListaCartoes(cartoes,  cartao -> {
				cartao.mostrarVencido();
			}
		);			
	}
	
	
	public static void listarCartoes(ArrayList<CartaoDeCredito> cartoes) {
		percorrerListaCartoes(cartoes, cartao -> {
				System.out.println("======================================");
				System.out.println("\n"+ cartao);
			}
		);
	}

}