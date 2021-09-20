package com.checkpoint;

import java.util.ArrayList;

public class Aluno extends Pessoa {

    private int numeroMatricula;

    private ArrayList<Curso> cursos;

    public Aluno() {
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

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
}
