package Practice;

public class ReverseTheStringInAnArray {

	public static void main(String[] args) {
		
		String str ="wellcome to TY"; // "emocllew ot YT"
		
		String []strArr =str.split(" ");//converting to String arry
		
		for(int i=0; i<strArr.length;i++)
		{
			String s= strArr[i];//assibning the first element og the array to a ref variable s=" wellcome";
			for(int j=s.length()-1;j>=0;j--)//iterarte over the String 
			{
				
			
				System.out.print(s.charAt(j));
		}
		System.out.print(" ");
	}
}
}
