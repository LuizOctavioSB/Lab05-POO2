/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursos_rede_empresa;

/**
 *
 * @author Luiz Octavio
 */

// Proxy para controlar o acesso aos recursos
public class ProxyRecurso implements Recurso {
    private Recurso servidorRecurso;
    private String usuarioAutorizado;

    public ProxyRecurso(String nomeRecurso, String usuarioAutorizado) {
        this.servidorRecurso = new ServidorRecurso(nomeRecurso);
        this.usuarioAutorizado = usuarioAutorizado;
    }

    @Override
    public void acessar(String usuario) {
        if (usuario.equals(usuarioAutorizado)) {
            servidorRecurso.acessar(usuario);
        } else {
            System.out.println("Acesso negado para o usuário " + usuario);
        }
    }
}