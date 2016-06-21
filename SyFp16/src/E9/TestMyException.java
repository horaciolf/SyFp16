/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E9;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class TestMyException {
    public static void main(String[] args) {
        try {
            TestMyException t = new TestMyException();
            t.test("hola");
        } catch (MyException ex) {
            System.out.println(":)");
        }
        
    }
    public void test(String s) throws MyException
    {
        if(s == null)
        {
            throw new MyException("Mi excepcion fue lanzada");
        }
        else
        {
            System.out.println("\"Mi excepcion no fue lanzada");
        }
    }
}
