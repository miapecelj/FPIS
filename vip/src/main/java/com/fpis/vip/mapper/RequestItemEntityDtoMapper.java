package com.fpis.vip.mapper;

import org.mapstruct.Mapper;

import com.fpis.vip.dto.RequestItemDTO;
import com.fpis.vip.entity.RequestItemEnitity;

@Mapper(componentModel = "spring")
public interface RequestItemEntityDtoMapper {
	public RequestItemEnitity toEntity(RequestItemDTO item);

	public RequestItemDTO toDto(RequestItemEnitity item);
}
