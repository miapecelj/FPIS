package com.fpis.vip.dto;

import java.time.LocalDate;

import com.fpis.vip.util.Status;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankAccountDto {
	private Long id;
	private CurrencyDTO currency;
	private LocalDate openingDate;
	private double averageMonthlyIncome;
	private double averageMonthlyExpense;
	private Status status;
	private String ownerName;
}
