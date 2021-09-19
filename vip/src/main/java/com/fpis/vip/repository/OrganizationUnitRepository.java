package com.fpis.vip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fpis.vip.entity.OrganizationUnitEntity;

@RepositoryRestResource(collectionResourceRel = "orgUnit", path = "orgUnit")
@CrossOrigin("http://localhost:8081")
public interface OrganizationUnitRepository extends JpaRepository<OrganizationUnitEntity, Long> {

}
