package com.example.observerdemo;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.observerdemo.service.PedidoService;

@SpringBootApplication
public class ObserverDemoApplication implements CommandLineRunner {

    private final PedidoService pedidoService;

    public ObserverDemoApplication(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    public static void main(String[] args) {
        SpringApplication.run(ObserverDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu pedido: ");
        String numeroPedido = scanner.nextLine().trim();
        // chama o serviço que cria o pedido e dispara o evento
        pedidoService.criarPedido(numeroPedido);
        scanner.close();
    }
}