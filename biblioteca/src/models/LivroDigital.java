package models;

public class LivroDigital extends Livro {
    private Double tamanhoDoArquivoMB;

    public LivroDigital(String titulo, int anoPublicacao, Autor autor, double tamanhoDoArquivoMB) {
        super(titulo, anoPublicacao, autor);
        this.tamanhoDoArquivoMB = tamanhoDoArquivoMB;
    }

    public double getTamanhoDoArquivoMB() {
        return tamanhoDoArquivoMB;
    }

    public void setTamanhoDoArquivoMB(double tamanhoDoArquivoMB) {
        this.tamanhoDoArquivoMB = tamanhoDoArquivoMB;
    }

    public String exibirDetalhes() {
        return "Livro Digital: " + super.exibirDetalhes() + "Tamanho: " + getTamanhoDoArquivoMB() + "MB";
    }
}
