package escola;

import java.util.ArrayList;

public class Disciplina {
	/** Atributos */
	private String nome;
	private int cargaHoraria;
	
	/** Importa Lista de Professores para a variavel professores */
	private ArrayList<Professor> professores;
	
	/**Importa lista de Turmas para a variavel alunos  */
	private ArrayList<Turma> turmas;
	
	
	public Disciplina() {
		professores = new ArrayList<Professor>();
		
	}
	
	
	
	public void adicionarProfessor(Professor professor) {
		professores.add(professor);
		
	}
	
	public void excluidProfessor(Professor professor) {
		professores.remove(professor);
		
	}
	
	public int quantidadeProfessores() {
		return professores.size();
		
	}
	
	public Professor getProfessor(int posicao) {
		return professores.get(posicao);
	}

	
	
	/** Metodos Getters e Setters */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		if (cargaHoraria >= 0) {
			this.cargaHoraria = cargaHoraria;
		}
		
	}

	
	
}
