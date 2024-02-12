package stringconcepts;

public class StringMethods 

	{
	 	public static void main(String[] args) 
	 	{
		 
	 		String name="Ajith";
	 		int i=3;
	 		
	 		// 1. returns character value for particular time
	 		System.out.println(name.charAt(i));
	 		
	 		// 2. returns String length
	 		System.out.println(name.length());
	 		
	 		// 3. check the equality of string with the given object
	 		System.out.println(name.equals("Ajith"));
	 		
	 		// 4. check the equality of string with the given string without case sensitive
	 		System.out.println(name.equalsIgnoreCase("ajith"));
	 		
	 	/*	// 5. check if string is empty or not
	 		System.out.println(name.isEmpty());
	 		
	 		*/ 
	 		
	 		// 6.  returns true or false based on the given value is present or not
	 		System.out.println(name.contains("A"));
	 		
	 // 7. take particular portion of the string
	 		System.out.println(name.substring(1));
	 		
	 		// 8. take particular portion of the string begin and end index
	 		System.out.println(name.substring(1,5));
	 		
	 		// 9. Appends the string to the given string
	 		System.out.println(name.concat(" Periyasamy"));
	 		
	 		// 10. Replaces the existing char with given char
	 		System.out.println(name.replace('A', 'a'));
	 		System.out.println(name.replace("Ajith", "aji"));
	 		
	 		// 11. Find the position of a character in the string
	 		System.out.println(name.indexOf("A"));
	 		
	 		// 12. Find the character specified from the index position
	 		System.out.println(name.indexOf("i",2));
		}

}
