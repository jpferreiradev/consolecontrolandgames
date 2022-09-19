public class Cadastro {
    // Aqui estão os seus atributos

    private String genero;
    private String plataforma;
    private int ano;

    // Construtores e métodos especiais
    public Cadastro(String ge, String pla, int ano) {
        this.plataforma = plataforma;
        this.genero = genero;
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

    // Métodos publicos



}
