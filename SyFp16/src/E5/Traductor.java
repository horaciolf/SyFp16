/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class Traductor {
     
    List<String>palabras;
    List<String>traducciones;
    
    public String eliminar(String s1)
    {
        if(s1 == s1)
        {
            return s1;
        }
        else
        {
            return "-1";
        }
    }
    
    public static void main(String[] args) {
        Traductor t = new Traductor();
        t.agregar("reprobar", "fail");
        
        List<Traductor>listaNueva;
        listaNueva = new ArrayList<>();
        
    }
    
    public String traducir(String s1)
    {
        int h = palabras.indexOf(s1);
        if(h == -1)
        {
            return s1;
        }
        else
        {
             return traducciones.get(h);
        }
    }
    
    public void agregar(String s2, String s3)
    {
        palabras.add(s2);
        traducciones.add(s3);
    }

    public Traductor() {
        
        palabras = new ArrayList <>();
        traducciones = new ArrayList <>();
    }
    
}
