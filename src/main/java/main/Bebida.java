/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author emiim
 */
public abstract class Bebida {
    // Descripcion de la bebida
    public String descripcion = "Bebida";
    
    public String getDescripcion(){
        return descripcion;
    }
    
    // Obtenemos el precio de la bebida
    public abstract double getPrecio();
}
