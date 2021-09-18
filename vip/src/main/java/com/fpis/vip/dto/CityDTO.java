package com.fpis.vip.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CityDTO implements Serializable {

	private static final long serialVersionUID = -7695785471043029729L;
	private Long postalCode;
	private String name;
}
