package programs;

public class Amstrong1
{
	public static void main (String[]args)
	{
		int n=153;
		 int arm=0;
		int rem=0;
		int num=n;
		while(n>0)
		{
			rem=n%10;
			arm=arm+(rem*rem*rem);
			n=n/10;
		}
		if(arm==num) {
			System.out.println( "Amstrong :"+num);
		}
		else
		{
			System.out.println("This not Amstrong :"+num);
		}
	}
}
