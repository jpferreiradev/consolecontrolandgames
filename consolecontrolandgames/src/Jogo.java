public class Jogo implements Verificacao {

    // Aqui estão os seus atributos
    public String nomeDoJogo;
    public  String tipoDoJogo;
    private  String plataforma;
    private int anoLancamento;

    private Cadastro usuario; // Utilizando a classe



    // Aqui está o seu construtor e seus métodos especiais

    public Jogo(String nomeJogo, String tpJogo,String plat,int anoLan, Cadastro usu){
        this.nomeDoJogo = nomeJogo;
        this.tipoDoJogo = tpJogo;
        this.plataforma = plat;
        this.anoLancamento = anoLan;
        this.usuario = usu;
    }


    public String getNomeDoJogo(){
        return this.nomeDoJogo;
    }
    public void setNomeDoJogo(String nomeJogo){
        this.nomeDoJogo = nomeJogo;
    }

    public String getTipoDoJogo(){
        return this.tipoDoJogo;
    }
    public void setTipoDoJogo(String ti){
        this.tipoDoJogo = ti;
    }

    public String getPlataforma(){
        return this.plataforma;
    }
    public void setPlataforma(String pla){
        this.plataforma = pla;
    }

    public int getAno(){
        return this.anoLancamento;
    }

    public void setAno(int ano){
        this.anoLancamento = ano;
    }

    public Cadastro getUsuario() {
        return this.usuario;
    }
    public void setUsuario(Cadastro usu){
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

    public void status(){
        System.out.println("--------------------------");
        System.out.println("---O usuário foi: "+ usuario.getNome() + "----------------");
        System.out.println(" O tipo de jogo foi : " + getTipoDoJogo());
        System.out.println("Sua plataforma é: " + getPlataforma());
        System.out.println("Seu ano de lançamento foi: " + getAno());
        System.out.println("------------------------------------");
    }

}



