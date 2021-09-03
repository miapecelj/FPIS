package com.fpis.vip.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fpis.vip.entity.ClientEntity;
@RepositoryRestResource(collectionResourceRel = "client", path="client")
public interface ClientRepository extends JpaRepository<ClientEntity, Long>{
	List<ClientEntity> findByName(String name);

}
