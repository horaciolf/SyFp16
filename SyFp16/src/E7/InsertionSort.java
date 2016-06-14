/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class InsertionSort implements IOrdenamiento {

    @Override
    public int[] ordenar(int[] array) {
      int array2 [];//variable de array
        System.out.println("estoy en clase InsertionSort y en el metodo Ordenar");
        
        return array;
    }

    @Override
    public List<Integer> ordenar(List<Integer> array) {
        List<Integer> in = new ArrayList<Integer>(); //instancia de arraylist
        Integer a  = new Integer(1); // instancias de Integers
        Integer b  = new Integer(2);
        Integer c  = new Integer(3);
        Integer d  = new Integer(4);
        Integer e  = new Integer(5);
        
        in.add(a);
        in.add(b);
        in.add(c);
        in.add(d);
        in.add(e);
        
        return in;
    }
    
}
