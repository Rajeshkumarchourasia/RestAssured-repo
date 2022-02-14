package Practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateByCollection {
public static void main(String[] args) {
	
	String s= "Mahabharat";
	HashSet set =new HashSet<>();
	
	for(int i=0;i<s.length();i++)
	{
		set.add(s.charAt(i));
	}
	System.out.println(set);
	
	for(Object ch:set)
	{
		System.out.println(ch);
	}
	
	//Method 2 using linked hashset
	LinkedHashSet set2=new LinkedHashSet<>();
	for(int i=0;i<s.length();i++)
	{
		set2.add(s.charAt(i));
	}
	System.out.println(set2);
	
	for(Object ch:set2)
	{
		System.out.println(ch);
	}
}
}
