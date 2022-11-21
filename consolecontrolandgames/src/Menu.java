import java.util.Scanner;

public class Menu  {

    private Cadastro cadastro;
    private Jogo jogo;


    Scanner scan = new Scanner(System.in);

    public Menu(){

    }

    public void opcaoMenu() {

        System.out.println("-------------------");
        System.out.println("Bem-vindo ao ConsoleControleGames");
        System.out.println("Escolha a opção que gostaria:");
        System.out.println("1: Adicionar os jogos" + " 2: Listar os jogos" + " 3: Deletar os jogos");
        String entrada =  scan.nextLine();
        System.out.println("Opção escolhida foi: " + Integer.parseInt(entrada));
        System.out.println();

        System.out.println("--------------------");
    }



}
