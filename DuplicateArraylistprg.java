package collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class DuplicateArraylistprg {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<String> l= new ArrayList<String>();
		l.add("Ajith");
		l.add("Butti");
		l.add("Gorzilla");
		l.add("Butti");
		l.add("Pandiyan");
		l.add("RiceBag");
		System.out.println("Before converting to set"+l.toString());
	    LinkedHashSet<String> s = new LinkedHashSet<String>(l); 
	    System.out.println("After Converting to set"+s);
		}

}
