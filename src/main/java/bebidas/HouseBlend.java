/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bebidas;

import main.Bebida;

/**
 *
 * @author emiim
 */
public class HouseBlend extends Bebida{  
    // Constructor con la descripcion de la bebida
    public HouseBlend(){
        descripcion = "HouseBlend";
    }
    
    // Precio de la bebida
    public double getPrecio(){
        return 38.00;
    }
}
