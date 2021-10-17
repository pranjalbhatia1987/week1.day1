package org.student;

import org.department.Department;

public class Student extends Department {
	
	//use import in case the methods/class are in different package
	//create above 3 class and call all your class methods into the Student using multilevel inheritance.
	public void studentName()
	{
		System.out.println("Student name is Pranjal Bhatia");
		
	}
	public void studentDept()
	{
		System.out.println("Student dept is IT");
		
	}
	public void studentId()
	{
		System.out.println("Student Id is 304");
		
	}

	public static void main(String[] args) {
		
		Student std = new Student();
		
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptName();
		std.studentName();
		std.studentDept();
		std.studentId();
		

	}

}
