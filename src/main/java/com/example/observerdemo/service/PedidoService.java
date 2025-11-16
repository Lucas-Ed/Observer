package com.example.observerdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.example.observerdemo.event.PedidoCriadoEvent;

@Service
public class PedidoService {

    private final ApplicationEventPublisher publisher;
    private final List<String> pedidos = new ArrayList<>();

    public PedidoService(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    /**
     * Cria um pedido, armazena em memória, publica o evento e somente após
     * os observadores serem notificados exibe a mensagem final.
     *
     * Aqui está o ponto central do Observer Pattern:
     * - Subject: PedidoService (emite evento)
     * - Evento: PedidoCriadoEvent
     * - Observers: listeners anotados com @EventListener
     */
    public void criarPedido(String numeroPedido) {
        // 1) Mensagem de criação
        System.out.println("Criando pedido: " + numeroPedido);

        // 2) Armazena em memória
        pedidos.add(numeroPedido);

        // 3) Publica evento — os Observers reagem a isso
        publisher.publishEvent(new PedidoCriadoEvent(numeroPedido));

        // 4) Após os observers concluírem (com multicaster síncrono), mostramos a mensagem final
        System.out.println("Pedido enviado à empresa com sucesso!");
    }

    public List<String> getPedidos() {
        return pedidos;
    }
}