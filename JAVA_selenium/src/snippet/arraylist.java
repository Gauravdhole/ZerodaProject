package snippet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist {
	public static void main(String[] args) {
		// different way to iterating an arraylist(java topic)
		// 5 to 6 way we can itreated print all value .
		ArrayList<String> tvSerie = new ArrayList<String>();
		tvSerie.add("game of thrones");
		tvSerie.add("Breaking Bad");
		tvSerie.add("The Big Bang Theory");
		tvSerie.add("The Walking Dead");
		tvSerie.add("prison break");
		// 1using java 8 with each loop and lambda expression
		tvSerie.forEach(Serie -> {
			System.out.println(Serie);

		});
		System.out.println("---------------------------------");
		// 2.usin iterator

		Iterator<String> it = tvSerie.iterator();
		while (it.hasNext()) {
			String show = it.next();
			System.out.println(show);
		}
		System.out.println("*****************************");
		// 3.using iterator java forEach loop () metrhod
		it = tvSerie.iterator();
		it.forEachRemaining(show -> {
			System.out.println(show);

		});
		System.out.println("______________________________");
		// 4 java forEach loop ()
		for (String show : tvSerie) {
			System.out.println(show);
		}
		System.out.println("_89988998899899_____________________________");
		// 5 loop () with order and index
             for(int i=0;i<tvSerie.size();i++) {
            	 System.out.println(tvSerie.get(i));
            	 
             }	System.out.println("______998895552________________________");
          // 6 using list itreator to travel in both dirction
                  ListIterator<String> tvseriesListItertor = tvSerie.listIterator(tvSerie.size());
                while (tvseriesListItertor.hasPrevious()) {
                	        String show = tvseriesListItertor.previous();
                	        System.out.println( show);
				}
	}
}
