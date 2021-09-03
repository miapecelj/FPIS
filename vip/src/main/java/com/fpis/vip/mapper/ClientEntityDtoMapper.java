package com.fpis.vip.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.fpis.vip.dto.ClientDTO;
import com.fpis.vip.entity.ClientEntity;


@Mapper(componentModel = "spring", uses = {AddressEntityDtoMapper.class, PotentialClientEntityDtoMapper.class,
		ActivityEntityDtoMapper.class},
injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ClientEntityDtoMapper {
	
	public ClientEntity toEntity(ClientDTO client);
	public ClientDTO toDto(ClientEntity client);

}
