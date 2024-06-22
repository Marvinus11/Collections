package set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> contatoList;

    public AgendaContatos() {
        contatoList = new HashSet<>();
    }

    public void addContato(String nome, int telefone) {
        contatoList.add(new Contato(nome, telefone));
    }

    public void exibirContatos() {
        for ( Contato c : contatoList) {
            System.out.println(c);
        }
    }

    public Set<Contato> porNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for ( Contato c : contatoList) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atContatos(String nome, int novoTel) {
        Contato contAtual = null;
        for ( Contato c : contatoList) {
            if (c.getNome().equals(nome)) {
                c.setNumero(novoTel);
                contAtual = c;
                break;
            }
        }
        return contAtual;
    }
}
