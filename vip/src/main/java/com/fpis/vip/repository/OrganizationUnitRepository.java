package com.fpis.vip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fpis.vip.entity.OrganizationUnitEntity;
@RepositoryRestResource(collectionResourceRel = "orgUnit", path="orgUnit")
public interface OrganizationUnitRepository extends JpaRepository<OrganizationUnitEntity, Long>{

}
