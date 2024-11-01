package ListaLivros;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor; 
    };
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public String toString() {
        return "Livro {" + 
        "titulo= '" + titulo + "\'" +
        ", autor= '" + autor + "\'" +
        ", anoPublicacao= " + anoPublicacao +
        "}";
    }
}




