package lab5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luiz Octavio
 */
public class Motor implements ComponenteCarro {
    @Override
    public void ligar() {
        System.out.println("Motor ligado.");
    }
    
    @Override
    public void desligar() {
        System.out.println("Motor desligado.");
    }
}