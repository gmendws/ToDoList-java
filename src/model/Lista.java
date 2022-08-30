package model;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    private List<String> tarefa;

    public Lista(List<String> tarefa) {
        this.tarefa = tarefa;
    }

    public Lista() {}

    public String getTarefa(int opcao) {
        List<String> tarefas = this.tarefa;
        return tarefas.get(opcao);
    }

    public void addTarefa(String tarefa) {
        this.tarefa.add(tarefa);
    }

    public void clearAll() {
        this.tarefa = new ArrayList<>();
    }

    public void getAllList() {
        List<String> tarefas = this.tarefa;
        int i;
        for (i = 0; i < tarefas.size(); i++) {
            System.out.println(i + "- " + tarefas.get(i));
        }
    }

    public void setCheck(int index, String element) {
        this.tarefa.set(index, element);
    }

}
