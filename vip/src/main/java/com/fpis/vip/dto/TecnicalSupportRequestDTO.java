package com.fpis.vip.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TecnicalSupportRequestDTO {
	private Long id;
	private LocalDate date;
	private boolean approved;
	private ContractDTO contract;
	private EmployeeDTO employee;
	private List<RequestItemDTO> requestItems;

}