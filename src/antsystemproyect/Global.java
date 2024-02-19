package antsystemproyect;

public class Global {
    private static Grafo grafo = new Grafo(20);
    
    public static Grafo getGrafo(){
        return grafo;
    }
    public static void setGrafo(Grafo aGrafo){
        grafo = aGrafo;
    }
    
}
