package questao04;

public class ValidacaoCpf implements Validacao{
	private String cpfContribuinte;
	
	ValidacaoCpf(String cpfContribuinte){
		this.cpfContribuinte = cpfContribuinte;
	}

	
	private boolean  validarCpfContribuinte() {
		return cpfContribuinte.length() == 11;
		
	}

	@Override
	public boolean validar() {
		 return !cpfContribuinte.isEmpty() && validarCpfContribuinte();
	}
}
