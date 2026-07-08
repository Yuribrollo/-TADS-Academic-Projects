/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conta;

/**
 *
 * @author Aluno
 */
public class TesteConta {
    
    public static void main(String[] args) {
        ContaEspecial   minhaConta = new ContaEspecial("080945", "345678", "Fulano", 1000);
        
        minhaConta.sacar(2000.00);
        
        minhaConta.imprimir();
    }
    
    
    
    
    
    
    
}
