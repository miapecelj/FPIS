package com.fpis.vip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fpis.vip.entity.PotentialClientEntity;
@RepositoryRestResource(collectionResourceRel = "potentialClient", path="potentialClient")
public interface PotentialClientRepository extends JpaRepository<PotentialClientEntity, Long>{

}
