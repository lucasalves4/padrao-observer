package org.example;

import java.util.Observable;
import java.util.Observer;

public class Usuario implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void criarTarefa(Tarefa tarefa) {
        tarefa.addObserver(this);
    }

    public void update(Observable tarefa, Object arg1) {
        this.ultimaNotificacao = this.nome + ", alteração realizada na " + tarefa.toString();
        // System.out.println(this.ultimaNotificacao);
    }
}
