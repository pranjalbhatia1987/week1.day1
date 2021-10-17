package org.student;

public class Students {
	
	//this is example of method overloading
	
	public void getStudentInfo()
	{
		System.out.println("Student name is Pranjal Bhatia");
		
	}
	
	public void getStudentInfo(int id)
	{
		System.out.println("Student name is Pranjal Bhatia and id is :" +id);
		
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Student name is :" + name + "and Id is " +id);
		
	}
	
	public void getStudentInfo(String email, int phonenumber)
	{
		System.out.println("Student email is :" + email + "and phonenumber is " +phonenumber);
		
	}
	
	

	public static void main(String[] args) {
		
		Students stds = new Students();
		
		stds.getStudentInfo();
		stds.getStudentInfo(204);
		stds.getStudentInfo(304, "Pranjal");
		stds.getStudentInfo("pranjalbhatia1987@gmail.com", 999);
		
		
	

	}

}
