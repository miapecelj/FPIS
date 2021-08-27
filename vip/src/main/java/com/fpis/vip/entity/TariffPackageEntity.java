package com.fpis.vip.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TariffPackageEntity {
	private Long id;
	private String name;
	private int minutes;
	private int sms;
	private double mb;
	private TariffPacketTypeEntity type;
}
