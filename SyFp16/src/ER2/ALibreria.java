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
public abstract class ALibreria implements ILibreria {

    protected String archivo;
    protected String lectura;
    protected String escritura;

    public ALibreria(String archivo, String lectura, String escritura) {
        this.archivo = archivo;
        this.lectura = lectura;
        this.escritura = escritura;
    }
    
    
}
