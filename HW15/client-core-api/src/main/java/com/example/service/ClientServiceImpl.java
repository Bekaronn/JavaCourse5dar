package com.example.service;

import com.example.model.ClientModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{
    private static final HashMap<String, ClientModel> clientMap = new HashMap<>();

    static {
        ClientModel clientModel1 = new ClientModel("1","bek","kar","a@a.com");
        ClientModel clientModel2 = new ClientModel("2","ser","juk","b@a.com");
        ClientModel clientModel3 = new ClientModel("3","mak","pik","c@a.com");
        clientMap.put(clientModel1.getClientId(), clientModel1);
        clientMap.put(clientModel2.getClientId(), clientModel2);
        clientMap.put(clientModel3.getClientId(), clientModel3);
    }

    @Override
    public List<ClientModel> getAllClient() {
        return new ArrayList<>(clientMap.values());
    }

    @Override
    public ClientModel getClientById(String clientId) {
        return clientMap.get(clientId);
    }
}
