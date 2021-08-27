package com.fpis.vip.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EstimateDTO {
	private Long id;
	private LocalDate date;
	private String note;
	private double discount;
	private double priceWithDiscount;
	private EmployeeDTO employeeSend;
	private EmployeeDTO employeeReceive;
	private List<EstimateItemDTO> estimateItems;
}
