package com.fpis.vip.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class DeviceAndPackagesOfferItemDTO {
	private int orderNumber;
	private DeviceDTO device;
	private TariffPackageDTO tariffPackage;

}
