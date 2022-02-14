 package Practice;

public class ReverseStringWithOutLengthMethod {
	//reverse String with out length method but u can use length variable of array
public static void main(String[] args) {
	String s= "Rajesh";
	String rev=" ";
	char []sToArray= s.toCharArray();
	for(int i=sToArray.length-1;i>=0;i--)
	{
		rev= rev+sToArray[i];
	}
	System.out.println("Reverse String :"+rev);
}
}
