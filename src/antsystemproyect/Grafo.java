
package antsystemproyect;

//Clase principal grafo con matriz de adyacencia
import javax.swing.JOptionPane;

public class Grafo {
    
    private int maxVerts;
    private int numVerts;
    private double[][] MatrixAdy;
    
    //Constructor Grafo
    public Grafo(int n){
        maxVerts = n;
        numVerts = 0;
        MatrixAdy = new double[n][n];
    }
    
    //Eliminar Arista
    public void addArista(int i,int j, double peso){
        MatrixAdy [i][j] = MatrixAdy [j][i] = peso;
    }
    
    //Eliminar una Arista
    public void deleteArista(int i,int j){
        MatrixAdy [i][j] = MatrixAdy [j][i] = 0;
    }
    
    //Insertar un vertice
    public void insertVertice(int n){
        if(0 == maxVerts - numVerts){
            JOptionPane.showMessageDialog(null, "Error, se supera el numero de vertices","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            for (int i = 0; i < numVerts; i++) {
                for (int j = numVerts; j < numVerts + n; j++) {
                    MatrixAdy[i][j] = MatrixAdy[j][i] = 0;
                }
            }
        }
        numVerts += n;
    }
    //Eliminar Vertice
    public void removeVertice(int n){
        if(n >= numVerts){
            JOptionPane.showMessageDialog(null, "Error, se supera el numero de vertices","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            for (int i = n; i < numVerts; i++) {
                for (int j = 0; j < numVerts; j++){
                   if(i == numVerts -1 || j == numVerts -1){
                       MatrixAdy[i][j] = MatrixAdy[j][i] = 0;
                   }else{
                       MatrixAdy[i][j] = MatrixAdy[i+1][j];
                       MatrixAdy[j][i] = MatrixAdy[i][j];
                       
                   }
                }
            }
            numVerts --;
        }
    }
    
    //Imprimir Matriz
    public String print(){
        String Matrix = "";
        System.out.println("La matriz tiene " + numVerts + " vertices \n");
        for (int i = 0; i < numVerts; i++) {
            for (int j = 0; j < numVerts; j++) {
                Matrix += "[" + MatrixAdy[i][j] + "]" + " ";
            }
            Matrix = Matrix + "\n";
        }
        return Matrix;
    }
    

    public void setMaxVerts(int maxVerts) {
        this.maxVerts = maxVerts;
    }

    public void setNumVerts(int numVerts) {
        this.numVerts = numVerts;
    }

    public void setMatrixAdy(double[][] MatrixAdy) {
        this.MatrixAdy = MatrixAdy;
    }

    public int getMaxVerts() {
        return maxVerts;
    }

    public int getNumVerts() {
        return numVerts;
    }

    public double[][] getMatrixAdy() {
        return MatrixAdy;
    }
}

