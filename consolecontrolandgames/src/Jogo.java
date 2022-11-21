import java.util.Scanner;

public class Jogo implements Verificacao {

    // Aqui estão os seus atributos
    public String nomeDoJogo;
    public String tipoDoJogo;
    private String plataforma;
    private int anoLancamento;
    private Cadastro usuario; // Utilizando a classe Cadastro


    Scanner scan = new Scanner(System.in);
    // Aqui está o seu construtor e seus métodos especiais

    public Jogo(String nomeJogo, String tpJogo, String plat, int anoLan, Cadastro usu) {
        this.nomeDoJogo = nomeJogo;
        this.tipoDoJogo = tpJogo;
        this.plataforma = plat;
        this.anoLancamento = anoLan;
        this.usuario = usu;


    }

    public Jogo(){

    }

    public String getNomeDoJogo() {
        return this.nomeDoJogo;
    }

    public void setNomeDoJogo(String nomeJogo) {
        this.nomeDoJogo = nomeJogo;
    }

    public String getTipoDoJogo() {
        return this.tipoDoJogo;
    }

    public void setTipoDoJogo(String ti) {
        this.tipoDoJogo = ti;
    }

    public String getPlataforma() {
        return this.plataforma;
    }

    public void setPlataforma(String pla) {
        this.plataforma = pla;
    }

    public int getAno() {
        return this.anoLancamento;
    }

    public void setAno(int ano) {
        this.anoLancamento = ano;
    }

    public Cadastro getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Cadastro usu) {
        this.usuario = usu;
    }

    @Override
    public void jogado() {
        System.out.println(usuario.getNome() + "já jogou o jogo " + getNomeDoJogo());
    }

    @Override
    public void jogando() {
        System.out.println(usuario.getNome() + " está jogando o jogo " + getNomeDoJogo());
    }

    @Override
    public void jogoTerminado() {
        System.out.println(usuario.getNome() + " já terminou o jogo " + getNomeDoJogo());
    }

    @Override
    public void jogoClassificado() {
        if (getPlataforma().equals("Playstation")) {
            System.out.println("Jogo da Playstation Plus");
        } else if ((getPlataforma().equals("Xbox"))) {
            System.out.println("Jogo da Gold Live Gold");
        } else if (getPlataforma().equals("Nintendo")) {
            System.out.println("Jogo da Nintendo Online");
        }
    }


    public void status() {
        System.out.println("--------------------------");
        System.out.println("---O usuário foi: " + usuario.getNome() + "----------------");
        System.out.println("A idade de " + usuario.getNome() + " é " + usuario.getIdade() + " anos ");
        System.out.println("O general sexual de " + usuario.getNome() + " é " + usuario.getGeneroSexual());
        System.out.println("---------------------------");
        System.out.println(" O tipo de jogo foi : " + getTipoDoJogo());
        System.out.println("Sua plataforma é: " + getPlataforma());
        System.out.println("Seu ano de lançamento foi: " + getAno());
        jogoClassificado();
        System.out.println("------------------------------------");
    }


}

