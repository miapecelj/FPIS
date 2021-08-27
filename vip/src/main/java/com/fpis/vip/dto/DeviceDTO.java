package com.fpis.vip.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeviceDTO {
	private Long id;
	private String name;
	private String model;
	private String color;
	private double price;
	private ManufacturerDTO manufacturer;
}
