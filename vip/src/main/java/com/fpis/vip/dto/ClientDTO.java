package com.fpis.vip.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {
	private Long id;
	private String name;
	private String PIB;
	private String phoneNumber;
	private String webPage;
	private LocalDate yearOfEstablishment;
	private AcitvityDTO acitvity;
	private AddressDTO address;
	private PotentialClientDTO potentialClient;
}
