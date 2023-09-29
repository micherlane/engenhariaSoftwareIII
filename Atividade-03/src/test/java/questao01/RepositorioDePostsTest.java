package questao01;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

class RepositorioDePostsTest {

	@Test
	void testSaveToFile() {
		Path caminhoDiretorio = Paths.get("").toAbsolutePath();
		String nomeArquivo = "post4.txt";
		    	
		Autor autor = new Autor(10, "L", "l@email.com");
		
		Post post = new Post(110, "Os números são bastante utilizados para fazer a contagem de quantidades como a quantidade de algo ou mesmo o valor monetário. Entretanto, quando estes números são usados para quantificar a quantidade de mortes por algum desastre, eles trazem um grande distanciamento. ", autor);
		
		RepositorioDePosts repositorio = new RepositorioDePosts(caminhoDiretorio.toString());
		
		repositorio.saveToFile(post, nomeArquivo );
		
		try {
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
