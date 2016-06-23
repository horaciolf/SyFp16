/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author ACER
 */
public class Cliente {
    
    public String nombre;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }

    public int getCuenta() {
        return cuenta;
    }
    
    
    public int edad;
    
    public int id;
    public int cuenta;

    public Cliente(String nombre, int edad, int cuenta, int id) {
        this.nombre = nombre;
        this.edad = edad;
        this.cuenta = cuenta;
        this.id = id;
    }
    
    
}
