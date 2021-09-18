package com.fpis.vip.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "request_item")
public class RequestItemEnitity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int orderNumber;
	private String description;
	@ManyToOne(fetch = FetchType.LAZY)
	@RestResource(exported = false)
	private TechnicalSupportRequestEntity request;

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof RequestItemEnitity))
			return false;
		return id != null && id.equals(((RequestItemEnitity) o).getId());
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}
