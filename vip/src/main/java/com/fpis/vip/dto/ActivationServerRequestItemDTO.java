package com.fpis.vip.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ActivationServerRequestItemDTO {
	private int orderNumber;
	private ServiceDTO service;
	private LocalDate deadline;

}
