package com.fpis.vip.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fpis.vip.entity.TechnicalSupportRequestEntity;
@RepositoryRestResource(collectionResourceRel = "request", path="request")
public interface TechnicalSupportRequestRepository extends JpaRepository<TechnicalSupportRequestEntity, Long>{
	
	List<TechnicalSupportRequestEntity> findByDate(LocalDate date);

}
