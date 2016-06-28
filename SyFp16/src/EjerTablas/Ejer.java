/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerTablas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.AbstractTableModel;



/**
 *
 * @author ACER
 */
public class Ejer extends AbstractTableModel{
    
    String h [][];
    String guardar;
    
    public void leerArchivo() throws FileNotFoundException, IOException
    {
        BufferedReader br = null;
        String row [];
       int i = 0;
            
            br = new BufferedReader(new FileReader("employees.csv"));//instancia para poder leer
            String linea;//guarda nuestro txt
            linea = br.readLine();
            while(linea !=null)
            {
                System.out.println(linea);
                linea = br.readLine();
                
                row = linea.split(",");
               h[i]= row;
               i=i+1;
               
               linea =br.readLine();
               
            }
    }
    
    public Ejer(String s) throws IOException {
        
      guardar = s;  
       h = new String [101][7]; 
       leerArchivo();
        
    }

    @Override
    public int getRowCount() {
        return 101;
    }

    @Override
    public int getColumnCount() {
       return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return h[rowIndex][columnIndex];
    }

    
}
