
public class ClassePrincipal {
    public static void main(String args[]) {

        Cadastro p [] = new Cadastro[4];
        Jogo j[] = new Jogo[3];
        Jogo jp = new Jogo();


        p[0] = new Cadastro  ("JP",30,"masc");
        p[1] = new Cadastro ("Thay",30,"fem");
        p[2] = new Cadastro("Xxx",34,"Mas");

        j[0] = new Jogo ("Dark Souls","Aventura","Playstation",1991,p[0]);
        j[1] = new Jogo ("Final Fantasy","RPG","Xbox",1992,p[1]);
        j[2] = new Jogo("Super Mario","Aventura","Nintendo",1980,p[2]);

        jp.opcaoMenu();

    }

}
