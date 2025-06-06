import java.util.ArrayList;

import models.Livro;
import models.Autor;
import models.LivroFisico;
import models.LivroDigital;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Livro> biblioteca = new ArrayList<>();

        Autor autor1 = new Autor("j.k rolling", "britânica");
        Autor autor2 = new Autor("j.k rolling", "britânica");
        Autor autor3 = new Autor("j.k rolling", "britânica");
        Autor autor4 = new Autor("j.k rolling", "britânica");

        LivroFisico fisico1 = new LivroFisico("Harry Potter1", 1997, autor1, 256);
        LivroDigital digital1 = new LivroDigital("Harry Potter2", 1998, autor2, 1.5);
        LivroFisico fisico2 = new LivroFisico("Harry Potter3", 1999, autor3, 320);
        LivroDigital digital2 = new LivroDigital("Harry Potter4", 2000, autor4, 2.0);

        biblioteca.add(fisico1);
        biblioteca.add(digital1);
        biblioteca.add(fisico2);
        biblioteca.add(digital2);

        for (Livro livro : biblioteca) {
            livro.exibirDetalhes();
            System.out.println();
        }
    }
}
