package com.fpis.vip.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3352002170479296874L;
	private Long id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private PositionDTO position;
}
