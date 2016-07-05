/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ER3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ACER
 */
public class Empresa extends AbstractTableModel{

    String h [][];
    String h1 [];
    String archivo;
    String line;
    int i =0;
    String row [];
    int v;
    int v1;
    int v2;
    int v3;
    
    
    
    
    public int contarFrame ()
    {
        try {
            BufferedReader br = null;
            br =  new BufferedReader(new FileReader (archivo));
            String linea;
            linea = br.readLine();
            i = 0;
            
            while(linea !=null)
            {
            
              
                linea = br.readLine();//salto de linea
            
            row = linea.split(";");
            
            
            if(row[4].equals("FRAME"))
            {
                i=i+1;
            }
              
            }
            
       
           
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
     return i;
        
    }
    
     public int contarGlue ()
    {
        try {
            BufferedReader br = null;
            br =  new BufferedReader(new FileReader (archivo));
            String linea;
            linea = br.readLine();
            i = 0;
            
            while(linea !=null)
            {
            
              
                linea = br.readLine();//salto de linea
            
            row = linea.split(";");
            
            
            if(row[4].equals("GLUE"))
            {
                i=i+1;
            }
              
            }
            
       
           
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
     return i;
        
    }
     
      public int contarPuzzle ()
    {
        try {
            BufferedReader br = null;
            br =  new BufferedReader(new FileReader (archivo));
            String linea;
            linea = br.readLine();
            i = 0;
            
            while(linea !=null)
            {
            
              
                linea = br.readLine();//salto de linea
            
            row = linea.split(";");
            
            
            if(row[4].equals("PUZZLE"))
            {
                i=i+1;
            }
              
            }
            
       
           
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
     return i;
        
    }
       public int contarStorrage ()
    {
        try {
            BufferedReader br = null;
            br =  new BufferedReader(new FileReader (archivo));
            String linea;
            linea = br.readLine();
            i = 0;
            
            while(linea !=null)
            {
            
              
                linea = br.readLine();//salto de linea
            
            row = linea.split(";");
            
            
            if(row[4].equals("STORRAGE"))
            {
                i=i+1;
            }
              
            }
            
       
           
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
     return i;
        
    }

    public Empresa(String s) {
        archivo = s;
        v = contarFrame();
        v1 = contarGlue();
        v2 = contarPuzzle();
        v3 = contarStorrage();
        
        h = new String [5][3];
        h [0][0] = "1";
        h [0][1] = "FRAME";
        h [0][2] = " "+ v;
        
        h [1][0] = "2";
        h [1][1] = "GLUE";
        h [1][2] = " "+ v1;
        
        h [2][0] = "3";
        h [2][1] = "PUZZLE";
        h [2][2] = " "+ v2;
        
        h [3][0] = "4";
        h [3][1] = "STORRAGE";
        h [3][2] = " "+ v3;
        
        h1 = new String[3];
        
        h1[0] = "ID";
        h1[1] = "PRODUCTO";
        h1[2] = "TOTAL EN INVENTARIO";
        
        
        
    }

    @Override
    public String getColumnName(int column) {
        return h1[column]; //To change body of generated methods, choose Tools | Templates.
    }
       
       
    

    @Override
    public int getRowCount() {
        return 5;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
