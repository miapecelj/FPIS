package com.fpis.vip.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
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
	private TechnicalSupportRequestRepository requestRepository;
	@Autowired
	private TechnicalSupportRequestEntityDtoMapper requestMapper;
	@Autowired
	private RequestItemEntityDtoMapper requestItemMapper;

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

	public TechnicalSupportRequestDTO getById(Long id) throws Exception {
		Optional<TechnicalSupportRequestEntity> entity = requestRepository.findById(id);
		if (entity.isEmpty()) {
			throw new Exception("No such request");
		}
		return requestMapper.toDto(entity.get());

	}

	public List<TechnicalSupportRequestDTO> getAll() throws Exception {
		List<TechnicalSupportRequestEntity> entities = requestRepository.findAll();
		List<TechnicalSupportRequestDTO> dtos = new ArrayList<>();
		for (TechnicalSupportRequestEntity entity : entities) {
			dtos.add(requestMapper.toDto(entity));
		}
		return dtos;

	}

}
