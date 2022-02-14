package Practice;

import java.util.LinkedHashSet;

public class OccurenceOfEachWord {
public static void main(String[] args) {
	String s= "Hello World Hello Welcome to TY";
	String [] sArray =s.split(" ");
	System.out.println(sArray.length);
	System.out.println(sArray.toString());
	
	for(String word: sArray )
	{
		System.out.println(word);
	}
			LinkedHashSet<String>set=new LinkedHashSet<String>();
			
			for(String word1: sArray)
			{
				set.add(word1);
			}
			
			for(String word2: set)
			{
				int count=0;
				for(String word3: sArray)
				{
					if(word2.equals(word3))
					{
						count++;
						
					}
				}
				System.out.println(word2+": "+count);
			}
}
}
