package com.fpis.vip.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import com.fpis.vip.dto.CurrencyDTO;
import com.fpis.vip.util.Status;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BankAccountEntity {
	private Long id;
	private CurrencyDTO currency;
	private LocalDate openingDate;
	private double averageMonthlyIncome;
	private double averageMonthlyExpense;
	private Status status;
	private String ownerName;
}
