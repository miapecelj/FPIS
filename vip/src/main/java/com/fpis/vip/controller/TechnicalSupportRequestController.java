package com.fpis.vip.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpis.vip.dto.TechnicalSupportRequestDTO;
import com.fpis.vip.service.TechnicalRequestService;

@RestController
@RequestMapping("/request")
public class TechnicalSupportRequestController {

	@Autowired
	private TechnicalRequestService requestService;

	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(requestService.getById(id));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}

	@GetMapping
	public ResponseEntity<?> getAll() {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(requestService.getAll());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}

	@GetMapping("/find/{dateString}")
	public ResponseEntity<?> findByDate(@PathVariable String dateString) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate localDate = LocalDate.parse(dateString, formatter);
			List<TechnicalSupportRequestDTO> requests = requestService.findByDate(localDate);
			return ResponseEntity.status(HttpStatus.OK).body(requests);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}

	@PostMapping
	public ResponseEntity<?> create(@RequestBody TechnicalSupportRequestDTO request) {
		try {
			Long id = requestService.save(request);
			return ResponseEntity.status(HttpStatus.OK).body(id);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody TechnicalSupportRequestDTO request, @PathVariable Long id) {
		try {
			requestService.update(request, id);
			return ResponseEntity.status(HttpStatus.OK).body("Succesfuly saved");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}

}
