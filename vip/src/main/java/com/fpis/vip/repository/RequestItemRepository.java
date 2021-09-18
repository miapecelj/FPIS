package com.fpis.vip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fpis.vip.entity.RequestItemEnitity;

@RepositoryRestResource(collectionResourceRel = "requestItem", path = "requestItem")
public interface RequestItemRepository extends JpaRepository<RequestItemEnitity, Long> {

}
