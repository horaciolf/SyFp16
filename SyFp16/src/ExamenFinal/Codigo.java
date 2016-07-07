/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFinal;

import Banco.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class Codigo implements Interface {

    
    ArrayList<Almacen>productos;

    public Codigo() {
        
        productos = new ArrayList();
    }

   
    
    
    
    @Override
    public void comprar( Almacen a) {
       productos.add(a);
    }

    @Override
    public Almacen buscar(String s) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().equals(s))
            {
                return null;
            }
        }
    }


    @Override
    public void mostrar() {
        System.out.println(productos);
    }

    @Override
    public int contarTodos() {
        
        for (int i = 0; i < 10; i++) {
            
        }
    }

    @Override
    public int contarPorTipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
