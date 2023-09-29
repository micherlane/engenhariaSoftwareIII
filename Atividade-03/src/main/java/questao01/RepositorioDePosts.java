package questao01;

import java.io.FileWriter;
import java.io.IOException;

import lombok.Data;

@Data
public class RepositorioDePosts {

    private String filePath;

    RepositorioDePosts(String filePath){
        this.filePath = filePath;
    }

    public void saveToFile(Post post, String fileName) {
        String texto = AdaptadorPostTexto.formatarTextoPost(post);
        escreverTextoArquivo(texto, fileName);      
    }    

    private void escreverTextoArquivo(String texto, String fileName){
         try (FileWriter writer = new FileWriter(this.filePath + "/" + fileName)) {
            writer.write(texto); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
