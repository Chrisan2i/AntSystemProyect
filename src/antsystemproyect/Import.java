
package antsystemproyect;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 * Clase para cargar Archivos Txt.
 * @author Jesús
 */
public class Import {

    private int numVert = 0;
    private int numAri = 0;
    private String[] aristas = new String[20];
    
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
                        /**
                         * Llenando los arreglos.
                         */
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