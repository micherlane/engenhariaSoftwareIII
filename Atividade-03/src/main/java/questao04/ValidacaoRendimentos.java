package questao04;

import java.util.List;

public class ValidacaoRendimentos implements Validacao{
	private List<Double> rendimentos;
	
	ValidacaoRendimentos(List<Double> rendimentos){
		this.rendimentos = rendimentos;
	}

	public List<Double> getRendimentos() {
		return rendimentos;
	}

	private boolean verificarMenosCincoInvestimentos() {
		return rendimentos.size() < 5;
	
	}
	
	private boolean verificarValoresNegativos() {
		for(double rendimento: this.rendimentos) {
			if(rendimento < 0) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public boolean validar() {
	
		return verificarMenosCincoInvestimentos() && verificarValoresNegativos();
	}
	
	
}
