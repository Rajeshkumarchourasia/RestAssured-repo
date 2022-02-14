package Practice;

public class MaxNumInArray {
public static void main(String[] args) {

	int []arr= {2,3,5,1,7,8};
	int temp,sum=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1; j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
	}
	System.out.println("Sorted array");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	System.out.println("Max Element :"+arr[arr.length-1]);
	System.out.println("MAX 3 Elements:");
	
	for(int i=arr.length-3;i<arr.length;i++)
	{

	System.out.println(arr[i]);
	sum+=arr[i];
		
	}
	System.out.println("Sum of max 3 Element:"+sum);
	
	
}
}

