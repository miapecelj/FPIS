package com.fpis.vip.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RequestItemDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6496770138145690271L;
	private Long id;
	private int orderNumber;
	private String description;

}
