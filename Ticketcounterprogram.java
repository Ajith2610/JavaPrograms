package programs;

public class Ticketcounterprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,4,3,5,1,6,7,2,5,3};
		int n = arr.length;
	
		int target = 6, A = target-1;
		int temp=0;
		int seconds=0;
		while(n>0)
		{
			temp = arr[0]-1;
			for(int i=0;i<n-1;i++)
			{
				arr[i] = arr[i+1];
			}
			arr[n-1] = temp;
		    
			if(A==0)
			{
				A=n-1;
			}
			
			seconds++;
			if(arr[A] == 0)
			{
				break;
		}
			if(arr[n-1] == 0)
			{	
				n--;
			}
		}
		System.out.println("The 5th index seconds:"  +seconds);
	}

}
