package com.fpis.vip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fpis.vip.entity.EmployeeEntity;
@RepositoryRestResource(collectionResourceRel = "employee", path="employee")
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{

}
