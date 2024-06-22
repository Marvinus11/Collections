package list;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numero;

    public SomaNumeros() {
        this.numero = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numero.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer num : this.numero) {
            soma += num;
        }
        return soma;
    }

    public int encontrarMaior() {
        int maior = 0;
        for (Integer num : this.numero) {
            if(num > maior) {
                maior = num;
            }
        }
        return maior;
    }

    public int encontrarMenor() {
        int menor = 0;
        for (Integer num : this.numero) {
            if(num < menor) {
                menor = num;
            }
        }
        return menor + 1;
    }

    public void exibirNumeros() {
        for (Integer num : this.numero) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        SomaNumeros num = new SomaNumeros();

        num.adicionarNumero(2);
        num.adicionarNumero(2);
        num.adicionarNumero(3);
        num.adicionarNumero(4);
        num.adicionarNumero(5);


        System.out.println(num.calcularSoma());
        System.out.println(num.encontrarMaior());
        System.out.println(num.encontrarMenor());
        num.exibirNumeros();

    }
}
