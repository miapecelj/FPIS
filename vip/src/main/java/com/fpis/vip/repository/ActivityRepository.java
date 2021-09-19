package com.fpis.vip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fpis.vip.entity.ActivityEntity;

@RepositoryRestResource(collectionResourceRel = "activity", path = "activity")
@CrossOrigin("http://localhost:8081")
public interface ActivityRepository extends JpaRepository<ActivityEntity, Long> {

}
