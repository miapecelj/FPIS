package com.fpis.vip.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {
	private Long id;
	private CityDTO city;
	private String street;
	private String number;
}
