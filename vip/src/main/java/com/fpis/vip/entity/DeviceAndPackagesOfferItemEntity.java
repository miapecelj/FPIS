package com.fpis.vip.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DeviceAndPackagesOfferItemEntity {
	private int orderNumber;
	private DeviceEntity device;
	private TariffPackageEntity tariffPackage;

}
