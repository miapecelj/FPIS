package com.fpis.vip.mapper;

import org.mapstruct.Mapper;

import com.fpis.vip.dto.SimpleTechnicalSupportRequestDTO;
import com.fpis.vip.entity.TechnicalSupportRequestEntity;

@Mapper(componentModel = "spring")

public interface SimpleTechnicalSupportRequestEntityDtoMapper {
	public TechnicalSupportRequestEntity toEntity(SimpleTechnicalSupportRequestDTO request);

	public SimpleTechnicalSupportRequestDTO toDto(TechnicalSupportRequestEntity request);
}
