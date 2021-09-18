package com.fpis.vip.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationUnitDTO implements Serializable {

	private static final long serialVersionUID = -8874100882146228088L;
	private Long id;
	private String name;

}
