/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ER1;

/**
 *
 * @author ACER
 */
public class Main {
    
    public static void main(String[] args) {
        IClase i = new C1("hhgf");//instancia de la interface
        AClase a = new C3("hfg");//instancia de la interface
        C2 c = new C2("lkj");//instancia de la clase c2
        
        a.print();
        
        
    }
}
