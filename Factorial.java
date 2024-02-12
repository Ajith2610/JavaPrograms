package programs;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int fact=n;
		while(n>1)
		{
			n--;
			fact=fact*n;
		}

		System.out.println("Factorial :" + fact);
	}

}
