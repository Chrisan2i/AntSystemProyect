
package antsystemproyect;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

/**
 * Clase implementada para la librería del Grafo GraphStream.
 * @author Jesús
 */

public class GrafoLibrary {

    /**
     * Método para visualizar el grafo creado.
     * @param numVerts
     * @param matrixAdy 
     */
    
    public void showGrafo(int numVerts, double[][] matrixAdy){
        System.setProperty("org.graphstream.ui", "swing");

    Graph grafo = new SingleGraph("GraphStream_");

    grafo.setAttribute("ui.stylesheet", styleSheet);

    grafo.setStrict(false);
    grafo.setAutoCreate( true );

        for (int i = 1; i <= numVerts; i++) {
            grafo.addNode(Integer.toString(i));
        }

        for (int i = 0; i < numVerts; i++) {
            for (int j = i; j < numVerts; j++) {
                if(matrixAdy[i][j] != 0){
                    String nodoIni = Integer.toString(i+1);
                    String nodoFin = Integer.toString(j+1);
                    int cont = 0;
                    String arista = nodoIni+nodoFin;
                    grafo.addEdge(arista, nodoIni, nodoFin).setAttribute("length", matrixAdy[i][j]);
                    Node node_partida = grafo.getNode(nodoIni);
                    node_partida.setAttribute("ui.class", "root");
                    
                    Node node_llegada = grafo.getNode(nodoFin);
                    
                    if(node_llegada != null){
                        Edge ari = node_partida.getEdgeBetween(node_llegada);
                        ari.setAttribute("ui.style", "fill-color: green;");
                        cont ++;
                    }
                }
                
            }
        }

        grafo.nodes().forEach(n -> n.setAttribute("label", n.getId()));
        grafo.edges().forEach(e -> e.setAttribute("label", "" + (double) e.getNumber("length")));

        
        
        grafo.display();
       
        
    }

    protected static String styleSheet =
        "node {"+
            "    shape: circle;"+
            "    size: 40px;"+
            " text-size: 15;"+
            "    fill-mode: plain;"+
            "    fill-color: blue;"+
            "    stroke-mode: plain;"+
            "    stroke-color: blackbold;"+
            "    stroke-width: 1px;"+
        "}"+
        "edge { arrow-shape: arrow; arrow-size: 20px, 4px; fill-color: skyblue; text-size: 15; text-color: blue; size: 7px; text-alignment: center;}"+
        "node.root {fill-color: green; stroke-color: green;}";
}
