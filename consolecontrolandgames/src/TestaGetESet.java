import java.util.Scanner;

public class TestaGetESet {
    public static void main(String[] args) {

       Cadastro primeiroCadastro = new Cadastro();
       Cadastro segundoCadastro = new Cadastro();


       primeiroCadastro.setAno(1991);
       primeiroCadastro.setGenero("aventura");
       primeiroCadastro.setPlataforma("playstation");

       segundoCadastro.setAno(1992);
       segundoCadastro.setGenero("ação");
       segundoCadastro.setPlataforma("xbox");


        System.out.println("A plataforma informada foi: " + primeiroCadastro.getPlataforma());
        System.out.println("O gênero informado foi: " + primeiroCadastro.getGenero());
        System.out.println("O ano informado foi: " + primeiroCadastro.getAno());


    }
}
