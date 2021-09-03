package com.fpis.vip.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fpis.vip.repository.TechnicalSupportRequestRepository;

@RestController
public class TechnicalSupportRequestController {
	
	@Autowired
	TechnicalSupportRequestRepository requestController;
	
	@GetMapping("requests/{date}")
	public ResponseEntity<?> findByName(@PathVariable LocalDate date){
		try {
			return  ResponseEntity.status(HttpStatus.OK).body(requestController.findByDate(date));
		} catch (Exception e) {
			return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}

}
