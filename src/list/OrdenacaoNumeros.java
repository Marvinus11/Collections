package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<Integer>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public List<Integer> ordenarCrescente() {
        List<Integer> porCrescente = new ArrayList<>(this.numeros);
        Collections.sort(porCrescente);
        return porCrescente;
    }

    public List<Integer> ordenarDescrescente() {
        List<Integer> porDescrescente = new ArrayList<>(this.numeros);
        porDescrescente.sort(Collections.reverseOrder());
        return porDescrescente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(6);

        System.out.println(numeros.ordenarCrescente());
        System.out.println(numeros.ordenarDescrescente());
    }
}
