/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author Luiz Octavio
 */
public class Farol implements ComponenteCarro {
    @Override
    public void ligar() {
        System.out.println("Farol aceso.");
    }
    
    @Override
    public void desligar() {
        System.out.println("Farol apagado.");
    }
}