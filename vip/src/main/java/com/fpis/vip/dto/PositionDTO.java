package com.fpis.vip.dto;

import com.fpis.vip.entity.OrganizationUnitEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PositionDTO {
	private Long id;
	private String name;
	private OrganizationUnitEntity organizationUnit;
}
