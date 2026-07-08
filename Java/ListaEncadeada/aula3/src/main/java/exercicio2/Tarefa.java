package exercicio2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author OKS
 */
public class Tarefa {
    private int id;
    private String desc;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Tarefa(int id, String desc, String status) {
        this.id = id;
        this.desc = desc;
        this.status = status;
    }
    
    public void lerTarefa(int idX){
        if (idX == id){
            System.out.println("Descricao: " + desc);
            System.out.println("Status: " + status);
        }
    }
}
