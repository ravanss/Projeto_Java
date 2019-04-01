package projeto;
public class Projeto {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Projeto Programação.");
        v[1] = new Video("Projeto de Java.");
        v[2] = new Video("Projeto de php.");
        
        //Pessoa p = new Pessoa("João", 22, "M");
        
        Usuario u[] = new Usuario[2];
        u[0] = new Usuario ("Moramedy", 22, "M","Mora");
        u[1] = new Usuario ("Maria", 15, "f","mari");
        
        Visualizacao vis[] =new Visualizacao[3];
        vis[0] = new Visualizacao(u[0], v[0]);
        vis[0].avaliar();
        System.out.println( vis[0].toString());
        
        vis[1] = new Visualizacao(u[0], v[1]);
        vis[0].avaliar(87.0f);
        System.out.println( vis[1].toString());
        
        /*System.out.println("Videos--------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("Usuarios------------");
        System.out.println(u[0].toString());
        System.out.println(u[1].toString());*/
    }
    
}
