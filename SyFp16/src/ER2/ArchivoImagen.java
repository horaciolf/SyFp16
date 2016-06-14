/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ER2;

/**
 *
 * @author ACER
 */
public class ArchivoImagen  extends ALibreria{
    
    
    public ArchivoImagen(int b)
    {
        
    }

    public ArchivoImagen(String archivo, String lectura, String escritura) {
        super(archivo, lectura, escritura);
    }

    @Override
    public int abrir(String s, int b) {
        return 0;
    }

    @Override
    public int cerrar() {
        return 1;
    }

    @Override
    public void desplegar() {
        
    }

  


    
}
