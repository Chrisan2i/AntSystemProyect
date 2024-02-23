/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antsystemproyect;
/**
 * 
 * @author chris
 */
public class AntOptimization {
    
    private double shortestDistance;
    private int antsAmount;
    private double[][] pheromoneQuantity;
    
    Grafo grafo = Global.getGrafo();
    
    public AntOptimization(int numAnts){
        shortestDistance=0;antsAmount=numAnts;pheromoneQuantity = new double[grafo.getMaxVerts()][grafo.getMaxVerts()];
    }
    
    
    public String Simulacion(double ti,double phermona_grade,double visibility_grade,int r,int s,int cont_c){//double evaporationFactor
        String result="";
        double shortestDistance = 0;
        
        
        for (int i = 0; i < grafo.getMaxVerts(); i++) {
            for (int j = 0; j < grafo.getMaxVerts(); j++) {
                pheromoneQuantity[i][j] = ti;
            }
        }
        //double deltat=0;
        int cont = 0;
        result += "\nCICLO #" + (cont_c + 1) + ":\n\n";
        while (cont < antsAmount) {
            double currentDistance = 0;
            Ant hormiga = new Ant(grafo, r,s);
            hormiga.setΑ(phermona_grade);
            hormiga.setΒ(visibility_grade);

            while (hormiga.getR() != hormiga.getS() && hormiga.getTrapped() == false) {
                hormiga.calculateProbabilities(grafo, pheromoneQuantity);
            }

            // Matriz 
            for (int i = 0; i < hormiga.getCitiesHistory().length && hormiga.getCitiesHistory()[i + 1] != 0; i++) {
                int x = hormiga.getCitiesHistory()[i] - 1;
                int y = hormiga.getCitiesHistory()[i + 1] - 1;
                double tk = 1/grafo.getMatrixAdy()[x][y];

                currentDistance += grafo.getMatrixAdy()[x][y];
                
                pheromoneQuantity[x][y] += tk;
                //Implementacion de la evaporacion
                //if(cont_c == 0){
                    
                /*}else{
                    double t_1 = pheromoneQuantity[x][y]-1/grafo.getMatrixAdy()[x][y];
                    //double p = Double.parseDouble(evaporationFactor);
                    pheromoneQuantity[x][y] += hormiga.evaporation(evaporationFactor,t_1,deltat);
                }*/
            }
            
            //deltat += 1/currentDistance;
                            
            if (shortestDistance == 0) {
                shortestDistance = currentDistance;
            } else if (currentDistance < shortestDistance) {
                shortestDistance = currentDistance;
            }

            
            result += "HORMIGA " + (cont + 1) + ":\n" + "DISTANCIA RECORRIDA: " + currentDistance + "\n" + hormiga.print() + "\n";
            
            cont ++;  
        } 
        result += "RECORRIDO MÁS OPTIMO: " + shortestDistance + "\n";
            
    return result;
    }


}


