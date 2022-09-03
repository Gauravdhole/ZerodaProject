package abcd;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class exampl {
	

	
	 
		//count the number of name starting with alphabet A in list
		@Test
		public void regular() {
			
			//first created list  aNd 
			
			ArrayList<String> names=new ArrayList<String>();
			names.add("Gaurav");	
			names.add("Giridhar");
			names.add("Gham");
			names.add("Ram");
			int count=0;
			
			for (int i = 0; i <names.size(); i++)
			{
				 String actual= names.get(i);
				 if (actual.startsWith("G"))
				 {
					count++;
				}
				 
			
			}
			System.out.println(count);
		} 
		  
		  
		  
		  
		  

	}

