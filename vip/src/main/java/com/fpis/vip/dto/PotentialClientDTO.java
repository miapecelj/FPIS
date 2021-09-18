package com.fpis.vip.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PotentialClientDTO implements Serializable {

	private static final long serialVersionUID = 8146093903282986976L;
	private Long id;
	private LocalDate date;
	private String name;
	private String phoneNumber;
	private String email;
	private EmployeeDTO employeeSend;
	private EmployeeDTO employeeReceive;
}
