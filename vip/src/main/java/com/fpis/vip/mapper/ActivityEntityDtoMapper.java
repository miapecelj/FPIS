package com.fpis.vip.mapper;

import org.mapstruct.Mapper;

import com.fpis.vip.dto.ActivityDTO;
import com.fpis.vip.entity.AcitvityEntity;

@Mapper(componentModel = "spring")
public interface ActivityEntityDtoMapper {
	public AcitvityEntity toEntity(ActivityDTO acitivity);
	public ActivityDTO toDto(AcitvityEntity activity);
}
