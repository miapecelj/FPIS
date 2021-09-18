package com.fpis.vip.dto;

import java.io.Serializable;

import com.fpis.vip.entity.OrganizationUnitEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PositionDTO implements Serializable {

	private static final long serialVersionUID = -9121756037705863909L;
	private Long id;
	private String name;
	private OrganizationUnitEntity organizationUnit;
}
