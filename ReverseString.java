package stringconcepts;

public class ReverseString {

	public static void main(String[] args) {
		
		String name="AJITH";
		String n=" ";
		System.out.println("Before String Name:"+name);
		int len=name.length();
		for(int i=len-1;i>=0;i--)
		{
			n=n+name.charAt(i);
		}
		System.out.println("After String Name:"+n);
	}

}
