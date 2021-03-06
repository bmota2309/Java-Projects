package escolapoo;

import java.util.Date;

import escola.Aluno;
import escola.Turma;

public class AssociacaoParaUm {
	public static void main(String[] args) {
		/** Instanciando turma1 */
		Turma turma1 = new Turma(); 
		/** Definindo dados para os atributos */
		turma1.setSigla("1� A");
		turma1.setAno(1);
		
		/** Instanciando aluno1 */
		Aluno aluno1= new Aluno();
		/** Definindo dados para os atributos */
		aluno1.setNome("Jo�o");
		aluno1.setMatricula(201332);
		aluno1.setDataNascimento(new Date());
		aluno1.setTurma(turma1);
		turma1.adicionarAluno(aluno1);
		
		/** Instanciando aluno2 */
		Aluno aluno2 = new Aluno();
		/** Definindo dados para os atributos */
		aluno2.setNome("Jos�");
		aluno2.setMatricula(987456);
		aluno2.setDataNascimento(new Date());
		/** Associando a turma para o aluno*/
		aluno2.setTurma(turma1);
		turma1.adicionarAluno(aluno2);
		
		/** Imprimindo */
		System.out.println("Dados do aluno 1: \n");
		System.out.println(aluno1.getNome());
		/** Pega a sigla de aluni1 atraves do getTurma */
		System.out.println(aluno1.getTurma().getSigla());
		
		System.out.println("\nAlunos da Turma");
		for (int i = 0; i < turma1.quantidadeAlunos(); i ++) {
			System.out.println(turma1.getAluno(i).getNome());
		}
	}

}
