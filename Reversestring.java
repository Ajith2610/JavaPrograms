package collections;

public class Reversestring {
	
	public static void main(String[]args)
	{
		String name="Ajith";
		
		//System.out.println("Orginal name:"+name);
		
		String rev="";
		int len = name.length();
		
		for(int i=0;i<len;i++)
		{
		rev = name.charAt(i)+rev;
		}
		System.out.println(rev);
	}

}
