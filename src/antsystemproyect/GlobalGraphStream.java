
package antsystemproyect;

/**
 *
 * @author chris
 */
public class GlobalGraphStream {
    private static GraphStream graph = new GraphStream();
    
    public static GraphStream getGraph(){
        return graph;
    }
    public static void setGraph(GraphStream graph1){
        graph = graph1;
    }
}
