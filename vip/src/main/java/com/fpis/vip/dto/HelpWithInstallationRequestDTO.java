package com.fpis.vip.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class HelpWithInstallationRequestDTO {
	private Long id;
	private LocalDate sendDate;
	private boolean approved;
	private LocalDateTime appointment;
	private THOfferDTO offer;
	private EmployeeDTO employee;
}
