package questao04;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class ValidacaoImpostoDeRendaTest {
	private static final String CPF_CONTRIBUINTE = "12345678911";
	private static final List<Double> RENDIMENTOS = Arrays.asList(1.0, 2.0, 3.0, 4.0, 6.0);
	private static final List<Double> DESPESAS =  Arrays.asList(1.0, 2.0, 3.0, 4.0);
	
	@Test
	void testValidar() {
		boolean ehValido = ValidacaoImpostoDeRenda.validar(CPF_CONTRIBUINTE, RENDIMENTOS, DESPESAS);
		boolean resultadoEsperado = true;
		
		assertEquals(resultadoEsperado, ehValido, "A validação apresentou um valor resultado incorreto");
	}

}
