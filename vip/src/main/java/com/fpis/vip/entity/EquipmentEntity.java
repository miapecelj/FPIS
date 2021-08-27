package com.fpis.vip.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class EquipmentEntity {
	private Long id;
	private String name;
	private String description;
	private String model;
	private boolean warranty;
	private THOfferTypeEntity type;
	private String Space;
}
