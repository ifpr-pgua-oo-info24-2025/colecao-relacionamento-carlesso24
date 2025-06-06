package models;

public class LivroDigital extends Livro {
    private Double tamanhoDoArquivoMB;

    public LivroDigital(String titulo, int anoPublicacao, Autor autor, double tamanhoDoArquivoMB) {
        super(titulo, anoPublicacao, autor);
        this.tamanhoDoArquivoMB = tamanhoDoArquivoMB;
    }

}
