package questao01;

import java.time.LocalDate;

public class Post {
    private int id;
    private String texto;
    private Autor autor;
    private LocalDate data;
    private int quantidadeDeLikes;

    public Post(int id, String texto, Autor autor) {
        this.id = id;
        this.texto = texto;
        this.autor = autor;
        this.data = LocalDate.now();
        this.quantidadeDeLikes = 0;
    }

    public int getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public Autor getAutor() {
        return autor;
    }

    public LocalDate getData() {
        return this.data;
    }

    public int getQuantidadeDeLikes() {
        return quantidadeDeLikes;
    }


}
