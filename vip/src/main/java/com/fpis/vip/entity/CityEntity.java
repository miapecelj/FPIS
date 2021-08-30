package com.fpis.vip.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="city")
public class CityEntity {
	@Id
	@Column(name="postal_code")
	private Long postalCode;
	private String name;

}
