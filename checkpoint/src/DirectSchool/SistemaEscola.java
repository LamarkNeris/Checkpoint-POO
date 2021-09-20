package DirectSchool;

import com.checkpoint.Aluno;
import com.checkpoint.Curso;
import com.checkpoint.Endereco;
import com.checkpoint.Professor;

public class SistemaEscola {

    public static void main(String[] args) {

        //Adicionando Alunos
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Marcos");
        aluno1.setNumeroMatricula(01);


        Aluno aluno2 = new Aluno();
        aluno2.setNome("Paula");
        aluno2.setNumeroMatricula(02);

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Jonas");
        aluno3.setNumeroMatricula(03);

        //Adicionando cursos
        Curso curso1 = new Curso();
        curso1.setNome("Inglês");
        curso1.setValor(700.00);

        Curso curso2 = new Curso();
        curso2.setNome("Administração");
        curso2.setValor(850.00);

        Curso curso3 = new Curso();
        curso3.setNome("Informática");
        curso3.setValor(800.00);

        //Adicionando alunos nos cursos
        aluno1.adicionarCurso(curso1);
        curso1.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno1);
        aluno1.adicionarCurso(curso2);

        aluno2.adicionarCurso(curso1);
        curso1.adicionarAluno(aluno2);

        aluno3.adicionarCurso(curso1);
        aluno3.adicionarCurso(curso2);
        aluno3.adicionarCurso(curso3);
        curso1.adicionarAluno(aluno3);
        curso2.adicionarAluno(aluno3);
        curso3.adicionarAluno(aluno3);


        //Criando Professores
        Professor professor1 = new Professor();
        professor1.setFormacao("GRADUADO");
        professor1.setNome("José");
        professor1.setValorHora(30.00);
        professor1.adicionarCurso(curso1);
        curso1.adicionarProfessor(professor1);

        Professor professor2 = new Professor();
        professor2.setFormacao("PÓS-GRADUADO");
        professor2.setNome("Juliana");
        professor2.setValorHora(40.00);
        professor2.adicionarCurso(curso2);
        curso2.adicionarProfessor(professor2);



        //Testando
        System.out.println(aluno1.getNome() + " " + aluno1.getNumeroMatricula() + " " + aluno1.getCurso(0).getNome());



        System.out.println("Alunos do curso de: " + curso2.getNome());
        for (int i = 0; i < curso1.quantidadeAlunos(); i++) {
            System.out.println(curso1.getAluno(i).getNome());
        }



    }

}
