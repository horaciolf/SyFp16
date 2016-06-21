/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import E9.SaldoInsuficienteException;
import E9.WrongAmountException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class Cuenta {
    
    double saldo=0;
    
    
    public double checkSaldo()
    {
        return saldo;
    }
    
    public void deposito(double d) throws WrongAmountException
    {
        if(d<= 0.00)
        {
            throw new WrongAmountException("WrongAmountException");
        }
        else
        {
            saldo = saldo +d;
            
        }
    }
    
    public void retiro (double cantidad) throws SaldoInsuficienteException
    {
        if(cantidad > saldo)
        {
             throw new SaldoInsuficienteException("no tienes saldo");
        }
        else
        {
            saldo = saldo - cantidad;
        }
    }
    
    public static void main(String[] args) {
        Cuenta c = new Cuenta();
        
      
        try
        {
            c.deposito(100.00);
            c.retiro(9.0);
            
            System.out.println(c.checkSaldo());
        }
        catch(WrongAmountException ex)
        {
                  System.out.println(ex.toString());
        } catch (SaldoInsuficienteException ex) {
            System.out.println("SaldoInsuficienteException");
        }
        
       
                    
          
        
    }
    
    
    
}
