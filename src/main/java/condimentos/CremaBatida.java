/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condimentos;

import main.Bebida;
import main.CondimentosDecorador;

/**
 *
 * @author emiim
 */
public class CremaBatida extends CondimentosDecorador {
    // Variable para almacenar la bebida
    Bebida bebida;
    
    // Constructor recibe la bebida
    public CremaBatida(Bebida bebida){
        this.bebida = bebida;
    }
    
    // Obtenemos la descripcion de la bebida y le agregamos el condimento
    @Override
    public String getDescripcion(){
        return bebida.getDescripcion() + ", crema batida";
    }
    
    // Sumamos el costo del condimento
    @Override
    public double getPrecio(){
        return 15 + bebida.getPrecio();
    }
}
