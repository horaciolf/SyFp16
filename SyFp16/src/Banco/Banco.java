/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class Banco {
    
    List<Cliente>ListaClientes;
    List<Cuenta>ListaCuenta;

    public Banco() {
      ListaClientes = new ArrayList(); 
        
      ListaCuenta = new ArrayList();
    }
    
    public void agregarCliente(Cliente c)
    {
        ListaClientes.add(c);
    }
    
    public void agregarCuenta(Cuenta c1)
    {
        ListaCuenta.add(c1);
    }
    
    public void guardarClientes()
    {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("clientes.txt", true)))
        {
            for (Cliente cl:ListaClientes) {
                bw.write(cl.getId()+" "+cl.getNombre()+" "+cl.getEdad()+" "+cl.getCuenta()+"\n");
            }
        } catch (IOException ex) {
            System.out.println("hey");
        }
        
    }
    public void GuardarCuentas()
    {
        try(BufferedWriter bw1 = new BufferedWriter(new FileWriter("cuentas.txt",true)))
        {
            for(Cuenta cl1:ListaCuenta){
                bw1.write((cl1.cliente+" "+cl1.cuenta+" "+cl1.saldo)+ "\n");
            }
        } catch (IOException ex) {
            System.out.println("hey");
        }
    }
    
    public static void main(String[] args) {
        Banco b = new Banco ();
        Cliente c = new Cliente("horacio",20,1234,11);
        Cliente c1 = new Cliente("mel",19,1232,1122);
        Cliente c2 = new Cliente("lee",19,1234,1178);
        Cliente c3 = new Cliente("arturo",22,1235,1154);
        Cliente c4 = new Cliente("oz",24,1236,1165);
        Cliente c5 = new Cliente("jos",21,1236,1341);
        
        b.agregarCliente(c);
        b.agregarCliente(c1);
        b.agregarCliente(c2);
        b.agregarCliente(c3);
        b.agregarCliente(c4);
        b.agregarCliente(c5);
        b.guardarClientes();
        Cuenta cu = new Cuenta ("horacio",234);
        Cuenta cue = new Cuenta ("h",2345);
        
        b.agregarCuenta(cu);
        b.agregarCuenta(cue);
        b.GuardarCuentas();
    }
    
    
}
