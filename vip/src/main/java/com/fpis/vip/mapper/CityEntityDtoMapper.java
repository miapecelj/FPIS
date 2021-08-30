package com.fpis.vip.mapper;

import org.mapstruct.Mapper;

import com.fpis.vip.dto.CityDTO;
import com.fpis.vip.entity.CityEntity;

@Mapper(componentModel = "spring")
public interface CityEntityDtoMapper {
	
	public CityEntity toEntity(CityDTO city);
	public CityDTO toDto(CityEntity city);

}
