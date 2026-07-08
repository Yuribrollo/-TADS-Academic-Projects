/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Aluno
 */
public class TestBD {
    public static void main(String[] args) {
        BancoDeDados meuBD = new PostgreSQL();
        
        meuBD.conectar();
        meuBD.inserir();
        meuBD.alterar();
    }
}
