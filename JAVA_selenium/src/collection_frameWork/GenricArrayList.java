package collection_frameWork;

import java.util.ArrayList;

public class GenricArrayList {
public static void main(String[] args) {
	
	ArrayList<Integer>tt=new ArrayList<Integer>();
	tt.add(1000);
	System.out.println(tt);
	ArrayList<Double>td=new ArrayList<Double>();
	td.add(1000.25);
	System.out.println(td);
	ArrayList<String>ot=new ArrayList<String>();
	ot.add("gaurav");
	System.out.println(ot);
	
	System.out.println("*****************************************");
	
	ArrayList<String>ott=new ArrayList<String>();
	ott.add("aqwq");
	ott.add("plm");
	ott.add("rtfd");
	ott.add("okj");
	ott.stream().forEach(Ele->System.out.println(Ele));
	System.out.println("*****************************************");
	
	for (String s : ott) {
		System.out.println(s);
	}
	System.out.println("*****************************************");
	
	
}
}
