package list;

import list.Item;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private final List<Item> item;

    public CarrinhoDeCompras() {
        this.item = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        item.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> removerItem = new ArrayList<>();
        for (Item item : item) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                removerItem.add(item);
            }
        }
        item.removeAll(removerItem);
    }

    public double calcularTotal() {
        double total = 0;
        for (Item item : item) {
            double novoPreco = item.getPreco() * item.getQuantidade();
            total += novoPreco;
        }

        return total;
    }

    public void exibirItems() {
        for (Item item : item) {
            System.out.println(item.toString());
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carro = new CarrinhoDeCompras();
        carro.adicionarItem("arroz", 10.0, 2);
        carro.exibirItems();
        carro.removerItem("arroz");
        carro.adicionarItem("Feijão", 21.50, 3);
        carro.adicionarItem("Arroz", 19.50, 4);
        carro.exibirItems();
        System.out.println(carro.calcularTotal());
    }
}
