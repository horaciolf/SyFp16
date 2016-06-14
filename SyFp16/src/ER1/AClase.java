/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ER1;

/**
 *
 * @author ACER
 */
public abstract class AClase implements IClase{ //extends para clases normales y abstractas, implenments solo para interfaces
    protected String descripcion;

    public AClase(String descripcion) {
        this.descripcion = descripcion;//si el atributo se llama distinto a el para metro seria en vez de this. seria w= descripcion;
    }
    public void print()
    {
        System.out.println(descripcion);
    }
    //
   

    
        
    
}
