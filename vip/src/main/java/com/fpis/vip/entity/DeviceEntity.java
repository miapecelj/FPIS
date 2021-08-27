package com.fpis.vip.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeviceEntity {
	private Long id;
	private String name;
	private String model;
	private String color;
	private double price;
	private ManufacturerEntity manufacturer;
}
