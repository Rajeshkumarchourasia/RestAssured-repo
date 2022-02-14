package Practice;

public class MaxLengthOfStringInArray {
public static void main(String[] args) {
	
	String [] str = {"a","b","ab","abc","def","abcde","efgjh"};
	
	//elements having the max length
	
	//assume o index is the max element
	String maxElement =str[0];
	for(int i=1;i<str.length;i++)
	{
		if(maxElement.length()<str[i].length())
		{
			maxElement=str[i];
		}
	}
	//System.out.println(maxElement);this line given only one word.
	for(int i=0;i<str.length;i++)
	{
		if(maxElement.length()==str[i].length())
		{
			System.out.println(str[i]);
		}
	}
}
}
