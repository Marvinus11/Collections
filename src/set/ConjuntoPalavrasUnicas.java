package set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void addPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void rmPalavra(String palavra) {
        palavrasUnicas.remove(palavra);
    }

    public void verificarPalavra() {
        for (String palavra : palavrasUnicas) {
            if (palavra.equalsIgnoreCase(palavra)) {
                System.out.println(palavra + " presente");
            }
        }
    }

    public void exibirPalavra() {
        for (String palavra : palavrasUnicas) {
            System.out.println(palavra);
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conj = new ConjuntoPalavrasUnicas();

        conj.addPalavra("A");
        conj.addPalavra("B");
        conj.addPalavra("C");
        conj.addPalavra("D");
        conj.addPalavra("D");

        System.out.println("_______________");

        conj.exibirPalavra();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConjuntoPalavrasUnicas that = (ConjuntoPalavrasUnicas) o;
        return Objects.equals(palavrasUnicas, that.palavrasUnicas);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(palavrasUnicas);
    }
}


