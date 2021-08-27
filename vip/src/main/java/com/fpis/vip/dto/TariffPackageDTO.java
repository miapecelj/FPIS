package com.fpis.vip.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TariffPackageDTO {
	private Long id;
	private String name;
	private int minutes;
	private int sms;
	private double mb;
	private TariffPacketTypeDTO type;
}
