package com.fpis.vip.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstimateEntity {
	private Long id;
	private LocalDate date;
	private String note;
	private double discount;
	private double priceWithDiscount;
	private EmployeeEntity employeeSend;
	private EmployeeEntity employeeReceive;
	private List<EstimateItemEntity> estimateItems;
}
