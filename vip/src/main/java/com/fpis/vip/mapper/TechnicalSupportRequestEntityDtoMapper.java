package com.fpis.vip.mapper;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fpis.vip.dto.RequestItemDTO;
import com.fpis.vip.dto.TechnicalSupportRequestDTO;
import com.fpis.vip.entity.RequestItemEnitity;
import com.fpis.vip.entity.TechnicalSupportRequestEntity;
import com.fpis.vip.repository.RequestItemRepository;

@Component
@Transactional
public class TechnicalSupportRequestEntityDtoMapper {
	@Autowired
	EmployeeEntityDtoMapper employeeMapper;
	@Autowired
	RequestItemRepository requestItemRepository;
	@Autowired
	RequestItemEntityDtoMapper requestItemMapper;

	public TechnicalSupportRequestEntity toEntity(TechnicalSupportRequestDTO request) {
		TechnicalSupportRequestEntity requestEntity = new TechnicalSupportRequestEntity();
		requestEntity.setApproved(request.isApproved());
		requestEntity.setDate(request.getDate());
		requestEntity.setId(request.getId());
		requestEntity.setEmployee(employeeMapper.toEntity(request.getEmployee()));
		for (RequestItemDTO item : request.getRequestItems()) {
			if (item.getId() != null) {
				Optional<RequestItemEnitity> existingItem = requestItemRepository.findById(item.getId());
				if (existingItem.isPresent()) {
					requestEntity.addRequestItem(existingItem.get());
				}
			} else {
				RequestItemEnitity reqItem = new RequestItemEnitity();
				reqItem.setId(item.getId());
				reqItem.setDescription(item.getDescription());
				reqItem.setOrderNumber(item.getOrderNumber());
				requestEntity.addRequestItem(reqItem);
			}
		}
		return requestEntity;
	}

	public TechnicalSupportRequestDTO toDto(TechnicalSupportRequestEntity request) {
		TechnicalSupportRequestDTO requestDto = new TechnicalSupportRequestDTO();
		requestDto.setApproved(request.isApproved());
		requestDto.setDate(request.getDate());
		requestDto.setId(request.getId());
		requestDto.setEmployee(employeeMapper.toDto(request.getEmployee()));
		for (RequestItemEnitity item : request.getRequestItems()) {
			requestDto.getRequestItems().add(requestItemMapper.toDto(item));
		}
		return requestDto;
	}
}
