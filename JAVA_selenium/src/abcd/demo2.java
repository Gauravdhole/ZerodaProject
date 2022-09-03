package abcd;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class demo2 {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();

		ll.add("x");
		ll.add("y");
		ll.add("z");
		ll.add("q");
		ll.add("p");
		ll.add("y");

		LinkedList new_a = new LinkedList();
		new_a.addAll(ll);
		System.out.println(new_a);
		new_a.removeAll(ll);
		System.out.println(new_a);

		// sort();collection .sort();
		System.out.println(" befor sorting::" + ll);// befor sorting::[x, y, z, q, p, y]
		Collections.sort(ll);

		System.out.println(" after  sorting::" + ll);// after sorting::[p, q, x, y, y, z]

		// remopved order
		Collections.sort(ll, Collections.reverseOrder());
		System.out.println("reversces order " + ll); // reversces order [z, y, y, x, q, p]

		// shuffling
		Collections.shuffle(ll);
		System.out.println(ll);// [z, x, q, p, y, y]

	}
}
