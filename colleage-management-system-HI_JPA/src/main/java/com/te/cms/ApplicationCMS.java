package com.te.cms;

import java.util.ArrayList;
import java.util.List;

import com.te.entity.Address;
import com.te.entity.Department;
import com.te.entity.Student;
import com.te.repository.CollegeRepository;

public class ApplicationCMS {
	public static void main(String[] args) {
		CollegeRepository cmsRepository = new CollegeRepository();
		


		// department object

        Department deptAuto = Department.builder().departmentName("Automobile").build();

		Department deptCsc = Department.builder().departmentName("CSC").build();

		// addresses object
		Address permnentAddress = Address.builder().state("tamilnadu").district("tanjavur").pincode(614014)
				.build();
		Address tempAddress = Address.builder().state("tamilnadu").district("chennai").pincode(614014)
				.build();
		Address permanentAddress1 = Address.builder().state("Karnataga").district("bangaluru").pincode(567892)
				.build();

		ArrayList<Address> addresses = new ArrayList<Address>();
		addresses.add(permnentAddress);
		addresses.add(tempAddress);

		ArrayList<Address> addresses1 = new ArrayList<Address>();
		addresses1.add(permanentAddress1);

		
		// student object
		Student student1 = Student.builder().studentId("04auto0190").studentName("suresh")
				.address(addresses)
				.department(deptAuto)
				.build();

		Student student2 = Student.builder().studentId("05CSC01").studentName("sathish")
				.address(addresses1)
				.department(deptCsc).build();
		
		Student student3 = Student.builder().studentId("05CSC02").studentName("pranav")
				.address(null)
				.department(deptCsc).build();

		ArrayList<Student> studentAuto = new ArrayList<Student>();
		studentAuto.add(student1);

		ArrayList<Student> studentCSC = new ArrayList<Student>();
		studentCSC.add(student2);
		studentCSC.add(student3);

		// set address and department to student object

	     deptAuto.setStudent(studentAuto);
	     deptCsc.setStudent(studentCSC);
	     
	     permnentAddress.setStudent(student1);
	     tempAddress.setStudent(student1);
	     permanentAddress1.setStudent(student2);
		
		

		// CRUD OPERATION
		// 1. insert -To insert the data into database
//
//		String StudentId1 = cmsRepository.insertData(student1);
//		String StudentId2 = cmsRepository.insertData(student2);
//		String StudentId3 = cmsRepository.insertData(student3);
//
//
//		// 2.FETCH -to fetch the data from database
//		
//		
//		    // using StudentId and student object
//		String students1 = cmsRepository.fetchStudent1(StudentId1);
//		System.out.println("Student Id :"+students1);
//
//		    // using Department object to fetch the data
//		System.out.println("---------------------------------------");
//		List<Student> depdId=cmsRepository.fetchDepartment("CSC");
//		   
//        for (Student student : depdId) {
//        	
//			System.out.println(student.getStudentId());
//			System.out.println(student.getStudentName());
//			System.out.println(student.getDepartment().getDepartmentName());
//			System.out.println(student.getAddress());
//			System.out.println("-----------------------");
//		}
            
      // 4.update
           
   
       String updateDeptName= cmsRepository.updateDepartment("Automobile","it"); 
       System.out.println(updateDeptName);
       
  
		
	}
    
}
