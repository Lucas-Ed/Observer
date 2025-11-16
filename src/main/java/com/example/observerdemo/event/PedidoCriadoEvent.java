package com.example.observerdemo.event;

/**
 * Evento que representa a criação de um pedido.
 * (Event object do Observer Pattern)
 */
public class PedidoCriadoEvent {
    private final String pedidoId;

    public PedidoCriadoEvent(String pedidoId) {
        this.pedidoId = pedidoId;
    }

    public String getPedidoId() {
        return pedidoId;
    }
}