package com.mycompany.repository;

import java.util.List;

import com.mycompany.model.Cliente;

public interface IClientRepository {
    void save (Cliente cliente);
    List<Cliente> getAllClients();
}