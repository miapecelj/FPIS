package com.fpis.vip.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "request_item")
public class RequestItemEnitity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int orderNumber;
	private String description;
	@ManyToOne(cascade = CascadeType.MERGE,optional = false)
	@JoinColumn(name = "request_id", referencedColumnName = "id", nullable = false)
	@RestResource(exported = false)
	private TechnicalSupportRequestEntity request;

}
