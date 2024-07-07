package com.te.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@ToString
@Builder
@Entity
@Table(name="student_tbl")
public class Student {
	
	@Column(name="stu_Id")
	@Id 
	private String studentId;
	@Column(name="stu_name")
	private String studentName;
	
	//Bidirectional
	@ManyToOne(cascade = CascadeType.ALL)
	private Department department;
	
	//Bidirectional
	@OneToMany(mappedBy ="student"  ,cascade = CascadeType.ALL)
	private List<Address> address;

}
