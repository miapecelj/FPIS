package com.fpis.vip.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fpis.vip.dto.RequestItemDTO;
import com.fpis.vip.dto.TechnicalSupportRequestDTO;
import com.fpis.vip.entity.TechnicalSupportRequestEntity;
import com.fpis.vip.mapper.RequestItemEntityDtoMapper;
import com.fpis.vip.mapper.TechnicalSupportRequestEntityDtoMapper;
import com.fpis.vip.repository.TechnicalSupportRequestRepository;

@Service
@Transactional
public class TechnicalRequestService {
	@Autowired
	TechnicalSupportRequestRepository requestRepository;
	@Autowired
	TechnicalSupportRequestEntityDtoMapper requestMapper;
	@Autowired
	RequestItemEntityDtoMapper requestItemMapper;

	public List<TechnicalSupportRequestDTO> findByDate(Date date) {
		List<TechnicalSupportRequestDTO> requests = requestRepository.findByDate(date).stream()
				.map(request -> requestMapper.toDto(request)).collect(Collectors.toList());
		return requests;
	}

	public void save(TechnicalSupportRequestDTO request) {

		requestRepository.save(requestMapper.toEntity(request));

	}

	public void update(TechnicalSupportRequestDTO request, Long id) {
		TechnicalSupportRequestEntity existingRequest = requestRepository.getById(id);
		existingRequest.getRequestItems().clear();
		for (RequestItemDTO item : request.getRequestItems()) {
			existingRequest.addRequestItem(requestItemMapper.toEntity(item));

		}
		requestRepository.save(existingRequest);

	}

}
