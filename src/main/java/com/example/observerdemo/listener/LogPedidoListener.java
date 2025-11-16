package com.example.observerdemo.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.observerdemo.event.PedidoCriadoEvent;

@Component
public class LogPedidoListener {

    // Este método será chamado automaticamente quando PedidoCriadoEvent for publicado.
    @EventListener
    public void onPedidoCriado(PedidoCriadoEvent event) {
        System.out.println("[LOG] Pedido criado: " + event.getPedidoId());
    }
}