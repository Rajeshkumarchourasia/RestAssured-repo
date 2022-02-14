package Practice;

public class StringReversePattern {
public static void main(String[] args) {
	String s= "india";
	String rev="";
	
	for(int i=0;i<s.length();i++)
	{
		rev=rev+s.charAt(i);
		System.out.println(rev);
	}
}
}
