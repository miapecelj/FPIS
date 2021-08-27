package com.fpis.vip.dto;

import java.time.LocalDate;

import com.fpis.vip.util.Status;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreditDTO {
	private Long id;
	private CreditTypeDTO creditType;
	private ClientDTO client;
	private double approvedAmount;
	private double usedAmount;
	private LocalDate useStartDate;
	private LocalDate paymentStartDate;
	private LocalDate paymentEndDate;
	private int paymentPeriod;
	private double restOfDebt;
	private Status status;
}
