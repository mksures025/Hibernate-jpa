package com.te.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.entity.Department;
import com.te.entity.Student;

public class CollegeRepository {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Mysqlcms");
	EntityManager entityManager = emf.createEntityManager();

	public String insertData(Student student) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

		entityManager.persist(student);

		transaction.commit();

		return student.getStudentId();
	}

	public String fetchStudent1(String studentId) {

		Student student1 = entityManager.find(Student.class, studentId);

		return student1.getStudentId();

	}

	public List<Student> fetchDepartment(String i) {

		Department dept = entityManager.find(Department.class, i);
		return dept.getStudent();
	}


	public String updateDepartment(String old, String newDept) {

		entityManager.getTransaction().begin();

		Department department = entityManager.find(Department.class, old);

		department.setDepartmentName(newDept);
		entityManager.persist(department);
		
		
		entityManager.getTransaction().commit();


		return department.getDepartmentName();

	}

}
