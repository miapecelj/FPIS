package com.fpis.vip.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class THRequestDTO {
	private Long id;
	private LocalDate date;
	private boolean approved;
	private ClientDTO client;
	private EmployeeDTO employee;

}
