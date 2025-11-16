package com.example.observerdemo.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.observerdemo.event.PedidoCriadoEvent;

@Component
public class NotificarEmailListener {

    @EventListener
    public void enviarEmail(PedidoCriadoEvent event) {
        System.out.println("Enviando e-mail sobre o pedido: " + event.getPedidoId());
    }
}