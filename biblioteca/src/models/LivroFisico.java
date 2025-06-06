package models;

public class LivroFisico extends Livro {
    private Integer numeroDePaginas;

    public LivroFisico(String titulo, int anoPublicacao, Autor autor, int numeroDePaginas) {
        super(titulo, anoPublicacao, autor);
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String exibirDetalhes() {
        return "Livro Físico: " + super.exibirDetalhes() + "Páginas: " + getNumeroDePaginas();
    }
}
