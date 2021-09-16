package br.com.robligo.sevenfood.di.service;

import br.com.robligo.sevenfood.di.modelo.Cliente;
import br.com.robligo.sevenfood.di.notificacao.NotificadorEmail;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    private NotificadorEmail notificador;

    public void ativar(Cliente cliente){
        cliente.ativar();
        notificador.notificar(cliente, "Seu cadastro no sistema foi ativado!");
    }
}
