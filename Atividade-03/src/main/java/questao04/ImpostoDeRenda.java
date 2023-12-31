package questao04;

import java.util.List;

public class ImpostoDeRenda {

  private String cpfContribuinte;
  private List<Double> rendimentos;
  private List<Double> despesas;

  public ImpostoDeRenda(
    String cpfContribuinte,
    List<Double> rendimentos,
    List<Double> despesas
  ) {
    this.cpfContribuinte = cpfContribuinte;
    this.rendimentos = rendimentos;
    this.despesas = despesas;
  }

	public String getCpfContribuinte() {
		return cpfContribuinte;
	}
	
	public List<Double> getRendimentos() {
		return rendimentos;
	}
	
	public List<Double> getDespesas() {
		return despesas;
	}
	
	public void processar(List<Validacao> validacoes, CalculadoraImpostoDeRenda calculadora, RelatorioImpostoRenda relatorioImpostoDeRenda) {		
		ValidacaoImpostoDeRenda validacaoImpostoDeRenda = new ValidacaoImpostoDeRenda(validacoes);
		
		if(validacaoImpostoDeRenda.validar()) {
			double impostoDevido =  calculadora.calcularImposto(rendimentos, despesas);
			
			relatorioImpostoDeRenda.gerarRelatorio(this, impostoDevido);
		}
		
	}
  
}
