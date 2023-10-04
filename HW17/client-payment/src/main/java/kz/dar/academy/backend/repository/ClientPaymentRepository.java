package kz.dar.academy.backend.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
public interface ClientPaymentRepository extends ElasticsearchRepository<ClientPaymentEntity, String> {
    ClientPaymentEntity getClientPaymentEntityByPaymentId(String paymentId);

    Page<ClientPaymentEntity> getClientPaymentEntityByInitiatorId(String initiatorId, Pageable pageable);

    Page<ClientPaymentEntity> getClientPaymentEntityByClientId(String clientId, Pageable pageable);

    Page<ClientPaymentEntity> getClientPaymentEntityByStatus(String status, Pageable pageable);

    void deleteClientPaymentEntitiesByPaymentId(String paymentId);
}
