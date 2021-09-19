package com.fpis.vip.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fpis.vip.entity.AddressEntity;
import com.fpis.vip.entity.CityEntity;

@RepositoryRestResource(collectionResourceRel = "address", path = "address")
@CrossOrigin("http://localhost:8081")
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {
	List<AddressEntity> findByCity(CityEntity city);

}
