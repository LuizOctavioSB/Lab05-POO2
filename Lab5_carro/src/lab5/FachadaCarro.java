/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author Luiz Octavio
 */
public class FachadaCarro {
    private Motor motor;
    private CintoSeguranca cintoSeguranca;
    private Porta porta;
    private Farol farol;
    private Radio radio;
    
    public FachadaCarro(String estacaoRadio) {
        this.motor = new Motor();
        this.cintoSeguranca = new CintoSeguranca();
        this.porta = new Porta();
        this.farol = new Farol();
        this.radio = new Radio(estacaoRadio);
    }
    
    // Método para iniciar uma corrida
    public void iniciarCorrida() {
        motor.ligar();
        porta.ligar();
        cintoSeguranca.ligar();
        farol.ligar();
        radio.ligar();
    }
    
    // Método para finalizar uma corrida
    public void finalizarCorrida() {
        motor.desligar();
        porta.desligar();
        cintoSeguranca.desligar();
        farol.desligar();
        radio.desligar();
    }
}
