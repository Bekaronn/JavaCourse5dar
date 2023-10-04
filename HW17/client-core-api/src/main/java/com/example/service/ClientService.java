package com.example.service;

import com.example.model.ClientRequest;
import com.example.model.ClientResponse;
import jakarta.transaction.Transactional;

import java.util.List;

public interface ClientService {
    ClientResponse createClient(ClientRequest clientRequest);
    ClientResponse updateClient(ClientRequest clientRequest);
    ClientResponse getClientById(String clientId);
    List<ClientResponse> getAllClients();

    @Transactional
    void deleteClientById(String clientId);
}
