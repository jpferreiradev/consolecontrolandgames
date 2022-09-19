public class Teste {
    public static void main(String args[]){

       Cadastro p1 = new Cadastro("Aventura","Playstation", 1991);
       Cadastro p2 = new Cadastro("Ação","Nintendo",1990);
       Cadastro p3 = new Cadastro("Luta","Xbox", 1998);
       Cadastro p4 = new Cadastro("Futibol", "Mega", 1999);


       System.out.println(p1.getGenero());
       System.out.println(p1.getPlataforma());
       System.out.println(p1.getAno());





    }
}
