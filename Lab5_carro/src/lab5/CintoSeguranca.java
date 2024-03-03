/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author Luiz Octavio
 */
public class CintoSeguranca implements ComponenteCarro {
    @Override
    public void ligar() {
        System.out.println("Cinto de segurança travado.");
    }
    
    @Override
    public void desligar() {
        System.out.println("Cinto de segurança destravado.");
    }
}