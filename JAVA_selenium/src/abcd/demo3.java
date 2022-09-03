package abcd;

import java.util.LinkedList;

public class demo3 {
	public static void main(String[] args) {
		LinkedList oo = new LinkedList();
		oo.add("dog");
		oo.add("cat");
		oo.add("rat");
		oo.add("camal");
		oo.add("horse");
		System.out.println(oo);// [dog, cat, rat, camal, horse]

		oo.addFirst("tiger");
		oo.addLast("elephant");
		System.out.println(oo);// [tiger, dog, cat, rat, camal, horse, elephant]

		System.out.println(oo.getFirst());// tiger
		System.out.println(oo.getLast());// elephant
		oo.removeFirst();
		oo.removeLast();
		System.out.println(oo);// [dog, cat, rat, camal, horse]

	}
}
