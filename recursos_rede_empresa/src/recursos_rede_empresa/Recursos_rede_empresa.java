/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursos_rede_empresa;

/**
 *
 * @author Luiz Octavio
 */
public class Recursos_rede_empresa {

    /**
     * @param args the command line arguments
     */
    
    // Classe principal para demonstrar o funcionamento do Proxy
    public static void main(String[] args) {
        // Criando um proxy para o recurso "Banco de Dados" com acesso autorizado para o usuário "admin"
        Recurso proxy = new ProxyRecurso("Banco de Dados", "admin");

        // Tentando acessar o recurso com diferentes usuários
        proxy.acessar("usuario1"); // Acesso negado
        proxy.acessar("admin");    // Acesso concedido
    }
}
