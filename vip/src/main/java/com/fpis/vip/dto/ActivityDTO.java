package com.fpis.vip.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivityDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8444986044936934357L;
	private Long code;
	private String name;
}
