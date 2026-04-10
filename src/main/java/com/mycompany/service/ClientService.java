package com.mycompany.service;

import java.util.List;

import com.mycompany.repository.ClientRepository;
import com.mycompany.repository.IClientRepository;
import com.proyectotienda.model.Cliente;

public class ClientService {
    private final IClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void registrarCliente(int id, String nombre, String email, String telefono) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre es obligatorio.");
        }

        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("El correo es obligatorio.");
        }

        Cliente cliente = new Cliente(id, nombre, email, telefono);
        clientRepository.save(cliente);
    }

    public List<Cliente> getAllClients() {
        return clientRepository.getAllClients();
    }
}