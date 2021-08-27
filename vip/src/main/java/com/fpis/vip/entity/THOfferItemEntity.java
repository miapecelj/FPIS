package com.fpis.vip.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class THOfferItemEntity {
	private int orderNumber;
	private THOfferEntity offer;
	private LocalDate activationDate;

}
