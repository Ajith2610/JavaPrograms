package array;

import java.util.Scanner;

public class Arrayuser {

	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner Sc=new Scanner(System.in);
		
		System.out.println("Enter the Element of Array:");
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the value of arr:["+i+"]");
			arr[i]=Sc.nextInt();
			}
		
			System.out.println("Content of Array:");
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the value of Arr:["+i+"]is:"+arr[i]);
		}
	}
}
