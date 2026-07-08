/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

/**
 *
 * @author Aluno
 */
public class Reatngulo implements Forma {
    private double base;
    private double altura;

    public Reatngulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double getArea(){
        return base*altura;
    }
    
    public double getPerimetro(){
        return (base*2) + altura*2;
    }
    
}
