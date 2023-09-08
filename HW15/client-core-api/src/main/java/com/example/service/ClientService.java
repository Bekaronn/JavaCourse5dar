package com.example.service;

import com.example.model.ClientModel;

import java.util.List;

public interface ClientService {
    List<ClientModel> getAllClient();
    ClientModel getClientById(String clientId);
}
