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
public class ArchivoBinario extends ALibreria {
    
  
    

    public ArchivoBinario(String archivo, String lectura, String escritura) {
        super(archivo, lectura, escritura);
    }

    public ArchivoBinario(String s, int b)
    {
        
    }
    
    @Override
    public int abrir(String s, int b) {
        return 1;
    }

    @Override
    public int cerrar() {
       return 1;
    }

    @Override
    public void desplegar() {
        
    }

    
    
}
