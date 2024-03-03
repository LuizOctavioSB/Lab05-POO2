/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

/**
 *
 * @author Luiz Octavio
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Criando a fachada do carro com a estação de rádio preferida
        FachadaCarro fachadaCarro = new FachadaCarro("Minha estação favorita");
        
        // Simulando uma corrida
        System.out.println("Iniciando corrida...");
        fachadaCarro.iniciarCorrida();
        
        // Simulando o fim da corrida
        System.out.println("\nFinalizando corrida...");
        fachadaCarro.finalizarCorrida();
    }
}
