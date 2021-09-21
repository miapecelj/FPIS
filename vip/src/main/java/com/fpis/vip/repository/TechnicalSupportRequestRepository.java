package com.fpis.vip.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpis.vip.entity.TechnicalSupportRequestEntity;

public interface TechnicalSupportRequestRepository extends JpaRepository<TechnicalSupportRequestEntity, Long> {

	List<TechnicalSupportRequestEntity> findByDate(LocalDate localDate);

}
