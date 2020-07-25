package soccer;
import soccer.Monta;
public class Program extends Jogador {
	public static void main(String[] args) {
		Jogador jg1 = new Jogador();
		jg1.setName("Messi");
		jg1.jogar(false);
		
		System.out.println(jg1.getAtividade());
		
		
		
	}
	
	
	
}
