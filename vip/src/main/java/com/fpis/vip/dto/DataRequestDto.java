package com.fpis.vip.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataRequestDto {
	private Long id;
	private LocalDate date;
	private int numberOfEmployees;
	private int numberOfSIMCars;
	private EmployeeDTO employee;
	private ClientDTO client;

}
