package collection_frameWork;

import java.util.ArrayList;

public class experices1 {

	public static void main(String[] args) {
		// default clASS
		// dynamic array

		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);
		ar.add(200);
		ar.add('A');
		ar.add(10.20);
		ar.add(true);
		System.out.println(ar);
		System.out.println(ar.get(2));
		//System.out.println(ar.get(-1));
		System.out.println(ar.size());
		System.out.println("Li"+0);
		System.out.println("hi"+(ar.size()-1));
		ar.add(609);

	}
}
