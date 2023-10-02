package questao04;

import java.util.List;

public class ValidacaoImpostoDeRenda {
	
	private List<Validacao> validacoes;
	
	ValidacaoImpostoDeRenda(List<Validacao> validacoes){
		this.validacoes = validacoes;
	}
	
	
	public List<Validacao> getValidacoes() {
		return validacoes;
	}
	

	public boolean validar() {
		 return validacoes.stream().allMatch(Validacao::validar);
	}
}
