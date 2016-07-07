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
public interface IAlmacen {
    
    void comprar(Productos p);
    Productos buscar(String tipo);
    void mostrarTodos();
    int contarTodos();
    int contarTipo(String tipo);
    
}
