package com.fpis.vip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fpis.vip.entity.AcitvityEntity;
@RepositoryRestResource(collectionResourceRel = "activity", path="activity")
public interface ActivityRepository extends JpaRepository<AcitvityEntity, Long>{

}
