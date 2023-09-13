package com.example.client;

import com.example.model.ClientRequest;
import com.example.model.ClientResponse;
import com.example.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping
    public ClientResponse createClient(@RequestBody ClientRequest clientRequest){
        return clientService.createClient(clientRequest);
    }

    @PutMapping("/{clientId}")
    public ClientResponse updateClientById(@PathVariable String clientId, @RequestBody ClientRequest clientRequest){
        clientRequest.setClientId(clientId);
        return clientService.updateClient(clientRequest);
    }

    @GetMapping("/{clientId}")
    public ClientResponse getClientById(@PathVariable String clientId){
        return clientService.getClientById(clientId);
    }

    @GetMapping("/all")
    public List<ClientResponse> getAllClients(){
        return clientService.getAllClients();
    }

    @DeleteMapping("/{clientId}")
    public void deleteClientById(@PathVariable String clientId){
        clientService.deleteClientById(clientId);
    }

}
