/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EMT;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ACER
 */
public class Placas implements IPlacas {
    
    Map <String,String> mapa;
    Map <String,String> mapa1;
    Map <String,String> mapa2;
   

    public Placas() {
        mapa = new HashMap <>();
        mapa.put("lunes","amarillo");
        mapa.put("martes","rosa");
        mapa.put("miercoles", "rojo");
        mapa.put("jueves", "verde");
        mapa.put("viernes", "azul");
        
        mapa1 = new HashMap <>();
        
        mapa1.put("5", "amarillo");
        mapa1.put("6", "amarillo");
        mapa1.put("7", "rosa");
        mapa1.put("8", "rosa");
        mapa1.put("3", "rojo");
        mapa1.put("4", "rojo");
        mapa1.put("1", "verde");
        mapa1.put("2", "verde");
        mapa1.put("9", "azul");
        mapa1.put("0", "azul");
        
        mapa2.put("5", "lunes");
        mapa2.put("6", "lunes");
        mapa2.put("7", "martes");
        mapa2.put("8", "martes");
        mapa2.put("3", "miercoles");
        mapa2.put("4", "miercoles");
        mapa2.put("1", "jueves");
        mapa2.put("2", "jueves");
        mapa2.put("9", "viernes");
        mapa2.put("0", "viernes");
        
        
        
    }
    
    

    @Override
    public String getHoyNoCircula() {
        
        return "Hoy no circulan placas  con engomado ";
    }

    @Override
    public String getByPlaca(String s) {
        String j = mapa.get(s);

       return j;
        
    }

    @Override
    public String getTerminacionPlaca(String s1) {
        String j1 = mapa1.get(s1);
        return j1;
        
    }

    @Override
    public String getColor(String s2) {
        String j2 = mapa2.get(s2);
        return j2;
        
    }
    
    
    
    
}
