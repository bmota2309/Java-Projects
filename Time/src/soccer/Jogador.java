package soccer;

import javax.sound.midi.Soundbank;

class Jogador implements Monta {
	private String name;
	private float altura;
	private int idade;
	private boolean atividade;
	private boolean aposentado;
	private boolean dm;
	

	@Override
	public boolean jogar(boolean val) {
		// TODO Auto-generated method stub
		if (!val) {
			return atividade = false;
		}
		return val;
		
	}


	
	@Override
	public String machucar() {
		// TODO Auto-generated method stub
		if (this.dm != true && this.aposentado != true) {
			return "O jogador n�o est� jogando";
		}else {
			return "O jogador est� jogando";
		}
	}







	public boolean getAposentado() {
		return aposentado;
	}
	public void setAposentado(boolean aposentado) {
		this.aposentado = aposentado;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean getAtividade() {
		return atividade;
	}
	public void setAtividade(boolean atividade) {
		this.atividade = atividade;
	}
	public boolean getDm() {
		return dm;
	}
	public void setDm(boolean dm) {
		this.dm = dm;
	}
	
	
}
