package kz.dar.academy.backend.controller;

import kz.dar.academy.backend.feign.ClientFeign;
import kz.dar.academy.backend.model.ClientPaymentRequest;
import kz.dar.academy.backend.model.ClientPaymentResponse;
import kz.dar.academy.backend.model.ClientResponse;
import kz.dar.academy.backend.service.ClientPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class ClientPaymentController {
    @Autowired
    ClientFeign clientFeign;

    @Autowired
    ClientPaymentService clientPaymentService;

    @GetMapping("/check")
    public String check(){
        return "client-payment is working";
    }

    @PostMapping
    public ClientPaymentResponse createClientPayment(@RequestBody ClientPaymentRequest clientPaymentRequest){
        return clientPaymentService.createClientPayment(clientPaymentRequest);
    }

    @PutMapping("/{paymentId}")
    public ClientPaymentResponse updateClientPaymentByPaymentId(@PathVariable String paymentId, @RequestBody
                                                                ClientPaymentRequest clientPaymentRequest){
        clientPaymentRequest.setPaymentId(paymentId);
        return clientPaymentService.updateClientPayment(clientPaymentRequest);
    }

    @GetMapping("/client/{clientId}")
    public ClientResponse getClientInformationById(@PathVariable String clientId){
        return clientFeign.getClientById(clientId);
    }

    @GetMapping("/paymentId/{paymentId}")
    public ClientPaymentResponse getClientPaymentByPaymentId(@PathVariable String paymentId){
        return clientPaymentService.getClientPaymentById(paymentId);
    }

    @GetMapping("initiatorId/{initiatorId}")
    public Page<ClientPaymentResponse> getClientPaymentByInitiatorId(@PathVariable String initiatorId,
                                                                     Pageable pageable){
        return clientPaymentService.getClientPaymentByInitiatorId(initiatorId, pageable);
    }

    @GetMapping("clientId/{clientId}")
    public Page<ClientPaymentResponse> getClientPaymentByClientId(@PathVariable String clientId,
                                                                     Pageable pageable){
        return clientPaymentService.getClientPaymentByClientId(clientId, pageable);
    }

    @GetMapping("status/{status}")
    public Page<ClientPaymentResponse> getClientPaymentByStatus(@PathVariable String status,
                                                                     Pageable pageable){
        return clientPaymentService.getClientPaymentByStatus(status, pageable);
    }

    @DeleteMapping("/{paymentId}")
    public void deleteClientPaymentByPaymentId(@PathVariable String paymentId){
        clientPaymentService.deleteClientPayment(paymentId);
    }

}
