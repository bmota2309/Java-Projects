package escola;

import java.util.ArrayList;

public class Professor extends Pessoa {
	/** Atributos */
	private String formacaoAcademica;
	private double salario;
	
	/**Importa lista de disciplinas para a variavel disciplinas 1 professor pode te N disciplinas */
	private ArrayList<Disciplina> disciplinas;
	
	/**Importa lista de Turmas para a variavel turmas*/
	private ArrayList<Turma> turmas;
	
	/** Metodo */
	public void aplicarAvaliacao() {
		
	}
	
	/* constroi professor*/
	public Professor() {
		disciplinas = new ArrayList<Disciplina>();
	}
	
	
	
	/* Inicio Getters e Setters*/
	
	
	public String getFormacaoAcademica() {
		return formacaoAcademica;
	}

	public void setFormacaoAcademica(String formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	/* Fim Getters e Setters*/
	
	

	public void adicionarDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
		
	}
	
	public void excluidDisciplina(Disciplina disciplina) {
		disciplinas.remove(disciplina);
		
	}
	
	public int quantidadeDisciplinas() {
		return disciplinas.size();
		
	}
	
	public Disciplina getDisciplina(int posicao) {
		return disciplinas.get(posicao);
	}
}
