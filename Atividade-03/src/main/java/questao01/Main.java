package questao01;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
    	
    	Path caminhoDiretorio = Paths.get("").toAbsolutePath();
    	
        Autor autor = new Autor(0, "L", "l@email.com");

        Post post = new Post(0, "Estou trabalhando", autor);

        RepositorioDePosts repositorio = new RepositorioDePosts(caminhoDiretorio.toString());

        repositorio.saveToFile(post, "post4.txt");
        

    }
}