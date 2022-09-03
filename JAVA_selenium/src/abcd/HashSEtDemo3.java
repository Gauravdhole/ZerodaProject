package abcd;

import java.util.HashSet;

public class HashSEtDemo3 {
public static void main(String[] args) {
	
	HashSet<Integer> pp = new HashSet<Integer>();

	pp.add(2);
	pp.add(4);
	pp.add(6);
	pp.add(8);
	pp.add(10);
	
	
	System.out.println(pp);//[2, 4, 6, 8, 10]

	HashSet<Integer> opp = new HashSet<Integer>();
	
	opp.add(2);
	opp.add(4);
	opp.add(62);
	opp.add(28);
	opp.add(120);
	System.out.println(opp);
	//union
	pp.addAll(opp);
	System.out.println(pp);
	
	//inseration 
	opp.retainAll(pp);
	System.out.println(("Insersection"+opp));
	
	//differenyt
		opp.removeAll(pp);
		System.out.println(("different"+opp));
		//subset
		pp.contains(opp);
		System.out.println(pp);
		
	
	
	
}
}
