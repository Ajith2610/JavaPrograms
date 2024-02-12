package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Sherlock {

	public static void main(String[] args) 
    {
       Scanner scan = new Scanner(System.in);
       int size = scan.nextInt();
       int [] arr = new int[size];
       for(int i=0;i<size;i++)
       {
           arr[i]=scan.nextInt();
       }
       int start=scan.nextInt();
       int end=scan.nextInt();
       
       int a=0;
       int [] array = new int[size];
       int maxdiff=-1;
       int mindiff=0;
       int maxValue=0;
       for (int i = start; i <=end; i++)
        {
           for(int j=0;j<arr.length;j++)
           {
               
               a = arr[j]-i; // a= 5-4 =1;  
               if(a<=0)   // This condition is false.
               {               // Not executed
                   a=a*-1;
               }
                   array[j]=a;    
           } 
           Arrays.sort(array);
           mindiff=array[0];
           if (mindiff > maxdiff) // condition is true.
            {
               maxdiff = mindiff;
               maxValue = i;
           }
           
       }
       System.out.println(maxValue);
   }
}
