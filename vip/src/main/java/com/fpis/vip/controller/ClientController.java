package com.fpis.vip.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpis.vip.dto.AddressDTO;
import com.fpis.vip.dto.ClientDTO;
import com.fpis.vip.entity.CityEntity;
import com.fpis.vip.mapper.AddressEntityDtoMapper;
import com.fpis.vip.mapper.ClientEntityDtoMapper;
import com.fpis.vip.repository.AddressRepository;
import com.fpis.vip.repository.CityRepostiory;
import com.fpis.vip.repository.ClientRepository;

@RestController
@RequestMapping("/client")
public class ClientController {
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private ClientEntityDtoMapper clientMapper;
	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private CityRepostiory cityRepository;
	@Autowired
	private AddressEntityDtoMapper addressMapper;

	@GetMapping("/{name}")
	public ResponseEntity<?> findByName(@PathVariable String name) {
		try {
			List<ClientDTO> clients = clientRepository.findByName(name).stream()
					.map(client -> clientMapper.toDto(client)).collect(Collectors.toList());
			return ResponseEntity.status(HttpStatus.OK).body(clients);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}

	@GetMapping("/address/{postalCode}")
	public ResponseEntity<?> findByCity(@PathVariable Long postalCode) {
		try {
			CityEntity city = cityRepository.findByPostalCode(postalCode).get(0);
			List<AddressDTO> addresses = addressRepository.findByCity(city).stream()
					.map(address -> addressMapper.toDto(address)).collect(Collectors.toList());
			return ResponseEntity.status(HttpStatus.OK).body(addresses);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}

}
