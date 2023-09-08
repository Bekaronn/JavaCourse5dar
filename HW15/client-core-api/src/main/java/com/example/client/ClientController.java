package com.example.client;

import com.example.model.ClientModel;
import com.example.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/check")
    public String checkClient() {
        return "client-core-api is working";
    }

    @GetMapping("/all")
    public List<ClientModel> getAllClients() {
        return clientService.getAllClient();
    }

    @GetMapping("/{clientId}")
    public ClientModel getClientById(@PathVariable String clientId){
        return clientService.getClientById(clientId);
    }
}
