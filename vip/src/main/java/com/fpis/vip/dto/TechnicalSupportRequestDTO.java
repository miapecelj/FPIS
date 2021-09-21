package com.fpis.vip.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TechnicalSupportRequestDTO implements Serializable {

	private static final long serialVersionUID = -5547782779181377296L;
	private Long id;
	private LocalDate date;
	private boolean approved;
	private EmployeeDTO employee;
	private List<RequestItemDTO> requestItems = new ArrayList<>();

}
