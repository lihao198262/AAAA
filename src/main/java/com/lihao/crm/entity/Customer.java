package com.lihao.crm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Customer {
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	private SysUser user;
	private Boolean isDelete = false;

	private String name;
	@ManyToOne
	private SysSex sex;

	@ManyToOne
	private Company company;

	@ManyToOne
	private Department department;

	@ManyToOne
	private SysDuty duty;

	private String officePhone;
	private String fax;
	private String phone;
	private String email;
	private String address;
	private Boolean isPrimary;
}
