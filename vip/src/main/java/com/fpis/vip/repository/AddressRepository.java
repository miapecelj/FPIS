package com.fpis.vip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fpis.vip.entity.AddressEntity;
@RepositoryRestResource(collectionResourceRel = "address", path="address")
public interface AddressRepository extends JpaRepository<AddressEntity, Long>{

}
