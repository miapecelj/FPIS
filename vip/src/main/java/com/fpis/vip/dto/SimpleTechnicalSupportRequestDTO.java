package com.fpis.vip.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SimpleTechnicalSupportRequestDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5406729749154597898L;
	private Long id;
	private LocalDate date;
	private boolean approved;
	private ContractDTO contract;
	private EmployeeDTO employee;
}
