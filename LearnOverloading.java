package Week3Day1;

public class LearnOverloading {
	
	public void employeeInfo(){
		
		String name = "Pranjal";
		System.out.println("name is : " +name);
		
	}
	//i cannot have method with same signature twice
	//method shud have different parameters
	//methods can have same paremeters but order shud be changed
	
	public void employeeInfo(String name, int empID){
		
		
		System.out.println("name is : " +name);
		System.out.println("Id is : " +empID);
		
	}
	
	public void employeeInfo(int empID, String name){
		
		
		System.out.println("name is : " +name);
		System.out.println("Id is : " +empID);
		
	}
	
	public void employeeInfo(int empID, String name, int Age){
		
		
		System.out.println("name is : " +name);
		System.out.println("Id is : " +empID);
		System.out.println("Age is : " +Age);
	}

	public static void main(String[] args) {
	
		LearnOverloading obj = new LearnOverloading();
		
		obj.employeeInfo();
		obj.employeeInfo(1001 ,"pranjal");
		obj.employeeInfo("param", 1002);
		obj.employeeInfo(1009,"harsheen",34);

	}

}
