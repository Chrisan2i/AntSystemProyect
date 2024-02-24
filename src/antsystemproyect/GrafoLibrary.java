
package antsystemproyect;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.Edge;
import org.graphstream.graph.implementations.SingleGraph;


/**
 * Clase implementada para la librería del Grafo GraphStream.
 * @author Jesús
 */

public class GrafoLibrary {
    Grafo graph = Global.getGrafo();
    Graph grafo = new SingleGraph("GraphStream_");
    
    /**
     * Método para visualizar el grafo creado.
     * @param numVerts
     * @param matrixAdy 
     */
    
    public static void setNodeColor(Node node, String color) {
        node.setAttribute("ui.style", "fill-color: " + color + ";");
    }
    
    public static void setEdgeColor(Edge edge, String color) {
        edge.setAttribute("ui.style", "fill-color: " + color + ";");
    }
    
    public void showGrafo(int [] bestPath){
        System.setProperty("org.graphstream.ui", "swing");

        grafo.setAttribute("ui.stylesheet", styleSheet);

        grafo.setStrict(false);
        grafo.setAutoCreate( true );

        for (int i = 1; i <= graph.getNumVerts(); i++) {
            grafo.addNode(Integer.toString(i));
        }
        
        for (int i = 0; i < graph.getNumVerts(); i++) {
            for (int j = i; j < graph.getNumVerts(); j++) {
                if(graph.getMatrixAdy()[i][j] != 0){
                    String nodoIni = Integer.toString(i+1);
                    String nodoFin = Integer.toString(j+1);
                    String arista = nodoIni+nodoFin;
                    grafo.addEdge(arista, nodoIni, nodoFin).setAttribute("length",graph.getMatrixAdy()[i][j]);
                 
                }
                
            }
        }
        
        grafo.nodes().forEach(n -> n.setAttribute("label", n.getId()));
        grafo.edges().forEach(e -> e.setAttribute("label", "" + (double) e.getNumber("length")));
        
        grafo.display();
        
        //Setter el color del nodo al camino mas optiomo 
        for (int i = 1; i < bestPath.length; i++) {
                setNodeColor(grafo.getNode(Integer.toString(bestPath[i])),"red");
            }
        //Setter el color de la arista
        
    }

    protected static String styleSheet =
        "node {"+
            "    shape: circle;"+
            "    size: 40px;"+
            " text-size: 25;"+
            " text-size: 15;"+
            "    fill-mode: plain;"+
            "    fill-color: blue;"+
            "    stroke-mode: plain;"+
            "    stroke-color: blackbold;"+
            "    stroke-width: 1px;"+
        "}"+
        "edge { arrow-shape: arrow; arrow-size: 20px, 4px; fill-color: skyblue; text-size: 15; text-color: blue; size: 7px; text-alignment: center;}";
}
