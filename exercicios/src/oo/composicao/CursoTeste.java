package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Guilherme");
		Aluno aluno2 = new Aluno("Gabriel");
		Aluno aluno3 = new Aluno("Joao");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("WEB 2023");
		Curso curso3 = new Curso("Node");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);

		aluno2.adicionarCurso(curso3);
		aluno1.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Alunos do Curso 01: ");
			System.out.println(" - " + aluno.nome);
		}
	}
}
