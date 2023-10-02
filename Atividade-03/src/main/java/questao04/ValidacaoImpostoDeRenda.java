package questao04;

import java.util.List;

public class ValidacaoImpostoDeRenda {
	
	public static boolean validar(String cpfContribuinte, List<Double> rendimentos, List<Double> despesas) {
		boolean cpfEhValido = ValidacaoImpostoDeRenda.validarCpfContribuinte(cpfContribuinte);
		boolean rendimentosEhValido = ValidacaoImpostoDeRenda.validarRendimentos(rendimentos);
		boolean despesasEhValida = ValidacaoImpostoDeRenda.validarDespesas(despesas);
		
		return cpfEhValido && rendimentosEhValido && despesasEhValida;
	}
	
	private static boolean  validarCpfContribuinte(String cpfContribuinte) {
		if(cpfContribuinte.isEmpty() || cpfContribuinte.length() != 11) {
			return false;
		}
			
		return true;
		
	}
	
	private static boolean validarRendimentos(List<Double> rendimentos) {
		if(rendimentos.size() < 5 || verificarValoresNegativos(rendimentos)) {
			return false;
		}
		
		return true;
	}
	
	private static boolean validarDespesas(List<Double> despesas) {
		if(verificarValoresNegativos(despesas)) {
			return false;
		}
		return true;
	}
	
	private static boolean verificarValoresNegativos(List<Double> valores) {
		for(double valor: valores) {
			if(valor < 0) {
				return true;
			}
		}
		
		return false;
	}
}
