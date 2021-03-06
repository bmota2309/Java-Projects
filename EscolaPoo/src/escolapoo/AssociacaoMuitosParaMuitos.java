package escolapoo;

import escola.Disciplina;
import escola.Professor;

public class AssociacaoMuitosParaMuitos {	
	public static void main(String[] args) {
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setCargaHoraria(80);
		disciplina1.setNome("Matem�tica");
		
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setCargaHoraria(80);
		disciplina2.setNome("Portugu�s");
		
		
		Professor professor1 = new Professor();
		professor1.setNome("Jo�o");
		professor1.setMatricula(9458);
		professor1.setFormacaoAcademica("Licenciado");
		professor1.setSalario(1200);
		
		
		Professor professor2 = new Professor();
		professor2.setNome("Maria");
		professor2.setMatricula(8014);
		professor2.setFormacaoAcademica("Licenciado");
		professor2.setSalario(1900);
		
		
		/* Rela��o do Professor 1 com disciplina 1 */
		professor1.adicionarDisciplina(disciplina1);
		
		/* Rela��o da disciplina 1 com Professor 1 */
		disciplina1.adicionarProfessor(professor1);
		
		
		/* Rela��o do Professor 1 com disciplina 2 */
		professor1.adicionarDisciplina(disciplina2);
		
		/* Rela��o da disciplina 2 com Professor 1 */
		disciplina2.adicionarProfessor(professor1);
		
		/* Rela��o do Professor 2 com disciplina 2 */
		professor2.adicionarDisciplina(disciplina2);
		
		/* Rela��o da disciplina 2 com Professor 2 */
		disciplina2.adicionarProfessor(professor2);
		
		
		/* Listar as disciplinas do professor 1 */
		System.out.println("Professor: " + professor1.getNome() + "\nDisciplinas");
		for(int i = 0; i < professor1.quantidadeDisciplinas(); i ++) {
			// Disciplina disciplina = professor1.getDisciplina(i);
			// System.out.println(disciplina.getNome());
		
				System.out.println(professor1.getDisciplina(i).getNome());
		
		}
		
		// Lista os professores da 	disciplina
		System.out.println("\n\nProfessores de " + disciplina2.getNome() );
		for(int i = 0; i < disciplina2.quantidadeProfessores(); i++) {
			System.out.println(disciplina2.getProfessor(i).getNome());
		}
	}

}
