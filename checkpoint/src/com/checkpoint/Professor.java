package com.checkpoint;

import java.util.ArrayList;

public class Professor extends Pessoa {

    private double valorHora;
    private String formacao;

    private ArrayList<Curso> cursos;

    public Professor() {
        cursos = new ArrayList<Curso>();
    }

    public void adicionarCurso(Curso cursoNome) {
        cursos.add(cursoNome);
    }

    public void excluirCurso(Curso cursoNome) {
        cursos.remove(cursoNome);
    }

    public Curso getCurso(int posicao) {
        return cursos.get(posicao);
    }

    public int quantidadeCursos() {
        return cursos.size();
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
