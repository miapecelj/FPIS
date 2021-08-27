package com.fpis.vip.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreditTypeEntity {
	private Long id;
	private Long name;
	private CurrencyEntity currency;
}
