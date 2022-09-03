package abcd;

import java.util.HashSet;
import java.util.Iterator;

public class HasHSET_Deno1 {
public static void main(String[] args) {
	
	//HashSet hs= new HashSet();// default capacity is 16 loadfactor is 0.75
	//HashSet hSt= new HashSet(100);// inial capacity is 100
	//HashSet hps=new HashSet(100, (float),0.90);
	//HashSet<Integer> pp= new HashSet<Integer>();
	
	
	HashSet hs= new HashSet();
	// element in hashSet
	hs.add(100);
	hs.add('K');
	hs.add("null");
	hs.add(true);
	hs.add(16.5);
	System.out.println(hs);//[null, 16.5, 100, K, true] // inseration order is not presevered
	hs.remove(16.5);
	System.out.println("after removed the elemet::"+hs);//[null, 100, K, true]
	//contains
	System.out.println(hs.contains("null"));
	System.out.println(hs.contains(100));//true
	System.out.println(hs.isEmpty());
	//reading object 
	for(Object pp:hs)
	{
		System.out.println(pp);
	}
	Iterator it= hs.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
		
	}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
}
