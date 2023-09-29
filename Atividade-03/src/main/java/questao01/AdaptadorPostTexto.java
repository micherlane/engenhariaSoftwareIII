package questao01;

public class AdaptadorPostTexto {
    public static String formatarTextoPost(Post post){
        return  "ID: "     + post.getId()                              + "\n" +
                "Texto: "  + post.getTexto()                           + "\n" +
                "Autor: "  + post.getAutor().getNome()                 + "\n" +
                "Data: "   + post.getData()                            + "\n" +
                "Quantidade de Likes: " + post.getQuantidadeDeLikes()  + "\n" ;
    }
}
