package com.fpis.vip.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8612080539658481813L;
	private Long id;
	private String name;
	private String PIB;
	private String phoneNumber;
	private String webPage;
	private String email;
	private LocalDate yearOfEstablishment;
	private ActivityDTO activity;
	private AddressDTO address;
	private PotentialClientDTO potentialClient;
}
