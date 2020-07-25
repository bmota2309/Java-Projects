package escolapoo;

import escola.Disciplina;

public class EscolaPoo{
	
	public static void main(String[] args) {
		
		/** Cria variavel disciplina1 dp tipo Disciplina, disciplina1 é um objeto de Disciplina  */
		/** Instanciando objeto disciplina1 */
		Disciplina disciplina1 = new Disciplina();
		
		disciplina1.setNome("Matemática");
		disciplina1.setCargaHoraria(-10);
		
		System.out.println(disciplina1.getNome());
		System.out.println(disciplina1.getCargaHoraria());
		
	}
	
	 
	
}