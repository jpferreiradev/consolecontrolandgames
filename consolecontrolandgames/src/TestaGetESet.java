import java.util.Scanner;

public class TestaGetESet {
	public static void main(String[] args) {

		
		Cadastro primeiroCadastro = new Cadastro();	
		Cadastro segundoCadastro = new Cadastro();
		
		
		
		primeiroCadastro.genero = "Aventura";
		primeiroCadastro.plataforma = "Playstation";
		primeiroCadastro.ano = 1991;
		
		segundoCadastro.genero = "A��o";
		segundoCadastro.plataforma = "xbox";
		segundoCadastro.ano = 1992;
		
		System.out.println(primeiroCadastro);
		System.out.println(segundoCadastro);
		
		
		
		
		
	}
}


// Cria��o de objetos com construtores
/*
Cadastro primeiroCadastro = new Cadastro("playstation", "aventura", 1991);
Cadastro segundoCadastro = new Cadastro("xbox", "acao", 1990);
*/
