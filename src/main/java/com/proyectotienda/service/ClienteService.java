/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectotienda.service;

import com.proyectotienda.model.Cliente;
import com.proyectotienda.repository.ClienteRepository;
import com.proyectotienda.repository.IClienteRepository;
import java.util.List;

/**
 *
 * @author aleja
 */
public class ClienteService {
    private final IClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void registrarCliente(int id, String name, String email) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre es obligatorio.");
        }

        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("El correo es obligatorio.");
        }

        Cliente client = new Cliente(id, name, email);
        clienteRepository.save(client);
    }

    public List<Cliente> getAllClients() {
        return clienteRepository.getAllClients();
    }
}
