/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sockets;

/**
 *
 * @author certificacion7
 */
public class Sockets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Interface cliente = new Interface();
        cliente.connection(5555,"localhost");
        cliente.setVisible(true);
    }
    
}
