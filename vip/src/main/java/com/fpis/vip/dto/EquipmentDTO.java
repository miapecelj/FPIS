package com.fpis.vip.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EquipmentDTO {
	private Long id;
	private String name;
	private String description;
	private String model;
	private boolean warranty;
	private THOfferTypeDTO type;
	private String Space;
}
