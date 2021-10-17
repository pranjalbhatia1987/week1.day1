package org.Bank;

public class CharacterIndexAssignment {

	public static void main(String[] args) {
		
		String text = "Java Exercise";
		int strlenth = text.length();
		System.out.println("initial string length is " +strlenth);
		
		for(int i=0;i<strlenth;i++)
			
		{
					
			if(text.charAt(i)=='E')
			{
				int pos = text.indexOf('E');
				System.out.println("the index for E is " +pos);
				
			}
			
			else if(text.charAt(i)=='s')
			{
				int pos2 = text.indexOf('s');
				System.out.println("the index for s is " +pos2);
				
			}
			
			
		}

	}

}
