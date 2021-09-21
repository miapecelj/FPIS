package com.fpis.vip.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "technical_support_request")
public class TechnicalSupportRequestEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate date;
	private boolean approved;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "employee_id", referencedColumnName = "id")
	@RestResource(exported = false)
	private EmployeeEntity employee;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "request")
	@RestResource(exported = false)
	private List<RequestItemEnitity> requestItems = new ArrayList<RequestItemEnitity>();

	public void addRequestItem(RequestItemEnitity requestItemEntity) {
		requestItems.add(requestItemEntity);
		requestItemEntity.setRequest(this);
	}

	public void removeRequestItem(RequestItemEnitity requestItemEntity) {
		requestItems.remove(requestItemEntity);
		requestItemEntity.setRequest(null);
	}

}
