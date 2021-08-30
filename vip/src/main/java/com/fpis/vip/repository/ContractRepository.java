package com.fpis.vip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fpis.vip.entity.ContractEntity;
@RepositoryRestResource(collectionResourceRel = "contract", path="contract")
public interface ContractRepository extends JpaRepository<ContractEntity, Long>{

}
