package abcd;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.commons.math3.analysis.function.Add;

public class ArrayListDemo1 {
 public static void main(String[] args) {
//	  ArrayList al = new ArrayList();
//	 ArrayList<Integer>   De1 = new  ArrayList<Integer> ();
//	 ArrayList<String> al=new ArrayList<String>();
//	 
//	 List al=new ArrayList();
	 ArrayList al = new ArrayList();
	//  Add new element to the array list
	 al.add(100);
	 al.add("a");
	 al.add(15.1);
	 al.add(true);
	 System.out.println(al); //[100, a, 15.1, true]
	 
	 //size();
	 System.out.println( " number of element present in arraylist:::"+al.size());
	 
	 //remove
      al.remove(1);  // here 1 is index
	// al.remove("a");
	 
      System.out.println( "  after removed the element present in arraylist:::"+al);
	 //insert a new element
      //add(index, object);
      al.add(1, "python");
	 System.out.println(" after insertion ::" +al);//[100, python, 15.1, true]
	 
	 // retive specific element
	 al.get(1);
	 System.out.println(" retive specific element:::"+ al.get(1));
	 // change element replace
	 al.set(3, "c#");
	System.out.println(" after replace elelmet "+al); //[100, python, 15.1, c#]
	 
	 // search -- contain();
	
	System.out.println(al.contains("#c"));
	//isEmpty
	System.out.println(al.isEmpty());
	
	//1) forloop
	
	for (int i = 0; i < al.size(); i++) {
		    System.out.println(   al.get(i));
	}
	System.out.println("_________________");
	//2)forEach
	for (Object oops: al) {
		System.out.println(oops);
	}
	
	
	
	// 3)iterator
	
	java.util.Iterator it= al.iterator();
	while (it.hasNext()) {
	System.out.pgghjrintln(it.hasNext());
		
	}
	
	
	
	
	
	
	
	
	
	
	 
	 
}
}
