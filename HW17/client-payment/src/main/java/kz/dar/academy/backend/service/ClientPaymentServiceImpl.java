package kz.dar.academy.backend.service;

import kz.dar.academy.backend.model.ClientPaymentRequest;
import kz.dar.academy.backend.model.ClientPaymentResponse;
import kz.dar.academy.backend.repository.ClientPaymentEntity;
import kz.dar.academy.backend.repository.ClientPaymentRepository;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.UUID;

@Service
public class ClientPaymentServiceImpl implements ClientPaymentService{
    @Autowired
    private ClientPaymentRepository clientPaymentRepository;

    @Autowired
    static ModelMapper modelMapper = new ModelMapper();

    static {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }

    @Override
    public ClientPaymentResponse createClientPayment(ClientPaymentRequest clientPaymentRequest) {
        clientPaymentRequest.setPaymentId(UUID.randomUUID().toString());

        ClientPaymentEntity clientPaymentEntity = modelMapper.map(clientPaymentRequest, ClientPaymentEntity.class);

        clientPaymentRepository.save(clientPaymentEntity);

        return modelMapper.map(clientPaymentEntity, ClientPaymentResponse.class);
    }

    @Override
    public ClientPaymentResponse updateClientPayment(ClientPaymentRequest clientPaymentRequest) {
        ClientPaymentEntity clientPaymentEntity = modelMapper.map(clientPaymentRequest, ClientPaymentEntity.class);

        ClientPaymentEntity dbEntity = clientPaymentRepository.getClientPaymentEntityByPaymentId(clientPaymentRequest
                .getPaymentId());

        dbEntity.setInitiatorId(clientPaymentRequest.getInitiatorId());
        dbEntity.setClientId(clientPaymentRequest.getClientId());
        dbEntity.setDate(clientPaymentEntity.getDate());
        dbEntity.setAddress(clientPaymentEntity.getAddress());
        dbEntity.setPrice(clientPaymentEntity.getPrice());
        dbEntity.setStatus(clientPaymentEntity.getStatus());

        clientPaymentEntity = clientPaymentRepository.save(dbEntity);
        return modelMapper.map(clientPaymentEntity, ClientPaymentResponse.class);
    }

    @Override
    public ClientPaymentResponse getClientPaymentById(String paymentId) {
        ClientPaymentEntity clientPaymentEntity = clientPaymentRepository.getClientPaymentEntityByPaymentId(paymentId);
        return modelMapper.map(clientPaymentEntity, ClientPaymentResponse.class);
    }

    @Override
    public Page<ClientPaymentResponse> getClientPaymentByInitiatorId(String initiatorId, Pageable pageable) {
        return clientPaymentRepository.getClientPaymentEntityByInitiatorId(initiatorId, pageable)
                .map(clientPaymentEntity -> modelMapper.map(clientPaymentEntity, ClientPaymentResponse.class));
    }

    @Override
    public Page<ClientPaymentResponse> getClientPaymentByClientId(String clientId, Pageable pageable) {
        return clientPaymentRepository.getClientPaymentEntityByClientId(clientId, pageable)
                .map(clientPaymentEntity -> modelMapper.map(clientPaymentEntity, ClientPaymentResponse.class));
    }

    @Override
    public Page<ClientPaymentResponse> getClientPaymentByStatus(String status, Pageable pageable) {
        return clientPaymentRepository.getClientPaymentEntityByStatus(status, pageable)
                .map(clientPaymentEntity -> modelMapper.map(clientPaymentEntity, ClientPaymentResponse.class));
    }


    @Override
    public void deleteClientPayment(String paymentId) {
        clientPaymentRepository.deleteClientPaymentEntitiesByPaymentId(paymentId);
    }
}
