/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFinal;

/**
 *
 * @author ACER
 */
public class Almacen {
    
    protected String nombre ="desodorante,jabon,shampoo,pasta,papel";

    public String getNombre() {
        return nombre;
    }
    String tipo;

    public Almacen(String tipo) {
        this.tipo = tipo;
    }
    
    
    public void imprimir()
    {
        System.out.println(nombre);
        System.out.println(tipo);
    }
}
