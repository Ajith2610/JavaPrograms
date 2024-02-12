package programs;

public class oddnumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int I[]= {1,3,4,77,61,49,51};
		System.out.println("Enter the Number:");
		for(int i=0;i<I.length;i++)
		{
			if(I[i]%2!=0)
			{
			System.out.println("This is all odd number:"+I[i]);
			}
		}
	}

}
