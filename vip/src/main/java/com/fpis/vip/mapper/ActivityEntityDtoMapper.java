package com.fpis.vip.mapper;

import org.mapstruct.Mapper;

import com.fpis.vip.dto.ActivityDTO;
import com.fpis.vip.entity.ActivityEntity;

@Mapper(componentModel = "spring")
public interface ActivityEntityDtoMapper {
	public ActivityEntity toEntity(ActivityDTO acitivity);
	public ActivityDTO toDto(ActivityEntity activity);
}
