/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CorreccionExamenFinal;

/**
 *
 * @author ACER
 */
public class Productos {
    protected String nombre ;
    protected String tipo;

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
    
    public void print()
    {
        System.out.println("nombre"+ getNombre());
        System.out.println("tipo"+ getNombre());
    }
    public static void main(String[] args) {
        Productos p = new Productos();
        p.print();
       /* Almacen a = new Almacen ();
        a.comprar(p);
        a.buscar(tipo);*/
       /*es en este paso en donde no logro probar mis metodos para que en lugar de correr y diga nombre o tipo null
       diga los productos, y tambien queria saber si al tratar de poner las subclases de cada clase hijo ¿tendria que hacer 
       de esta clase una clase abstracta para que a las subclases de las clases hijos pudiese poner
       un extends"nombre de clase hijo" implements Productos ?*/
    }
}
