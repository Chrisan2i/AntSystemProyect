package antsystemproyect;

/**
 * Clase GlobalGrafo para crear el grafo y poder llamar el metodo en las demás clases de forma rápida y dinámica.
 * @author Jesús
 */

public class GlobalGrafo {
    private static Grafo grafo = new Grafo(20);
    
    public static Grafo getGrafo(){
        return grafo;
    }
    public static void setGrafo(Grafo aGrafo){
        grafo = aGrafo;
    }
    
}
