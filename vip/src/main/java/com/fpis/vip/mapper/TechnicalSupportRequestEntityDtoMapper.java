package com.fpis.vip.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.fpis.vip.dto.TechnicalSupportRequestDTO;
import com.fpis.vip.entity.TechnicalSupportRequestEntity;

@Mapper(componentModel = "spring",uses = {
		RequestItemEntityDtoMapper.class }, injectionStrategy = InjectionStrategy.CONSTRUCTOR)

public interface TechnicalSupportRequestEntityDtoMapper {
	public TechnicalSupportRequestEntity toEntity(TechnicalSupportRequestDTO request);
	public TechnicalSupportRequestDTO toDto(TechnicalSupportRequestEntity request);
}
