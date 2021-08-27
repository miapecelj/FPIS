package com.fpis.vip.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PotentialClientEntity {
	private Long id;
	private LocalDate date;
	private String name;
	private String phoneNumber;
	private String email;
	private EmployeeEntity employeeSend;
	private EmployeeEntity employeeReceive;

}
