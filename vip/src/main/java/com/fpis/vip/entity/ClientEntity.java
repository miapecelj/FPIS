package com.fpis.vip.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientEntity {
	private Long id;
	private String name;
	private String PIB;
	private String phoneNumber;
	private String webPage;
	private LocalDate yearOfEstablishment;
	private AcitvityEntity acitvity;
	private AddressEntity address;
	private PotentialClientEntity potentialClient;

}
