/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Aluno
 */
public class MySql implements BancoDeDados{
    public void conectar(){
        System.out.println("Conexao realizada!");
    }
    
    public void inserir() {
        System.out.println("Cadastrado!");
    }
    
    public void alterar(){
        System.out.println("Editado!");
    }
}
