package com.fpis.vip.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ContractDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -819210298520981518L;
	private Long id;
	private LocalDate creationDate;
	private String note;
	private LocalDate dateFrom;
	private LocalDate dateTo;
}
