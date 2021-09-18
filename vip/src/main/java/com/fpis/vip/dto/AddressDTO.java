package com.fpis.vip.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO implements Serializable {

	private static final long serialVersionUID = 3686468908704480681L;
	private Long id;
	private CityDTO city;
	private String street;
	private String number;
}
