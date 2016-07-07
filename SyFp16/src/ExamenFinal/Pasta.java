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
public class Pasta extends Almacen{
    
    String conBlanqueador;
    String conFluor;

    public Pasta(String tipo) {
        super(tipo);
        this.nombre = "pasta";
    }
    
}
