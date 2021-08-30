package com.fpis.vip.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.fpis.vip.dto.EmployeeDTO;
import com.fpis.vip.entity.EmployeeEntity;

@Mapper(componentModel = "spring", uses = {
		PositionEntityDtoMapper.class }, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface EmployeeEntityDtoMapper {
	public EmployeeEntity toEntity(EmployeeDTO position);

	public EmployeeDTO toDto(EmployeeEntity position);
}
