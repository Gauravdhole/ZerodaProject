package abcd;

import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.commons.math3.analysis.function.Add;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class demo55 {
	public static void main(String[] args) {

		LinkedList kk = new LinkedList();
		kk.add(100);
		kk.add('A');
		kk.add(true);
		kk.add(15.5);
		kk.add(null);
		System.out.println(kk);
		System.out.println(kk.size());
//removed
		kk.remove(3);// index
		System.out.println("after removing element ::" + kk);
//kk.remove('A');   it is not possible;

//System.out.println("after removing element ::"+kk);
		// inseration / adding of moddle elementt
		kk.add(2, "java");
		System.out.println("after  adding element ::" + kk);
//retriving the object 
		System.out.println(kk.get(2));

//change the value 
		kk.set(1, "ppo");
		System.out.println("after  change the  element ::" + kk);
//contains
		System.out.println(kk.contains("java"));
		System.out.println(kk.contains("c#"));
//isEmpty
		System.out.println(kk.isEmpty());

		// read the elemet
		// forloop
		System.out.println("------------");

		for (int i = 0; i < kk.size(); i++) {
			System.out.println(kk.get(i));
		}

// forEachloop
		for (Object gaurav : kk) {
			System.out.println(gaurav);
		}

// iterator object
		java.util.Iterator it = kk.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}