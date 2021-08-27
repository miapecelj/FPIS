package com.fpis.vip.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditTypeDTO {
	private Long id;
	private Long name;
	private CurrencyDTO currency;
}
