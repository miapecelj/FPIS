package com.fpis.vip.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class THOfferItemDTO {
	private int orderNumber;
	private THOfferDTO offer;
	private LocalDate activationDate;

}
