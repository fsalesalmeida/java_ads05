package view;

import java.util.Scanner;
import negocio.Aluno;
import negocio.Aula;

public class Principal {

    public static void main(String[] Args) {
        Scanner leitor = new Scanner (System.in);
        System.out.println("Nome do Professor: ");
        String professor = leitor.nextLine();
        System.out.println("Cod. Disciplina: ");
        String codigoDisciplina = leitor.nextLine();
        System.out.println("Topico da Materia: ");
        String topicoMateria = leitor.nextLine();

        Aula aulaDeTerca = new Aula(professor, codigoDisciplina, topicoMateria);

        System.out.println("Nome de Aluno: ");
        String nomeAluno = leitor.nextLine();
        System.out.println("Matricula do aluno: ");
        String matricula = leitor.nextLine();
        Aluno aluno1 = new Aluno (nomeAluno, matricula);
        aulaDeTerca.inserirAluno(aluno1);

        System.out.print("Nome do aluno: ");
        nomeAluno = leitor.nextLine();
        System.out.print("Matrícula do aluno: ");
        matricula = leitor.nextLine();
        // instancia objeto do tipo Aluno
        Aluno aluno2 = new Aluno(nomeAluno, matricula);
        // insere aluno na aula
        aulaDeTerca.inserirAluno(aluno2);
        
        System.out.println(aulaDeTerca.retornarInfo());
    }
}