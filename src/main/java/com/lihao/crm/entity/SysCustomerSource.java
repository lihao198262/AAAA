package com.lihao.crm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class SysCustomerSource {
	
	@Id
	private Long id;
	private String name;
}
