package programs;

import java.util.Scanner;

public class Interviewprg {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int total=sc.nextInt();
		int[] person= new int[total];
		int count=0;
		for(int i=0; i<total; i++)
		{
			person[i]=sc.nextInt();
		}
		int target=sc.nextInt();
			for(int i=0; i<person.length;i++)
			{
				if(i==target)
				{
					target= person[i-1];
				}
			}
			while(target>0)
			{
				for(int i=0;i<person.length;i++)
				{
					int value=person[i];
					if(value>0)		
					{
						count++;
						if(target==person[i])
						{
							target=target-1;
							if(target==1)
							{
								break;
								
							}
						}
						person[i]=person[i]-1;
					}
				}
		}
			System.out.println(count);
	}

}
