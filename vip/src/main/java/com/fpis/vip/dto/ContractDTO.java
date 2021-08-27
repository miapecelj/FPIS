package com.fpis.vip.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ContractDTO {
	private Long id;
	private LocalDate creationDate;
	private String note;
	private LocalDate dateFrom;
	private LocalDate dateTo;
	private EmployeeDTO employeeSend;
	private EmployeeDTO employeeReceive;
	private OfferDTO offer;
}
