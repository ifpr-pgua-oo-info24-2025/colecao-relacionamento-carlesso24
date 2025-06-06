package models;

public class Livro {
    private Autor autor;// relacionamento
    private String titulo;
    private Integer anoPublicacao;

    public Livro(String titulo, Integer anoPublicacao, Autor autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String exibirDetalhes() {
        return "Título: " + titulo + ", Ano: " + anoPublicacao + "Autor: " + autor.getNome() + ", Nacionalidade: "
                + autor.getNacionalidade();
    }
}
