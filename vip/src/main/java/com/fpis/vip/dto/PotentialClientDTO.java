package com.fpis.vip.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PotentialClientDTO {
	private Long id;
	private LocalDate date;
	private String name;
	private String phoneNumber;
	private String email;
	private EmployeeDTO employeeSend;
	private EmployeeDTO employeeReceive;
}
