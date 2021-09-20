package com.checkpoint;

import java.util.ArrayList;

public class Curso {

    private String nome;
    private double valor;
    private String turno;
    private String nomeSala;

    private ArrayList<Professor> professores;
    private ArrayList<Aluno> alunos;

    public Curso() {
        alunos = new ArrayList<Aluno>();
        professores = new ArrayList<Professor>();
    }

    public void adicionarProfessor(Professor ProfessorNome) {
        professores.add(ProfessorNome);
    }

    public int quantidadeProfessores() {
        return professores.size();
    }

    public void excluirProfessor(Professor professorNome) {
        professores.remove(professorNome);
    }

    public Professor getProfessor(int posicao) {
        return professores.get(posicao);
    }

    public void adicionarAluno(Aluno AlunoNome) {
        alunos.add(AlunoNome);
    }

    public void excluirAluno(Aluno AlunoNome) {
        alunos.remove(AlunoNome);
    }

    public int quantidadeAlunos() {
        return alunos.size();
    }

    public Aluno getAluno(int posicao) {
        return alunos.get(posicao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getNomeSala() {
        return nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }
}
