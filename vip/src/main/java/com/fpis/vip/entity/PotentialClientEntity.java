package com.fpis.vip.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "potential_client")
public class PotentialClientEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate date;
	private String name;
	@Column(name = "phone_number")
	private String phoneNumber;
	private String email;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "employee_send_id", referencedColumnName = "id")
	@RestResource(exported = false)
	private EmployeeEntity employeeSend;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "employee_receive_id", referencedColumnName = "id")
	@RestResource(exported = false)
	private EmployeeEntity employeeReceive;

}
