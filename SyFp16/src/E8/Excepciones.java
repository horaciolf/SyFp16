/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E8;

/**
 *
 * @author ACER
 */
public class Excepciones {
    
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4};// array simple
        
        for (int i = 0; i <= 15; i++) {
            
            try {
                System.out.println(arr[i]);//aqui pongo que imprima todo el arreglo
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ESTAS FUERA DE LIMITE");//aqui pongo que imprima todo el arreglo
                
                System.out.println(e.toString());
            }
            finally{
                
            }
        }
    }
    
}
