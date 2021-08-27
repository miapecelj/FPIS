package com.fpis.vip.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class THContractDTO {
	private Long id;
	private THOfferDTO offer;
	private LocalDate dateFrom;
	private LocalDate dateTo;
	private LocalDate creationDate;
}
