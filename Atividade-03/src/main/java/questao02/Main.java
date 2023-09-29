package questao02;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		OperacaoSomar somar = new OperacaoSomar();
		OperacaoDividir dividir = new OperacaoDividir();
		OperacaoMultiplicar multiplicar = new OperacaoMultiplicar();
		OperacaoSubtrair subtrair = new OperacaoSubtrair();
		
		List<Operacao> operacoes = new ArrayList<>();
		
		operacoes.add(subtrair);
		operacoes.add(multiplicar);
		operacoes.add(dividir);
		operacoes.add(somar);
		
		Calculadora calculadora = new Calculadora(100, 20);
		
		List<Double> resultado = calculadora.calcular(operacoes);	
		
		System.out.println(resultado);

	}

}
