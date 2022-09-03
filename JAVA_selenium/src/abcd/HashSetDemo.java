package abcd;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> pp = new HashSet<Integer>();

		pp.add(2);
		pp.add(4);
		pp.add(6);
		pp.add(8);
		pp.add(10);

		System.out.println(pp);// [2, 4, 6, 8, 10]
		HashSet<Integer> ppp = new HashSet<Integer>();

		ppp.addAll(pp);
		ppp.add(15);
		System.out.println(ppp);// [2, 4, 6, 8, 10, 15]

		// removedAll Method
		ppp.removeAll(pp);

		System.out.println(ppp);// [15]
 
        
	
	
	
	
	
	
	
	
	
	
	
	}
}
