package com.fpis.vip.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import com.fpis.vip.util.Status;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreditEntity {
	private Long id;
	private CreditTypeEntity creditType;
	private ClientEntity client;
	private double approvedAmount;
	private double usedAmount;
	private LocalDate useStartDate;
	private LocalDate paymentStartDate;
	private LocalDate paymentEndDate;
	private int paymentPeriod;
	private double restOfDebt;
	private Status status;
}
