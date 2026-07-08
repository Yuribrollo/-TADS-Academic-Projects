package conta;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class ContaCorrente {
    protected String agencia; 
    protected String conta; 
    protected String nome;
    protected double saldo;

    public ContaCorrente(String agencia, String conta, String nome, double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(double valor){
        if(valor <= this.saldo)
            this.saldo -=valor;
        else
            System.out.println("Saldo insuficiente :( :( :(");
    }
    
    public void imprimir(){
        System.out.println("Ag: " + this.agencia);
        System.out.println("Conta: " + this.conta);
        System.out.println("Nome: " + this.nome);
        System.out.println("Saldo: " + this.saldo);
    }
    
    
}
