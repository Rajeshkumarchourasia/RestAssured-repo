package Practice;

import java.util.LinkedHashSet;

public class NumberOfEachCharater {
public static void main(String[] args) {
	
	String s= "Rajesh";
	System.out.println("Original String="+s);
	
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	
	for(int i=0;i<s.length();i++)
	{
		set.add(s.charAt(i));
	}
	for(Character ch : set)
	{
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
				count++;
				
			}
		}
		System.out.println(ch+";"+count);
	}
}
}
