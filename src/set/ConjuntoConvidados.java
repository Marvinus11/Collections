package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidado> convidadoList;

    public ConjuntoConvidados() {
        convidadoList = new HashSet<>();
    }

    public void addConvidado(String nome, int codigoConvite) {
        convidadoList.add(new Convidado(nome, codigoConvite));
    }

    public void rmConvidadoCod(int codigoConvite) {
        Convidado paraRemover = null;
        for (Convidado conv : convidadoList) {
            if (conv.getCodigoConvite() == codigoConvite){
                paraRemover = conv;
                break;
            }
        }
        convidadoList.remove(paraRemover);
    }

    public int contarConvidados() {
        return convidadoList.size();
    }

    public void printConvidados() {
        for ( Convidado conv : convidadoList ){
            System.out.println(conv.toString());
        }
    }


    public static void main(String[] args) {
        ConjuntoConvidados cjc = new ConjuntoConvidados();
        cjc.addConvidado("Joao", 1);
        cjc.addConvidado("Pedro", 1);
        cjc.printConvidados();
        cjc.rmConvidadoCod(1);
        cjc.printConvidados();
        System.out.println(cjc.contarConvidados());
        cjc.addConvidado("kk", 1);
        System.out.println(cjc.contarConvidados());
        cjc.printConvidados();
        System.out.println("--------------------");
        cjc.printConvidados();


    }
}
