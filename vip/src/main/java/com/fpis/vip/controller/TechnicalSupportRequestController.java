package com.fpis.vip.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fpis.vip.dto.TechnicalSupportRequestDTO;
import com.fpis.vip.service.TechnicalRequestService;

@RestController
public class TechnicalSupportRequestController {

	@Autowired
	TechnicalRequestService requestService;

	@GetMapping("requests/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(requestService.getById(id));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}

	@GetMapping("requests")
	public ResponseEntity<?> getAll() {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(requestService.getAll());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}

	@GetMapping("requests/{dateString}")
	public ResponseEntity<?> findByName(@PathVariable String dateString) {
		try {
			System.out.println(dateString);
			SimpleDateFormat sdfDateDMY = new SimpleDateFormat("dd-MM-yyyy");
			Date date = sdfDateDMY.parse(dateString);
			List<TechnicalSupportRequestDTO> requests = requestService.findByDate(date);
			return ResponseEntity.status(HttpStatus.OK).body(requests);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}

	@PostMapping("/requests")
	public ResponseEntity<?> create(@RequestBody TechnicalSupportRequestDTO request) {
		try {
			requestService.save(request);
			return ResponseEntity.status(HttpStatus.OK).body("Succesfuly saved");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}

	@PutMapping("/requests/{id}")
	public ResponseEntity<?> update(@RequestBody TechnicalSupportRequestDTO request, @PathVariable Long id) {
		try {
			requestService.update(request, id);
			return ResponseEntity.status(HttpStatus.OK).body("Succesfuly saved");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}

}
