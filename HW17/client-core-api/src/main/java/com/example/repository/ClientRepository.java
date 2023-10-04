package com.example.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {
    ClientEntity getClientEntityByClientId(String clientId);

    List<ClientEntity> getClientEntitiesBy();

    @Transactional
    void deleteClientEntitiesByClientId(String ClientId);
}
