package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void deveNotificarUmUsuario() {
        Tarefa tarefa = new Tarefa(500, "Descrição da tarefa 1", "Tarefa 1");
        Usuario usuario = new Usuario("Usuario 1");
        usuario.criarTarefa(tarefa);
        tarefa.alterarTarefa();
        assertEquals("Usuario 1, alteração realizada na Tarefa{numeroLinhas=500, descricao='Descrição da tarefa 1', nomeTarefa='Tarefa 1'}", usuario.getUltimaNotificacao());
    }

    @Test
    void deveNotificarUsuarios() {
        Tarefa tarefa = new Tarefa(650, "Descrição da Tarefa 2", "Tarefa 2");
        Usuario usuario1 = new Usuario("Usuario 1");
        Usuario usuario2 = new Usuario("Usuario 2");
        usuario1.criarTarefa(tarefa);
        usuario2.criarTarefa(tarefa);
        tarefa.alterarTarefa();
        assertEquals("Usuario 1, alteração realizada na Tarefa{numeroLinhas=650, descricao='Descrição da Tarefa 2', nomeTarefa='Tarefa 2'}", usuario1.getUltimaNotificacao());
        assertEquals("Usuario 2, alteração realizada na Tarefa{numeroLinhas=650, descricao='Descrição da Tarefa 2', nomeTarefa='Tarefa 2'}", usuario2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarUsuario() {
        Tarefa tarefa = new Tarefa(400, "Descrição da Tarefa 3", "Tarefa 3");
        Usuario usuario = new Usuario("Usuario 1");
        tarefa.alterarTarefa();
        assertEquals(null, usuario.getUltimaNotificacao());
    }

    @Test
    void deveNotificarUsuarioTarefaA() {
        Tarefa tarefaA = new Tarefa(600, "Descrição da Tarefa 4", "Tarefa 4");
        Tarefa tarefaB = new Tarefa(700, "Descrição da Tarefa 5", "Tarefa 5");
        Usuario aluno1 = new Usuario("Usuario 1");
        Usuario aluno2 = new Usuario("Usuario 2");
        aluno1.criarTarefa(tarefaA);
        aluno2.criarTarefa(tarefaB);
        tarefaA.alterarTarefa();
        assertEquals("Usuario 1, alteração realizada na Tarefa{numeroLinhas=600, descricao='Descrição da Tarefa 4', nomeTarefa='Tarefa 4'}", aluno1.getUltimaNotificacao());
        assertEquals(null, aluno2.getUltimaNotificacao());
    }

}