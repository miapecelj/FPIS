package com.fpis.vip.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.fpis.vip.dto.RequestItemDTO;
import com.fpis.vip.entity.RequestItemEnitity;

@Mapper(componentModel = "spring", uses = {
		SimpleTechnicalSupportRequestEntityDtoMapper.class }, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface RequestItemEntityDtoMapper {
	public RequestItemEnitity toEntity(RequestItemDTO item);

	public RequestItemDTO toDto(RequestItemEnitity item);
}
