package programs;

import java.util.Scanner;

public class oddnumber1 {

	public static void main(String[] args) {
		int no;
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter the odd number:");
		no=sc.nextInt();
		if(no%2!=0)
		{
			System.out.println("this is odd number:");
		}
		else
		{
			System.out.println("This is not odd number:");
		}
	}

}
