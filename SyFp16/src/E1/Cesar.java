/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1;

/**
 *
 * @author administrador1
 */
public class Cesar {
    public String cifrar(String m, int c)
{
    String result = "";
    for (int i = 0; i < m.length(); i++) {
   
        result = result + (char)(m.charAt(i)+ c);
       
    }
        return result;
     
}
    
    public String descifrar (String s, int c)
    {
        String result = "";
    for (int i = 0; i < s.length(); i++) {
   
        result = result + (char)(s.charAt(i)+ c);
       
    }
        return result;
    }
    
    
    public static void main(String[] args) {
        
        Cesar c = new Cesar();
        String s = c.cifrar("hola", 3);
        
        System.out.println(s);
        
        
        String s1 = c.descifrar(s, -3);
        System.out.println(s1);
    }
}


