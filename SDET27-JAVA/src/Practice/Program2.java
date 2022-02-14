package Practice;

import java.util.LinkedHashSet;

public class Program2 {
public static void main(String[] args) {
	
	int [] arr = {1,2,3,2,4,1}; // o/p 1,2
	
	//step 1 create a set
	LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
	
	//step 2 Add all the element of an array to set
	for(int i=0;i<arr.length;i++)
	{
		set.add(arr[i]);
	}                            //{1,2,3,4}
	
	//step 3 Compare the element of set with the element of an array
	for(Integer n :set)
	{
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			if(n ==arr[i])
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.print(n+" ");
		}
	}
	//step 4 print the matched element 
}
}
