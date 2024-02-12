package programs;

import java.util.Scanner;

public class oddnumber3 {

	public static void main(String[] args) {
		Scanner aji= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=aji.nextInt();
		if(n%2==0) 
		{
			System.out.println("Even Number:"+n);
		}
		else
		{
			System.out.println("odd number:"+n);
		}
		
	}
}
