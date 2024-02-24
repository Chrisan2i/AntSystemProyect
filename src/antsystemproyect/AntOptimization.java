
package antsystemproyect;
/**
 * Clase de la Optimización de la Hormiga.
 * @author chris
 */
public class AntOptimization {
    /**
     * Atributos de la clase.
     */
    private double shortestDistance;
    private int antsAmount;
    private double[][] phermonaMatrix;
    
    Grafo grafo = Global.getGrafo();
    
    public AntOptimization(int numAnts){
        shortestDistance=0;antsAmount=numAnts;phermonaMatrix = new double[grafo.getMaxVerts()][grafo.getMaxVerts()];
    }
    
    /**
     * Método que se implementa en la Simulación con las hormigas.
     * @param t
     * @param gradeP
     * @param gradeV
     * @param r
     * @param s
     * @param cont_c
     * @param evaporationF
     * @return 
     */
    public String Simulacion(double t,double gradeP,double gradeV,int r,int s,int cont_c,double evaporationF){
        String result="";
        double shortestDistance = 0;
        
        String bestPath =" ";
        for (int i = 0; i < grafo.getMaxVerts(); i++) {
            for (int j = 0; j < grafo.getMaxVerts(); j++) {
                phermonaMatrix[i][j] = t;
            }
        }
        double at=0;
        int cont = 0;
        result += "\nFase -" + (cont_c + 1) + ":\n\n";
        while (cont < antsAmount) {
            double currentDistance = 0;
            Ant hormiga = new Ant(grafo, r,s);
            hormiga.setΑ(gradeP);
            hormiga.setΒ(gradeV);


            while (hormiga.getR() != hormiga.getS() && hormiga.getTrapped() == false) {
                hormiga.calculateProbabilities(grafo, phermonaMatrix);
            }

            // Matriz feromona
            for (int i = 0; i < hormiga.getCitiesHistory().length && hormiga.getCitiesHistory()[i + 1] != 0; i++) {
                int x = hormiga.getCitiesHistory()[i] - 1;
                int y = hormiga.getCitiesHistory()[i + 1] - 1;
                double tk = 1/grafo.getMatrixAdy()[x][y];

                currentDistance += grafo.getMatrixAdy()[x][y];
                
                
                //Implementacion de la evaporacion
                if(cont_c == 0){
                    phermonaMatrix[x][y] += tk;
                }else{
                    double t1 = phermonaMatrix[x][y]-1/grafo.getMatrixAdy()[x][y];
                    phermonaMatrix[x][y] += hormiga.evaporation(evaporationF,t1,at);
                }
            }
            
            at += 1/currentDistance;
                            

            if (shortestDistance == 0 || currentDistance < shortestDistance) {
                bestPath = hormiga.print();
                hormiga.setArray(hormiga.getCitiesHistory());

            }
            result += "Hormiga #" + (cont + 1) + ":\n" + "Distancia recorrida: " + currentDistance + "\n" + hormiga.print() + "\n";
            
            cont ++;  
        } 

        result += "Mejor Recorrido: " + bestPath  + "Distancia " + shortestDistance;
            
    return result;
    }


}


