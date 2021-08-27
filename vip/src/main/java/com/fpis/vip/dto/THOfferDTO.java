package com.fpis.vip.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class THOfferDTO {
	private Long id;
	private THRequestDTO request;
	private EmployeeDTO employee;
	private LocalDate date;
	private LocalDate deadline;
	private List<THOfferItemDTO> offerItems;
	private THOfferTypeDTO type;
}
