package com.mycompany.repository;

import java.util.ArrayList;
import java.util.List;

import com.proyectotienda.model.Cliente;

public class ClientRepository implements IClientRepository {
    private final List<Cliente> clients;

    public ClientRepository() {
        this.clients = new ArrayList<>();
    }

    @Override
    public void save(Cliente cliente) {
        clients.add(cliente);
    }

    @Override
    public List<Cliente> getAllClients() {
        return new ArrayList<>(clients);
    }
}