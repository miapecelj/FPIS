package com.fpis.vip.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.fpis.vip.dto.PositionDTO;
import com.fpis.vip.entity.PositionEntity;

@Mapper(componentModel = "spring", uses = {OrganizationUnitEntityDtoMapper.class}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)

public interface PositionEntityDtoMapper {
	public PositionEntity toEntity(PositionDTO position);
	public PositionDTO toDto(PositionEntity position);

}
