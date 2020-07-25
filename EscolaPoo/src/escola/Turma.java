package escola;

import java.util.ArrayList;

public class Turma {
	/*  Atributos */
	private String sigla;
	private int ano;
	
	/* Importa lista de Alunos para a variavel alunos  */
	private ArrayList<Aluno> alunos;
	
	/* Importa lista de Professores para a variavel professores  */
	private ArrayList<Professor> professores;
	
	/* Importa lista de Professores para a variavel professores  */
	private ArrayList<Disciplina> disciplinas;
	
	/* Cria uma lista vazia de alunos ao invocar Turma */
	public Turma() {
		alunos = new ArrayList<Aluno>();
	}
	
	/* Adiciona novo aluno pelo add */
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	/* lista quantidade de alunos ex: 15 */
	public int quantidadeAlunos() {
		return alunos.size();
	}
	
	/* Remove um aluno */
	public void excluirAluno(Aluno aluno) {
		aluno.remove(aluno); 
	}
	
	/* Lista um determinado aluno */
	public Aluno getAluno(int posicao) {
		return alunos.get(posicao);
	}
	
	
	/*  Metodo */
	void adicionarAluno() {
		
	}

	
	
	
	/*  Metodos Getters e Setters*/
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
}
