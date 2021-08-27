package com.fpis.vip.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
	private Long id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private PositionEntity position;
}
