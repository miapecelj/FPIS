package com.fpis.vip.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.fpis.vip.dto.AddressDTO;
import com.fpis.vip.entity.AddressEntity;

@Mapper(componentModel = "spring", uses = {CityEntityDtoMapper.class}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AddressEntityDtoMapper {
	public AddressEntity toEntity(AddressDTO address);
	public AddressDTO toDto(AddressEntity address);
}
