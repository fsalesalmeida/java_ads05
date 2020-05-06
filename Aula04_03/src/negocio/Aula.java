package negocio;

import java.util.ArrayList;

public class Aula {
    private Professor professor;
    private Disciplina disciplina;
    private Materia materia;
    private ArrayList<Aluno> alunos;

    public Aula(String professor, String codigoDisciplina, String topicoMateria) {
        this.professor = new Professor(professor);
        this.disciplina = new Disciplina(codigoDisciplina);
        this.materia = new Materia(topicoMateria);
        this.alunos = new ArrayList<Aluno>();
    }

    public void inserirAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public String retornarInfo() {
        // para percorrer o array
        // comando "foreach" ==> "for (Object o: lst)"

        return "";
    }
}