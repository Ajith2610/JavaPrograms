package exceptionhandling;

public class trycatchprogram {
	
	public static void main(String[] args) {
		
		try
		{
			int number1=0;
			int number2=3;
			int total=number2/number1;
			System.out.println(total);
		}
		catch(Exception e)
		{
		
			System.out.println("This not a smallest number");
		}
	}
}
