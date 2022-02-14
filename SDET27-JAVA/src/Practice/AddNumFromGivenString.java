package Practice;

public class AddNumFromGivenString {
public static void main(String[] args) {
	String s="a1b2c3";
	int sum=0;
	for(int i=0;i<s.length();i++) 
	{
		if(s.charAt(i)>='0'&& s.charAt(i)<='9')
		{
			sum=sum+(s.charAt(i)-48);
		}
	}
	System.out.println("The sum of number present in the String is :"+sum);
}
}

class ASCII{
	public static void main(String[] args) {
		for(int i=0;i<=150;i++)
		{
			char ch=(char) i;
			System.out.println("The ASCII vale of " +i+" is :"+ch);
		}
	}
}
	

