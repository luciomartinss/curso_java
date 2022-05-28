package oo.composição;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	final String nome;
	final List<Aluno> alunos = new ArrayList<>();
	
	Curso(String nome){
		this.nome = nome;
	}
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.curso.add(this);
	}
	
	/* Aluno obterAlunosDoCurso (String nome) {
		for(Aluno aluno: this.alunos) {
			return aluno;
		}
	*/
}		
		
		 
				
	

