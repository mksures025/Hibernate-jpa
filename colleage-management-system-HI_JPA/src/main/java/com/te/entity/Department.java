package com.te.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Builder
@Entity
@Table(name="department_tbl")
public class Department {
	
	@Column(name="dept_name")
	@Id
	private String departmentName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
	private List<Student> student;


}
