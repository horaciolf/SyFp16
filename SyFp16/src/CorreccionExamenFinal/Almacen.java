/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CorreccionExamenFinal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class Almacen implements IAlmacen {
    
    List<Productos>lista;

    public Almacen() {
        lista = new ArrayList();
    }
    

    @Override
    public void comprar(Productos p) {
        lista.add(p);
    }

    @Override
    public Productos buscar(String tipo) {
       for(Productos p : lista){
           if(p.getTipo().equals(tipo))
           {
               p.print();
               return p;
           }
       }
       return null;
    }

    @Override
    public void mostrarTodos() {
         for(Productos p : lista){
         p.print();
         }
    }

    @Override
    public int contarTodos() {
        return lista.size();
    }

    @Override
    public int contarTipo(String tipo) {
        int i = 0;
         for(Productos p : lista){
           if(p.getTipo().equals(tipo))
           {
               i++;
               
           }
       }
       return i;
    }
   
    
   }
    

