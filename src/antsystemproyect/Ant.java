
package antsystemproyect;

import java.util.Random;
/**
 * Clase implementada de la Hormiga con parametros y sus respectivos métodos.
 * @author chris
 */
public class Ant {
    // Grado de importancia de la feromona
    private double α;
    // Grado de visibilidad de la feromona
    private double β;
    // Ciudad donde comienza la hormiga (Nido) 
    private int r;
    // Ciudad donde se encuentra la comida
    private int s;
    // Determina si la hormiga ya paso por la ciudad o se quedo estancada 
    private boolean visited;
    // Distancia entre las ciudades r y u
    private double drs;
    //Valor de aprendizaje
    private double Q;
    //Array de ciudades recorridas
    private int[] citiesHistory;
    //Sumatoria de todas las probabilidades
    private double Mk; 
    //Variable para las probabilidades de moverse de cada ciudad 
    private double[] Probabilities;

    public Ant (Grafo grafo, int r1, int s1) {
        α = 1;β = 2;r = r1;s = s1;Q = 1;Mk = 0;visited = false;citiesHistory = new int[grafo.getMaxVerts()];citiesHistory[0] = r;Mk = 0;
    }

    /**
     * Método que calculamos las probabilidades
     * @param graph
     * @param phermone
     * @return 
     */
    public int calculateProbabilities(Grafo graph,double phermone[][]) {
        if (r == s) {
            return r;
        } else {
        // Contador de ciudades (Aristas)
        int citiesCont = 0;
        
        // Indice de las ciudades
        int[] idxCities = new int[graph.getMaxVerts()];

        // Calculamos la sumatoria de mk , validando que la hormiga no haya estado en esa ciudad antes
        for (int c = 0; c < graph.getMaxVerts(); c++) {
            int repeat = 0;
            if (graph.getMatrixAdy()[r - 1][c] > 0) {
                for (int i = 0; i < citiesHistory.length; i++) {
                    if (citiesHistory[i] == c + 1) {
                        repeat ++;
                        break;
                        }
                    }
                if (repeat == 0) {
                    drs = graph.getMatrixAdy()[r - 1][c];
                    Mk += formula(drs,phermone[r - 1][c]);
                    idxCities[citiesCont] = c;
                    citiesCont ++;
                    }
                }
            }

        
        Probabilities = new double[citiesCont];
        int idx = 0;
        
        // Calculamos el porcentaje de probabilidad de dexCALCULAMOS EL PORCENTAJE DE PROBABILIDAD DE DESPLAZAMIENTO PARA CADA CIUDAD DEL CONJUNTO "Mk"!
        for (int c = 0; c < graph.getNumVerts(); c++) {
            int repeat = 0;
            if (graph.getMatrixAdy()[r - 1][c] > 0) {
                for (int i = 0; i < citiesHistory.length; i++) {
                    if (citiesHistory[i] == c + 1) {
                        repeat ++;
                        break;
                        }
                    }
                if (repeat == 0) {
                    drs = graph.getMatrixAdy()[r - 1][c];
                    Probabilities[idx] = formula(drs,phermone[r-1][c])/Mk;
                    idx ++;
                }
            }
        }

        if (Probabilities.length == 0) {
            visited = true;
        }
        else {

            // Creamos un random para determinar cual camino va a tomar 
            double o = 0;
            double f = 0;
            
            Random x = new Random();
            double randomNum = x.nextDouble(0,1);

            for (int i = 0; i < Probabilities.length; i++) {
                f += Probabilities[i];
                if (randomNum >= o && randomNum <= f) {
                    this.setR(idxCities[i] + 1);
                    break;
                } else {
                    o = f;
                }
            }
        }

        // Agregar la ciudad a donde fue la hormiga
        for (int i = 0; i < citiesHistory.length; i++) {
            if (citiesHistory[i] == r) {
                break;
            } else if (citiesHistory[i] == 0) {
                citiesHistory[i] = r;
                break;
            }
        }

        // Retornamos el indice de la ciudad que fue la hormiga 
        return r;
        }
    }
    
    /**
     * Imprime el recorrido de cada hormiga en un array
     * @return 
     */
    public String print(){
        String path = "recorrido: ";
        
        for (int i = 0; i < citiesHistory.length && citiesHistory[i] != 0; i++){
            if (i == 0){
                path += "[";
            }
            if (citiesHistory[i] != 0){
                path += Integer.toString(citiesHistory[i]);
            }
            if (i < citiesHistory.length - 1 && citiesHistory[i + 1] != 0){
                path += ",";
            }
            else{
                path += "]\n";
                break;
            }
        }
        return path;
    }
    
    /**
     * Formula de probabilidad.
     * @param drs
     * @param t
     * @return 
     */
    public double formula(double drs,double t){
        return Math.pow(t, α) * Math.pow((Q/drs), β);
    }
    /**
     * Formula de probabilidad.
     * @param p
     * @param t
     * @param dt
     * @return 
     */
    public double evaporation(double p, double t,double dt) {
        return (1 - p)*(t)+ dt;
    }

    /**
     * Getters anda Setters.
     * @param r 
     */
    public void setR(int r) {
        this.r = r;
    }

    public void setS(int s) {
        this.s = s;
    }

    public void setΑ(double α) {
        this.α = α;
    }

    public void setΒ(double β) {
        this.β = β;
    }

    
    public int[] getCitiesHistory() {
        return citiesHistory;
    }
    
    
    
    public int getR() {
        return r;
    }

    public int getS() {
        return s;
    }

    
    public double getΑ() {
        return α;
    }

    public double getΒ() {
        return β;
    }

    public boolean getTrapped() {
        return visited;
    }
}

