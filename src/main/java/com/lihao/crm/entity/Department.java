package com.lihao.crm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Department {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String function;
}
