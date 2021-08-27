package com.fpis.vip.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
	private Long id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private PositionDTO position;
}
