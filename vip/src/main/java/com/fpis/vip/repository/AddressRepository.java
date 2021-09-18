package com.fpis.vip.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fpis.vip.entity.AddressEntity;
import com.fpis.vip.entity.CityEntity;

@RepositoryRestResource(collectionResourceRel = "address", path = "address")
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {
	List<AddressEntity> findByCity(CityEntity city);

}
