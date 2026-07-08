/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv6;

/**
 *
 * @author Aluno
 */
public class TesteCompra {
    public static void main(String[] args) {
        Compra minhaCompra = new Compra(1, "Pix"); 
        
        Jogo lol = new Jogo("Lol", 30.00);
        Jogo journey = new Jogo("Journey", 80.00);
        MidiaFisica gta = new MidiaFisica(20.00, "gta", 100.00);
        
        minhaCompra.addItem(lol);
        minhaCompra.addItem(journey);
        minhaCompra.addItem(gta);
        
        
        
        minhaCompra.mostrarCarrinho();
    }
}
