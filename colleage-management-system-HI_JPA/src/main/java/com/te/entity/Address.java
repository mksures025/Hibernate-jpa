package com.te.entity;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Builder
@Entity
@Table(name="addresses_tbl")
public class Address {

	@Column(name="address_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id 
	private int addessId;
	
	private String state;
	private String district;
	private long pincode;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="stu_id")
	private Student student;

}
