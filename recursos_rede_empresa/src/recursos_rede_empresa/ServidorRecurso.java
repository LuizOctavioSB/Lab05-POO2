/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursos_rede_empresa;

/**
 *
 * @author Luiz Octavio
 */

// Classe concreta representando o recurso real
public class ServidorRecurso implements Recurso {
    private String nomeRecurso;

    public ServidorRecurso(String nomeRecurso) {
        this.nomeRecurso = nomeRecurso;
    }

    @Override
    public void acessar(String usuario) {
        System.out.println("Acesso ao recurso " + nomeRecurso + " concedido para o usuário " + usuario);
    }
}
