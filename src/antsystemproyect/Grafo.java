
package antsystemproyect;

import javax.swing.JOptionPane;

/**
 * Clase principal grafo con matriz de adyacencia
 * @author Jesús
 */

public class Grafo {
    /**
     * Atributos de la clase grafo.
     */
    private int maxVerts;
    private int numVerts;
    private double[][] MatrixAdy;
    //El mejor camino
    private int [] array;
    
    /**
     * Constructor de la clase.
     * @param n 
     */
    public Grafo(int n){
        maxVerts = n;
        numVerts = 0;
        MatrixAdy = new double[n][n];
        array = new int[n];
    }
    
    /**
     * Agregar Arista.
     * @param i
     * @param j
     * @param peso 
     */
    public void addArista(int i,int j, double peso){
        getMatrixAdy() [i][j] = getMatrixAdy() [j][i] = peso;
    }
    
    /**
     * Eliminar Arista.
     * @param i
     * @param j 
     */
    public void deleteArista(int i,int j){
        getMatrixAdy() [i][j] = getMatrixAdy() [j][i] = 0;
    }
    
    /**
     * Insertar Vértice.
     * @param n 
     */
    public void insertVertice(int n){
        if(0 == getMaxVerts() - getNumVerts()){
            JOptionPane.showMessageDialog(null, "Error, se supera el numero de vertices","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            for (int i = 0; i < getNumVerts(); i++) {
                for (int j = getNumVerts(); j < getNumVerts() + n; j++) {
                    getMatrixAdy()[i][j] = getMatrixAdy()[j][i] = 0;
                }
            }
        }
        setNumVerts(getNumVerts() + n);
    }
    /**
     * Eliminar Vértice.
     * @param n 
     */
    public void removeVertice(int n){
        if(n >= getNumVerts()){
            JOptionPane.showMessageDialog(null, "Error, se supera el numero de vertices","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            for (int i = n; i < getNumVerts(); i++) {
                for (int j = 0; j < getNumVerts(); j++){
                   if(i == getNumVerts() -1 || j == getNumVerts() -1){
                        getMatrixAdy()[i][j] = getMatrixAdy()[j][i] = 0;
                   }else{
                        getMatrixAdy()[i][j] = getMatrixAdy()[i+1][j];
                        getMatrixAdy()[j][i] = getMatrixAdy()[i][j];
                       
                   }
                }
            }
            setNumVerts(getNumVerts() - 1);
        }
    }
    
    /**
     * Imprimir Matriz.
     * @return 
     */
    public String print(){
        String Matrix = "";
        //System.out.println("La matriz tiene " + getNumVerts() + " vertices \n");
        for (int i = 0; i < getNumVerts(); i++) {
            for (int j = 0; j < getNumVerts(); j++) {
                Matrix += "[" + getMatrixAdy()[i][j] + "]" + " ";
            }
            Matrix = Matrix + "\n";
        }
        return Matrix;
    }

    /**
     * @return the maxVerts
     */
    public int getMaxVerts() {
        return maxVerts;
    }

    /**
     * @param maxVerts the maxVerts to set
     */
    public void setMaxVerts(int maxVerts) {
        this.maxVerts = maxVerts;
    }

    /**
     * @return the numVerts
     */
    public int getNumVerts() {
        return numVerts;
    }

    /**
     * @param numVerts the numVerts to set
     */
    public void setNumVerts(int numVerts) {
        this.numVerts = numVerts;
    }

    /**
     * @return the MatrixAdy
     */
    public double[][] getMatrixAdy() {
        return MatrixAdy;
    }

    /**
     * @param MatrixAdy the MatrixAdy to set
     */
    public void setMatrixAdy(double[][] MatrixAdy) {
        this.MatrixAdy = MatrixAdy;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    
    
}

