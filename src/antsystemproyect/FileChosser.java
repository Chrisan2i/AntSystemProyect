
package antsystemproyect;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 * Clase para cargar Archivos Txt.
 * @author Jesús
 */
public class FileChosser {

    private int numVert = 0;
    private int numAri = 0;
    private String[] aristas = new String[20];
    Grafo grafo = GlobalGrafo.getGrafo();
    
    /**
     * Método para leer el archivo txt
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void ReadDoc() throws FileNotFoundException, IOException{
        
        boolean city = false; 
        int i = 0;

        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Select txt");
	jfc.setAcceptAllFileFilterUsed(false);
	FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo texto", "txt");
	jfc.addChoosableFileFilter(filter);

	int Value = jfc.showOpenDialog(null);
		

	if (Value == JFileChooser.APPROVE_OPTION) {
            File file = jfc.getSelectedFile();
                        
            BufferedReader in;
            in = new BufferedReader(new FileReader(file));
            String line = in.readLine();
            while (line != null) {
                if(line.equals("ciudad")){
                    city = true;
                    line = in.readLine();
                }
                if(line.equals("aristas")){
                    city = false;
                    line = in.readLine();
                }
                if(city == true){
                    numVert++;
                }else{
                    aristas[i] = line;
                    numAri++;
                    i++;
                }
                    line = in.readLine();
            }            
	}
    }
    /**
     * Método para Guardar un txt
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void GuardarTxt()throws FileNotFoundException, IOException{
       
        JFileChooser fc = new JFileChooser();
            
        
        fc.setDialogTitle("Guardar Grafo...");
        fc.setDialogType(JFileChooser.SAVE_DIALOG);

        
        fc.addChoosableFileFilter(new FileNameExtensionFilter("Archivos de texto", "txt"));

        int seleccion = fc.showSaveDialog(null);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            
            File fichero = fc.getSelectedFile();

            if (!fichero.getName().endsWith(".txt")) {
                
                fichero = new File(fichero.getAbsolutePath() + ".txt");
            } 
            FileWriter fw = null;
            
            fw = new FileWriter(fichero);
            
            
            fw.write("ciudad\n");
            for (int i = 1; i < grafo.getNumVerts()+1; i++) {
                fw.write(i+" ");
                fw.write("\n");
            }
            
            fw.write("aristas\n");
            for (int i = 0; i < grafo.getNumVerts(); i++) {
                for (int j = 0; j < grafo.getNumVerts(); j++) {
                    if (grafo.getMatrixAdy()[i][j] != 0) {
                        fw.write(String.valueOf(i+1)+","+ String.valueOf(j+1) +","+String.valueOf(grafo.getMatrixAdy()[i][j])+"");
                        fw.write("\n");
                    }
                }
            }
            fw.close();

        }
    }
    
    /**
     * Getters and Setters de los atributos.
     * @return 
     */
    
    public String[] getAri() {
        return aristas;
    }
    
    public void setAri(String[] aristas) {
        this.aristas = aristas;
    }

    public int getNumVertices() {
        return numVert;
    }

    public void setNumVertices(int x) {
        this.numVert = x;
    }

    public int getNumAri() {
        return numAri;
    }

    public void setNumAri(int x) {
        this.numAri = x;
    }
}