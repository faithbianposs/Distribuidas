package com.example.clientservice.service;

import com.example.clientservice.entity.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    public List<Client> list();

    public Optional<Client> getById(Integer id);

    public Client save(Client client);

    public Client update(Integer id, Client client);

    public void delete(Integer id);

}