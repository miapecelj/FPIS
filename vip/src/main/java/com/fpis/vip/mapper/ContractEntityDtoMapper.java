package com.fpis.vip.mapper;

import org.mapstruct.Mapper;

import com.fpis.vip.dto.ContractDTO;
import com.fpis.vip.entity.ContractEntity;

@Mapper(componentModel = "spring")
public interface ContractEntityDtoMapper {
	public ContractEntity toEntity(ContractDTO contract);
	public ContractDTO toDto(ContractEntity contract);

}
