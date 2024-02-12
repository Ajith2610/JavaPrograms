package array;

public class DuplicateCharacter {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number in array:");
		int [] arr= new int[] {1,2,2,3,4,5,3,5,6};
		System.out.println("Duplicate element in given array");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
	}

}
