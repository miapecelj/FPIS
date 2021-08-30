package com.fpis.vip.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "client")
public class ClientEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String PIB;
	@Column(name = "phone_number")
	private String phoneNumber;
	@Column(name = "web_page")
	private String webPage;
	@Column(name = "year_of_establishment")
	private LocalDate yearOfEstablishment;
	@ManyToOne(cascade = { CascadeType.MERGE })
	@JoinColumn(name = "activity_code", referencedColumnName = "code")
	@RestResource(exported = false)
	private AcitvityEntity activity;
	@ManyToOne(cascade = { CascadeType.MERGE })
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	@RestResource(exported = false)
	private AddressEntity address;
	@ManyToOne(cascade = { CascadeType.MERGE })
	@JoinColumn(name = "potential_client", referencedColumnName = "id")
	@RestResource(exported = false)
	private PotentialClientEntity potentialClient;

}
