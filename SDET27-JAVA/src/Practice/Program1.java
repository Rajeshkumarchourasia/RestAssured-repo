package Practice;

public class Program1 {
	
public static void main(String[] args) {
	int [] arr1= {1,2,0,0,4,0,3};  //o/p {1,2,4,3,0,0,0}
	int [] arr2=new int [arr1.length];
	
	int m=0;
	int n=arr1.length-1;
	
	for(int i=0;i<arr1.length;i++)
	{
		if(arr1[i] ==0)
		{
			arr2[n]  =arr1[i];
			n--;
		}
		else {
			arr2[m] = arr1[i];
			m++;
		}
	}
	for(int i=0;i<arr2.length;i++)
		System.out.print(arr2[i]+" ");
}
}
