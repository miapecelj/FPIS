package com.fpis.vip.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class THOfferTypeEntity {
	private Long id;
	private String name;
	private String description;
}
