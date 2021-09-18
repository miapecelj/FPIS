package com.fpis.vip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fpis.vip.entity.CityEntity;

@RepositoryRestResource(collectionResourceRel = "city", path = "city")
public interface CityRepostiory extends JpaRepository<CityEntity, String> {

}
