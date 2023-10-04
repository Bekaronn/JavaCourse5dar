package kz.dar.academy.backend.service;

import kz.dar.academy.backend.model.ClientPaymentRequest;
import kz.dar.academy.backend.model.ClientPaymentResponse;
import kz.dar.academy.backend.model.ClientResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClientPaymentService {
    ClientPaymentResponse createClientPayment(ClientPaymentRequest clientPaymentRequest);

    ClientPaymentResponse updateClientPayment(ClientPaymentRequest clientPaymentRequest);

    ClientPaymentResponse getClientPaymentById(String paymentId);

    Page<ClientPaymentResponse> getClientPaymentByInitiatorId(String initiatorId, Pageable pageable);

    Page<ClientPaymentResponse> getClientPaymentByClientId(String clientId, Pageable pageable);

    Page<ClientPaymentResponse> getClientPaymentByStatus(String status, Pageable pageable);

    void deleteClientPayment(String paymentId);
}
