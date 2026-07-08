/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agregacao;

/**
 *
 * @author Aluno
 */
public class VendaTeste {
       public static void main(String[] args){
          
         Produto prod = new Produto("livro", 10.50);
         Comprador compr = new Comprador("Fulano", 1000.00);
         Vendedor vend = new Vendedor("Beltrano", 3.50); 
         
         Venda novaVenda = new Venda(compr, vend, prod);
          
         novaVenda.efetuarVenda();
         
         novaVenda.getV().setNome("Faustao");
         novaVenda.efetuarVenda();
         
       }
}
