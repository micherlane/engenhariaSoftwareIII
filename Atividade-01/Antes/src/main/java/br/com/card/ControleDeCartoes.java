package br.com.card;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ControleDeCartoes {

	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		CartaoDeCredito c[] = new CartaoDeCredito[10];
		String formato = "MM/yyyy";
		DateFormat dateFormat = new SimpleDateFormat(formato);
		int indice = 0,senha,opc = 0,numero;
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
			opc = input.nextInt();
			switch(opc) {
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
				c[indice] = new CartaoDeCredito(numero,bandeira,validade,titular,rendaMensal,senha);
				indice++;
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
				RealizarCompra(c,num,se,compra);
				break;
			}
			case 3:{
				ListarCartoes(c);
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
				ListarCartoesVencidos(c);
				break;
			}
			case 6:{
				x = false;
				break;
			}
			}
		}
		System.out.println("Programa finalizado com sucesso!");
		
	}
	public static void RealizarCompra(CartaoDeCredito c[], int numero, int senha, double valor) {
		for(int i=0;i<c.length;i++) {
			if(c[i]!=null) {
				if(c[i].getNumero()==numero) {
					System.out.println(c[i].comprar(valor, senha));
				}
			}
		}
	}
	public static void ListarCartoesVencidos(CartaoDeCredito c[]) {
		Date data = new Date();
		for(int i=0;i<c.length;i++) {
			if(c[i]!=null) {
				Calendar val = Calendar.getInstance();
				Calendar com = Calendar.getInstance();
				val.setTime(c[i].getValidade());
				com.setTime(data);
				long datav = val.getTimeInMillis();
				long datac = com.getTimeInMillis();
				long dif = datav - datac;
				if(dif<0) {
					System.out.println(c[i]);
				}
			}
		}
	}
	public static void ListarCartoes(CartaoDeCredito c[]) {
		for(int i=0;i<c.length;i++){
			if(c[i]!=null) {
				System.out.println("======================================");
				System.out.println("\n"+c[i]);
			}
	}
	}

}