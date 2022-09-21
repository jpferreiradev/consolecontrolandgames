public class Cadastro {
    // Aqui estão os seus atributos

    private String usuario;
    private String genero;
    private String plataforma;
    private int ano;



    // Construtores e métodos especiais
    public Cadastro(String usua, String ge, String pla, int ano) {
        this.usuario = usua;
        this.genero = ge;
        this.plataforma = pla;
        this.ano = ano;
    }

    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String ge){
        this.genero = ge;
    }

    public String getPlataforma(){
        return this.plataforma;
    }
    public void setPlataforma(String pla){
        this.plataforma = pla;
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String getUsuario(){
        return this.usuario;

    }
    public void setUsuario(String usua){
        this.usuario = usua;
    }

    // Métodos publicos

    public void status(){
        System.out.println(" --------------------------------");
        System.out.println("----------" + getUsuario() +"-------------");
        System.out.println("O gênero escolhido foi: " + this.getGenero());
        System.out.println("A plataforma escolhida foi: " + this.getPlataforma());
        System.out.println("O ano do jogo é: " + this.getAno());
        System.out.println("--------------------------------------");
    }


}
