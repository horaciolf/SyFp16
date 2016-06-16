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
public abstract class ALibreria implements ILibreria {// el abstract  antes de class es lo que la convierte en clase abstracta.

    protected String archivo;//estos 3 son los atributos.
    protected String lectura;
    protected String escritura;

    public ALibreria(String archivo, String lectura, String escritura) {//aqui es en donde se termina de implemetar los atributos.
        this.archivo = archivo;
        this.lectura = lectura;
        this.escritura = escritura;
    }
    
    
}
