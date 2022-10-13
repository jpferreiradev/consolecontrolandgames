public class ClassePrincipal {
    public static void main(String args[]){

        Cadastro p [] = new Cadastro[3];

        p[0] = new Cadastro  ("JP",30,"masc");
        p[1] = new Cadastro ("Thay",30,"fem");

        Jogo j[] = new Jogo[3];

        j[0] = new Jogo ("Dark Souls","Aventura","Playstation",1991,p[0]);
        j[1] = new Jogo ("Final Fantasy","RPG","Xbox",1992,p[1]);


        j[0].jogando();
        j[0].status();
        j[1].jogoTerminado();
        j[1].status();

    }
}
