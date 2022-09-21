public class Cadastro implements Verificacao{
    // Aqui estão os seus atributos

    private String usuario;
    private int idade;
    private String generoSexual;
    // Aqui estão os atributos de outra classe
    private Jogo plataforma;
    private Jogo ano;
    private Jogo tipoDoJogo;


    // Construtores e métodos especiais

    // Aqui está o seu construtor
    Cadastro(String usu,int ida,String ge){
        this.usuario = usu;
        this.idade = ida;
        this.generoSexual = ge;
    }

    // Aqui os seus metodos get e set

    public String getUsuario(){
        return this.usuario;

    }
    public void setUsuario(String usua){
        this.usuario = usua;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int ida){
        this.idade = ida;
    }

    public String getGeneroSexual(){
        return this.generoSexual;
    }
    public void setGeneroSexual(String ge){
        this.generoSexual = ge;
    }



    // Métodos publicos

    public void status(){

    }


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
