
package antsystemproyect;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.Edge;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;


/**
 * Clase implementada para la librería del Grafo GraphStream.
 * @author Jesús
 */

public class GraphStream {
    Graph grafo = new SingleGraph("GraphStream");
    Grafo graph = GlobalGrafo.getGrafo();
    /**
     * Método para visualizar el grafo creado.
     * @param node
     * @param color
     * @param numVerts
     * @param matrixAdy 
     */
    
    public void showGrafo(int[] array){
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
        

        if(array != null){
            for (int i = 0; array[i] != 0 && i < array.length; i++) {
                int x = array[i];
                int y = array[i+1];
                
                
                Node cx = grafo.getNode(Integer.toString(x));
                cx.setAttribute("ui.class", "root");
                
                Node cy = grafo.getNode(Integer.toString(y));
                
                if(cy != null){
                    Edge edge = cx.getEdgeBetween(cy);
                    edge.setAttribute("ui.style", "fill-color:green;");
                }
            }
        }       
        
        
        Viewer viewer = grafo.display();
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);

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
        "edge { arrow-shape: arrow; arrow-size: 20px, 4px; fill-color: skyblue; text-size: 15; text-color: blue; size: 7px; text-alignment: center;}"+
            "node.root{fill-color:green;}";
}
