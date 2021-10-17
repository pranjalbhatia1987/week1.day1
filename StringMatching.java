package org.Comparison;

public class StringMatching {
	
	//Referential Equality means two reference variable pointing to the same object in Java heap.
	//Generally programmers use == to compare string values which is wrong.
	//For comparing two string values equals () method is used. 
	//== operator is only used to check two string variable pointing to the same memory location.

	public static void main(String[] args) {
		
		String str3 = new String("Kutty");
		String str4 = new String("Kutty");

		if(str3==str4) {
		System.out.println(" Same text");
		}
		else
		System.out.println("Diff text");
		
		if(str3.equals(str4)) {
		System.out.println(" Same text1");
		}
		else
		System.out.println("Diff text1");
		
		if(str3.equalsIgnoreCase(str4)) {
		System.out.println(" Same text2");
		}
		else
		System.out.println("Diff text2");
		
		//But beware of nulls!

		//== handles null strings fine, but calling .equals() from a null string will cause an exception:

		String nullString1 = null;
		String nullString2 = null;

		// Evaluates to true
		System.out.print(nullString1 == nullString2);

		// Throws a NullPointerException
		//System.out.print(nullString1.equals(nullString2));
		
		        String str1="I am Learning Java";
				String str2="I am learning java";
						
				
				if(str1==str2) {
					System.out.println(" Same text4");
					}
					else
					System.out.println("Diff text4");
					
					if(str1.equals(str2)) {
					System.out.println(" Same text5");
					}
					else
					System.out.println("Diff text5");
					
					if(str1.equalsIgnoreCase(str2)) {
					System.out.println(" Same text6");
					}
					else
					System.out.println("Diff text6");

		
	

	}

}
