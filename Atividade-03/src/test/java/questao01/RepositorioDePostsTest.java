package questao01;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.nio.file.Paths;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class RepositorioDePostsTest {
	private static final String NOME_ARQUIVO = "post4.txt";
    private static final String CAMINHO_DIRETORIO = Paths.get("").toAbsolutePath().toString();

	@Test
	void testSaveToFile() {
		    	
		Autor autor = new Autor(10, "L", "l@email.com");
		
		Post post = new Post(110, "Os números são bastante utilizados para fazer a contagem de quantidades como a quantidade de algo ou mesmo o valor monetário. Entretanto, quando estes números são usados para quantificar a quantidade de mortes por algum desastre, eles trazem um grande distanciamento. ", autor);
		
		RepositorioDePosts repositorio = new RepositorioDePosts(CAMINHO_DIRETORIO.toString());
		
		repositorio.saveToFile(post, NOME_ARQUIVO );
		
		
		// Verifica se o arquivo foi criado
		
		File arquivo = new File(CAMINHO_DIRETORIO + "/" + NOME_ARQUIVO);
		
		assertTrue(arquivo.exists(),"O arquivo do post não foi criado com sucesso.");		
		
	}

	@AfterEach
	void limparArquivo() {
        File arquivo = new File(CAMINHO_DIRETORIO + "/" + NOME_ARQUIVO);
        if(arquivo.exists()) {
        	arquivo.delete();
        }
	}
}
