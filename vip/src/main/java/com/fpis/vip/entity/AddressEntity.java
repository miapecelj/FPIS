package com.fpis.vip.entity;

import javax.persistence.Entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressEntity {
	private Long id;
	private CityEntity city;
	private String street;
	private String number;
}
