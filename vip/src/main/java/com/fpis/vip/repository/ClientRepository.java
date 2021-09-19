package com.fpis.vip.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fpis.vip.entity.ClientEntity;

@RepositoryRestResource(collectionResourceRel = "client", path = "client")
@CrossOrigin("http://localhost:8081")
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
	List<ClientEntity> findByName(String name);

}
