package collections;

import java.util.ArrayList;

class Student
{
	int rollNo;
	String name;
}

public class List {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>(); 
		
		ArrayList list2 =new ArrayList();

		Student S1 = new Student();
		S1.rollNo=2062001;
		S1.name="Ajith";
		
		list1.add("Ajith");
		list1.add("26");
		list1.add("10");
		list1.add("19");
		list1.add("99");
		
		list2.add("San");
		list2.add("Mati");
		list2.add("14");
		list2.add("03");
		list2.add("02");
		
		System.out.println("list is: "+list1);
		System.out.println("list is: "+list2);
	}

}
