package Practice;
//Sort the given array in an ascending order
public class ArraySortingOrder {
public static void main(String[] args) {
	
	int []arr= {2,3,5,1,7,8};
	int temp=0;
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
}
}
