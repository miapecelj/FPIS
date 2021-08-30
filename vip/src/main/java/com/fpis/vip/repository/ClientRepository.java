package com.fpis.vip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fpis.vip.entity.ClientEntity;
@RepositoryRestResource(collectionResourceRel = "client", path="client")
public interface ClientRepository extends JpaRepository<ClientEntity, Long>{

}
