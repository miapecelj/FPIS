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
public class DeviceAndTariffPackagesOffer {
	private Long id;
	private LocalDate date;
	private EmployeeEntity employee;
	private ClientEntity client;
	private List<DeviceAndPackagesOfferItemEntity> offerItems;

}
