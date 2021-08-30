package com.fpis.vip.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.fpis.vip.dto.PotentialClientDTO;
import com.fpis.vip.entity.PotentialClientEntity;

@Mapper(componentModel = "spring", uses = {EmployeeEntityDtoMapper.class},injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface PotentialClientEntityDtoMapper {
	public PotentialClientEntity toEntity(PotentialClientDTO potentialClient);
	public PotentialClientDTO toDto(PotentialClientEntity potentialClient);

}
