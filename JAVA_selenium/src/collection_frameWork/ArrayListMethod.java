package collection_frameWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethod {
	public static void main(String[] args) {

		ArrayList<String> gau = new ArrayList<String>();

		gau.add("java");
		gau.add("python");
		gau.add("ruby");
		gau.add("php");

		ArrayList<String> oop = new ArrayList<String>();
		oop.add("testing");
		oop.add("dev ops");

////	gau.addAll(oop);
//	System.out.println(gau);
//	
//	gau.addAll(2, gau);
//	System.out.println(gau);
//	
//	gau.clear();
//	System.out.println(gau);

		ArrayList<String> cloneList = (ArrayList<String>) gau.clone();
		System.out.println(cloneList);

		System.out.println(gau.contains("ruby"));
		System.out.println(gau.contains("java"));

		System.out.println(gau.indexOf("ruby") > 0);

		ArrayList<String> ttgau = new ArrayList<String>(Arrays.asList("Gaurav ", "tom", "Gaurav", "lisa"));
		System.out.println(ttgau);
		int i = ttgau.lastIndexOf("Gaurav");
		System.out.println(i);

		ttgau.remove(1);
		System.out.println(ttgau);

		ttgau.remove("lisa");
		System.out.println(ttgau);

		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 3, 4, 5, 9, 57, 6, 5, 52, 40));
		number.removeIf(num -> num % 2 == 0);
		System.out.println(number);
		
		
		ArrayList<String> tnameList = new ArrayList<String>(Arrays.asList("Gaurav ", "tom", "Gaurav", "lisa"));
        System.out.println(tnameList);
        tnameList.retainAll(Collections.singleton("lisa"));
		System.out.println(tnameList);
		
		ArrayList<Integer>number1 = new ArrayList<Integer>(Arrays.asList(1,1,2,5,6,4,6,4));

		ArrayList<Integer> subList=new ArrayList<Integer> (number1.subList(2, 6));
		System.out.println( subList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
