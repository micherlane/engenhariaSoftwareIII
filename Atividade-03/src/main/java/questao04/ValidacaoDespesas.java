package questao04;

import java.util.List;

public class ValidacaoDespesas implements Validacao{
	private List<Double> despesas;
	
	ValidacaoDespesas(List<Double> despesas) {
		this.despesas = despesas;
	}

	public List<Double> getDespesas() {
		return despesas;
	}
	
	
	private boolean verificarValoresNegativosDespesas() {
		for(double despesa: this.despesas) {
			if(despesa < 0) {
				return false;
			}
		}
		
		return true;
	}

	@Override
	public boolean validar() {
		return verificarValoresNegativosDespesas();
	}
}
