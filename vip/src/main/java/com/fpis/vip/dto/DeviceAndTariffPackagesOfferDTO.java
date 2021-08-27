package com.fpis.vip.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeviceAndTariffPackagesOfferDTO {
	private Long id;
	private LocalDate date;
	private EmployeeDTO employee;
	private ClientDTO client;
	private List<DeviceAndPackagesOfferItemDTO> offerItems;

}
