package com.example.demo.controller;

import com.example.demo.model.Pedido;
import com.example.demo.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/testep")
    public String testep(){
        return "Teste do pedido com sucesso!";
    }

    @PostMapping
    public Pedido cadastrarPedido(@RequestBody Pedido pedido) {
        return pedidoService.cadastrarPedido(pedido);
    }

    @GetMapping
    public List<Pedido> getAllPedidos(){
        return pedidoService.getAllPedidos();
    }

}
