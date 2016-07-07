/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CorreccionExamenFinal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ACER
 */
public class Tabla extends AbstractTableModel{

    
    
    private String m[][];
    private String names[];
    private String nombreArchivo;
    double cAMEX=0.0, cCASH=0.0, cCHEC=0.0, cMAST = 0.0, cOTHE = 0.0, cVISA = 0.0;

    @Override
    public String getColumnName(int column) {
        return names[column];
    }

    public Tabla(String nombre) {
        
        names = new String[]{"id", "Payment Method", "Total (suma de cada método de pago)"};
        nombreArchivo = nombre;
        
        leerArchivo();
        
        m = new String[6][3];
        m[0][0] = "1";
        m[0][1] = "AMEX";
        m[0][2] = " " + cAMEX;
        m[1][0] = "2";
        m[1][1] = "CASH";
        m[1][2] = " " + cCASH;
        m[2][0] = "3";
        m[2][1] = "CHEC";
        m[2][2] = " " + cCHEC ;
        m[3][0] = "4";
        m[3][1] = "MAST";
        m[3][2] = " " + cMAST;
        m[4][0] = "5";
        m[4][1] = "OTHE";
        m[4][2] = " " + cOTHE;
        m[5][0] = "6";
        m[5][1] = "VISA";
        m[5][2] = " " + cVISA;
    }
    @Override
    public int getRowCount() {
        return 6;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return m[rowIndex][columnIndex];
    }
    
    public void leerArchivo()
    {
        
        try(BufferedReader br = new BufferedReader(new FileReader(nombreArchivo)))
        {
            String linea;
            linea = br.readLine();
            while(linea != null)
            {
                String row[];
                row = linea.split(";");
                if(row[3].equals("\"AMEX\""))
                {
                    Double d = new Double(row[4]);
                    cAMEX = cAMEX + d.doubleValue() ;
                }
                if(row[3].equals("\"CASH\""))
                {
                    Double d = new Double(row[4]);
                    cCASH = cCASH + d.doubleValue();
                }
                if(row[3].equals("\"CHEC\""))
                {
                    Double d = new Double(row[4]);
                    cCHEC = cCHEC + d.doubleValue();
                }
                if(row[3].equals("\"MAST\""))
                {
                    Double d = new Double(row[4]);
                    cMAST = cMAST + d.doubleValue();
                }
                if(row[3].equals("\"OTHE\""))
                {
                    Double d = new Double(row[4]);
                    cOTHE = cOTHE + d.doubleValue();
                }
                if(row[3].equals("\"VISA\""))
                {
                    Double d = new Double(row[4]);
                    cVISA = cVISA + d.doubleValue();
                }
                linea = br.readLine();
            }                       
        } catch (IOException ex) {
            Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
