import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> biblioteca = new ArrayList<>();

        Autor autor1 = new Autor("Machado de Assis", "Brasileira");
        Autor autor2 = new Autor("Robert C. Martin", "Americana");
        Autor autor3 = new Autor("J. K. Rowling", "Britânica");
        Autor autor4 = new Autor("George Orwell", "Britânica");

        LivroFisico livro1 = new LivroFisico("Dom Casmurro", 1899, autor1, 256);
        LivroDigital livro2 = new LivroDigital("Clean Code", 2008, autor2, 1.5);
        LivroFisico livro3 = new LivroFisico("Harry Potter", 1997, autor3, 320);
        LivroDigital livro4 = new LivroDigital("1984", 1949, autor4, 2.0);

        biblioteca.add(livro1);
        biblioteca.add(livro2);
        biblioteca.add(livro3);
        biblioteca.add(livro4);

        for (Livro livro : biblioteca) {
            livro.exibirDetalhes();
            System.out.println(); // linha em branco
        }
    }
}
