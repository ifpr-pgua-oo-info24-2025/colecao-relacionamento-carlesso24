package models;

public class LivroFisico extends Livro {
    private Integer numeroDePaginas;

    public LivroFisico(String titulo, int anoPublicacao, Autor autor, int numeroDePaginas) {
        super(titulo, anoPublicacao, autor);
        this.numeroDePaginas = numeroDePaginas;
    }

}
