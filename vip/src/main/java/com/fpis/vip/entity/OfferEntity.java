package com.fpis.vip.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OfferEntity {
	private Long id;
	private LocalDate date;
	private EstimateEntity estimate;
	private List<OfferItemEntity> offerItems;

}
