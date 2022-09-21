public class Jogo {

    // Aqui estão os seus atributos
    private String tipoDoJogo;
    private String plataforma;
    private int ano;


    // Aqui estão os métodos especiais

    public String getTipo(){
        return this.tipoDoJogo;
    }
    public void setTipo(String ti){
        this.tipoDoJogo = ti;
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
}
