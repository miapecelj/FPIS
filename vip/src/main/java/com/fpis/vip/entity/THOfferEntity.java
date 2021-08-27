package com.fpis.vip.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;

import com.fpis.vip.dto.THRequestDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class THOfferEntity {
	private Long id;
	private THRequestDTO request;
	private EmployeeEntity employee;
	private LocalDate date;
	private LocalDate deadline;
	private List<THOfferItemEntity> offerItems;
	private THOfferTypeEntity type;
}
