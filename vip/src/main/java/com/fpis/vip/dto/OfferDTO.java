package com.fpis.vip.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OfferDTO {
	private Long id;
	private LocalDate date;
	private EstimateDTO estimate;
	private List<OfferItemDTO> offerItems;
}
