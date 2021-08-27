package com.fpis.vip.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditAbilityCheckRequestDto {
	private Long id;
	private LocalDate date;
	private String deliveryType;
	private BankAccountDto bankAccount;
	private EmployeeDTO employeeSend;
	private EmployeeDTO employeeReceive;
	private CreditDTO credit;
}
