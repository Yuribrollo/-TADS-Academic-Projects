/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv6;

/**
 *
 * @author Aluno
 */
public class MidiaFisica extends Jogo{

    private double frete = 0;

    public MidiaFisica(double frete, String titulo, double valor) {
    super(titulo, valor);
    this.frete = frete;
    this.getValor();
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }
    
    @Override
    public double getValor() {
        valor += frete;
        return valor;
    }


    
    
    
    
}
