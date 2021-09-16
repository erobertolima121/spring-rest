package br.com.robligo.sevenfood.di.notificacao;

import br.com.robligo.sevenfood.di.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail {

    //Demonstrando que o Component/Bean anotado é iniciado pelo Spring
    private NotificadorEmail(){
        System.out.println("Component/Bean inicializado!");
    }

    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
