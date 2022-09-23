public class Jogo implements Verificacao  {

    // Aqui estão os seus atributos
    public  String tipoDoJogo;
    private  String plataforma;
    private int anoLancamento;

    private Cadastro usuario;



    // Aqui está o seu construtor e seus métodos especiais

    public Jogo(String tpJogo,String plat,int anoLan, Cadastro usu){
        this.tipoDoJogo = tpJogo;
        this.plataforma = plat;
        this.anoLancamento = anoLan;
        this.usuario = usu;
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

    public void status(){
        System.out.println("--------------------------");
        System.out.println("------- " + usuario.getNome() +"----------------");
        System.out.println(" O tipo de jogo foi : " + getTipoDoJogo());
        System.out.println("Sua plataforma é: " + getPlataforma());
        System.out.println("Seu ano de lançamento foi: " + getAno());
        System.out.println("------------------------------------");
    };

}


/*
 public void status(){
        System.out.println(" --------------------------------");
        //System.out.println("----------" + get() +"-------------");
        System.out.println("O gênero escolhido foi: " + this.getGenero());
        System.out.println("A plataforma escolhida foi: " + this.getPlataforma());
        System.out.println("O ano do jogo é: " + this.getAno());
        System.out.println("--------------------------------------");
    }

 */

/*

public Cadastro getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Cadastro usu) {
        this.usuario = usu;
    }

 */
