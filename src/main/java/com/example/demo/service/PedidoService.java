package com.example.demo.service;

import com.example.demo.model.Pedido;
import com.example.demo.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido cadastrarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> getAllPedidos(){
        return pedidoRepository.findAll();
    }
}
