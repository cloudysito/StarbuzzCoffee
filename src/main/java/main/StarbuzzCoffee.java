/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import bebidas.Expresso;
import condimentos.Chocolate;
import condimentos.CremaBatida;

/**
 *
 * @author emiim
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        // Creamos el pedido
        Bebida pedido = new Expresso();
        
        // Le agregamos condimentos
        pedido = new Chocolate(pedido);
        pedido = new CremaBatida(pedido);
        
        // Impresión del "ticket"
        System.out.println("------------------------------------------------------------------------");
        System.out.println("S T A R B U Z Z C O F F E E");
        System.out.println("---------------------------");
        System.out.println("Pedido: " + pedido.getDescripcion());
        System.out.println("Total: $" + pedido.getPrecio());
    }
}
