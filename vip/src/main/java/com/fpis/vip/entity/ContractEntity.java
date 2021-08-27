package com.fpis.vip.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContractEntity {
	private Long id;
	private LocalDate creationDate;
	private String note;
	private LocalDate dateFrom;
	private LocalDate dateTo;
	private EmployeeEntity employeeSend;
	private EmployeeEntity employeeReceive;
	private OfferEntity offer;

}
