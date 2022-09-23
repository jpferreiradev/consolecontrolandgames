public class Cadastro {
    // Aqui estão os seus atributos

    public String nome;
    private int idade;
    private String generoSexual;

    // Construtores e métodos especiais

    // Aqui está o seu construtor
    public Cadastro(String usu, int ida, String ge){
        this.nome = usu;
        this.idade= ida;
        this.generoSexual = ge;

    }

    // Aqui os seus metodos get e set

    public String getNome(){
        return this.nome;

    }
    public void setNome( String usu){
        this.nome= usu;
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
}


