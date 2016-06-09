/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E6;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ACER
 */
public class Convertidor {

    Map <String,Double> mapa;
    
    public Convertidor() {
        mapa = new HashMap <>();
        mapa.put("centimetros", 0.01);
        mapa.put("metros", 1.00);
        mapa.put("kilometros",1000.00);
        mapa.put("pulgadas", .0254);
        mapa.put("pies",.305);
        mapa.put("millas",1613.00);
        
    }
    
    
    
    public double convertir(String a, double b, String c)
    {
        if(mapa.containsKey(a))
        {
            double cm = mapa.get(a);
            cm = cm * b;
            double inch = mapa.get(c);
            return cm/inch;
        }
        
        return 0.0;
    }
    
    public static void main(String[] args) {
        Convertidor conver = new Convertidor();
        
         double h = conver.convertir("centimetros", 30, "pies");
         
         
         System.out.println(h);
    }
    
}
