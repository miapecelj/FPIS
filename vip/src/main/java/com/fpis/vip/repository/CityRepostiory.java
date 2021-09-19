package com.fpis.vip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fpis.vip.entity.CityEntity;

@RepositoryRestResource(collectionResourceRel = "city", path = "city")
@CrossOrigin("http://localhost:8081")
public interface CityRepostiory extends JpaRepository<CityEntity, String> {

}
