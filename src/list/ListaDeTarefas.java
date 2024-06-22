package list;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    private List<Tarefa> tarefaList;

    public ListaDeTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasRemover);
        getNumTarefa();

    }

    public int getNumTarefa() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefa() {
        System.out.println(tarefaList);

    }

    public static void main(String[] args) {
        ListaDeTarefas tarefa = new ListaDeTarefas();

        System.out.println(tarefa.getNumTarefa());

        tarefa.adicionarTarefa("Tarefa 1");
        tarefa.adicionarTarefa("Tarefa 2");
        System.out.println(tarefa.getNumTarefa());

        tarefa.removerTarefa("Tarefa 1");

        System.out.println(tarefa.getNumTarefa());

        tarefa.obterDescricoesTarefa();

    }
}
