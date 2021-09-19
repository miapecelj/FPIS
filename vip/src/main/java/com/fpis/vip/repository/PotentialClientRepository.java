package com.fpis.vip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fpis.vip.entity.PotentialClientEntity;

@RepositoryRestResource(collectionResourceRel = "potentialClient", path = "potentialClient")
@CrossOrigin("http://localhost:8081")
public interface PotentialClientRepository extends JpaRepository<PotentialClientEntity, Long> {

}
