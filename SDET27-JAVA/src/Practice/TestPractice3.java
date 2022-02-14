package Practice;

import java.util.Scanner;

public class TestPractice3 {


public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Enter the value of x:");
	 int  x=sc.nextInt();
	 
	 if(x%5==0 && x%3==0)
	 {
		 System.out.println("hibye");
	 }
	 else if (x % 3 ==0)  
	 {
		 System.out.println("hi");
	 }
	 else if (x % 5 ==0)
	 {
		 System.out.println("bye");
	 }
	 else 
	 {
		 System.out.println("goodbye");
	 }
}
}
