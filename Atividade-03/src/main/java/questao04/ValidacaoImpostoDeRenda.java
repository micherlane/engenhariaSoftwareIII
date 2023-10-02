package questao04;

import java.util.List;

public class ValidacaoImpostoDeRenda {
	public static boolean  validar(String cpfContribuinte, List<Double> rendimentos, List<Double> despesas) {
		if(cpfContribuinte.isEmpty() || cpfContribuinte.length() != 11) {
			return false;
		}
		
		if(rendimentos.size() < 5) {
			return false;
		}
		
		if(verificarValoresNegativos(rendimentos) || verificarValoresNegativos(despesas)) {
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
