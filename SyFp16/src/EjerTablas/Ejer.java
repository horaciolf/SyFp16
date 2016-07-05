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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;



/**
 *
 * @author ACER
 */
public class Ejer extends AbstractTableModel{
    
    String h [][];
    String guardar;
    int i =0;
    String columns [];
    
    public int numRenglones ()
    {
     try {
            BufferedReader br = null;
            br =  new BufferedReader(new FileReader (guardar));
            String linea;
            linea = br.readLine();
            i = 0;
            
            while(linea !=null)
            {
            
                
                i=i+1;//cuenta las lineas
                linea =br.readLine();//salto de linea
             
                
            }
            
       
           
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
     return i;
    }
    
    public int numColumnas ()
    {
        
        
           try 
           {
               
               
            BufferedReader br = null;
            br =  new BufferedReader(new FileReader (guardar));
            String linea;
            linea = br.readLine();
            
            columns = linea.split(",");
            i = columns.length;
           
           
           
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
           
           
         return i;
    }
    
    
    public void leerArchivo() throws FileNotFoundException, IOException
    {
        BufferedReader br = null;
        String row [];
        i = 0;
            
            br = new BufferedReader(new FileReader(guardar));//instancia para poder leer
            String linea;//guarda nuestro txt
            linea = br.readLine();
            while(linea !=null)
            {
                row = null;
                row= linea.split(",");
                linea = br.readLine();
              
                
               h[i]= row;
               i=i+1;
               
               linea =br.readLine();
               
            }
    }
    
    public Ejer(String s) throws IOException {
    
     guardar = s;
       h = new String [numRenglones()][numColumnas()]; 
        
      leerArchivo();
    }

    @Override
    public int getRowCount() {
        return numRenglones ();
    }

    @Override
    public int getColumnCount() {
       return numColumnas ();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return h[rowIndex][columnIndex];
    }

    
}
