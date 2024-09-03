package org.example;

import java.util.Observable;

public class Tarefa extends Observable {

    private Integer numeroLinhas;
    private String descricao;
    private String nomeTarefa;

    public Tarefa(Integer numeroLinhas, String descricao, String nomeTarefa) {
        this.numeroLinhas = numeroLinhas;
        this.descricao = descricao;
        this.nomeTarefa = nomeTarefa;
    }

    public void alterarTarefa() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "numeroLinhas=" + numeroLinhas +
                ", descricao='" + descricao + '\'' +
                ", nomeTarefa='" + nomeTarefa + '\'' +
                '}';
    }
}
