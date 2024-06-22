package list;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<Livro>();
    }

    public void adicionarLivro(String titulo, String autor, int ano) {
        livroList.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        for (Livro livro : livroList) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(livro);
            };
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarIntervaloAnos(int dataInicial, int dataFinal) {
        List<Livro> livrosIntervaloAnos = new ArrayList<>();

        for (Livro livro : livroList) {
            if (livro.getAnoDePublicacao() >= dataInicial && livro.getAnoDePublicacao() <= dataFinal) {
                livrosIntervaloAnos.add(livro);
            }
        }
        return livrosIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livrosPorTitulo = null;
        for (Livro livro : livroList) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livrosPorTitulo = livro;
            };
        }
        return livrosPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros livros = new CatalogoLivros();
        livros.adicionarLivro("HP","Jk", 1999);
        livros.adicionarLivro("HP","Jk", 2000);
        livros.pesquisarPorAutor("JK");
        System.out.println(livros.pesquisarIntervaloAnos(1999, 2000));
        System.out.println(livros.pesquisarPorTitulo("HP"));
    }
}
