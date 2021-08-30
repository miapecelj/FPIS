package com.fpis.vip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fpis.vip.entity.PositionEntity;
@RepositoryRestResource(collectionResourceRel = "position", path="position")
public interface PositionRepository extends JpaRepository<PositionEntity, Long>{

}
