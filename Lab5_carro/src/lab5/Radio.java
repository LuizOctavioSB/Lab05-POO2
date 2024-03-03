/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author Luiz Octavio
 */
public class Radio implements ComponenteCarro {
    private String estacao;
    
    public Radio(String estacao) {
        this.estacao = estacao;
    }
    
    @Override
    public void ligar() {
        System.out.println("Rádio ligado.");
        sintonizar(estacao);
    }
    
    @Override
    public void desligar() {
        System.out.println("Rádio desligado.");
    }
    
    private void sintonizar(String estacao) {
        System.out.println("Rádio sintonizado em: " + estacao);
    }
}