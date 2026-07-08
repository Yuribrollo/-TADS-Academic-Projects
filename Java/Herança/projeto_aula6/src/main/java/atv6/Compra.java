/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv6;

import java.util.ArrayList; 
/**
 *
 * @author Aluno
 */
public class Compra {
    private int id;
    private String pagamento;
    private double valorTotal = 0;
    private ArrayList<Jogo> itens = new ArrayList<Jogo>();

    public Compra(int id, String pagamento) {
        this.id = id;
        this.pagamento = pagamento;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }
    
    public void addItem(Jogo jogo){
        itens.add(jogo);
    }
    
    public void mostrarCarrinho(){
        for (Jogo j : itens){
            System.out.println("Titulo: " + j.titulo);
            System.out.println("Valor: " + j.valor);
            valorTotal += j.valor;
        }
        
        System.out.println("Total: " + valorTotal);
        System.out.println("Forma de Pagamento: " + pagamento);
    }
}
