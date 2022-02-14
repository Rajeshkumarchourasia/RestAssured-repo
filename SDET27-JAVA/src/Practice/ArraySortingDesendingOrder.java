package Practice;
//sort the given array in a descending order

public class ArraySortingDesendingOrder {
public static void main(String[] args) {
	
	int [] arr = { 4,6,7,18,37,15,};
	int temp;
	System.out.println("Original order");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Descending Order: ");
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+" ");
	}
}
}
