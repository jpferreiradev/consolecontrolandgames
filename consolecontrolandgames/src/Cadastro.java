public class Cadastro {
	// Aqui estão os seus atributos

	String genero;
	String plataforma;
	int ano;

	// Aqui vai ficar os seus primeiros construtores
	
	/*
	public Cadastro(String genero, String plataforma, int ano) {
		this.plataforma = plataforma;
		this.genero = genero;
		this.ano = ano;
	}
	*/
	
	// Aqui estão seus métodos

	public String getGenero() {
		return this.genero;
	}

	public String setGenero(String genero) {
		return this.genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public String setPlataforma(String plataforma) {
		return	this.plataforma = plataforma;
		
	}

	public int getAno() {
		return ano;
	}

	public int setAno(int ano) {
		return this.ano = ano;
	}

}
