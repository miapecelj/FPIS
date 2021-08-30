package com.fpis.vip.mapper;

import org.mapstruct.Mapper;

import com.fpis.vip.dto.OrganizationUnitDTO;
import com.fpis.vip.entity.OrganizationUnitEntity;

@Mapper(componentModel = "spring")
public interface OrganizationUnitEntityDtoMapper {
	public OrganizationUnitEntity toEntity(OrganizationUnitDTO organizationUnit);
	public OrganizationUnitDTO toDto(OrganizationUnitEntity organizationUnit);

}
