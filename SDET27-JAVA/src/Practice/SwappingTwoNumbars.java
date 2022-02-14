package Practice;

public class SwappingTwoNumbars {
public static void main(String[] args) {
	
	//not supposed to use the other variable
	
	int a=10;
	int b=20;      //a=20 ,b=10;
	
	a= a+b;       // a=20, b=10;
	b=a-b;       //a=30,b=20; a=30 b=10
	a=a-b;       //30-10=20 ,a=20 b=10
	
	System.out.println(a +" , "+b);
	
	
	//int temp=a;
	//a=b;
	//b=temp;
	
	//System.out.println(a+" , "+b);
	
}
}
