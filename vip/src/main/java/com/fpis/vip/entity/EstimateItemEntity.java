package com.fpis.vip.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstimateItemEntity {
	private int orderNumber;
	private DeviceEntity device;
	private TariffPackageEntity tariffPackage;
}
