package utilites;

import java.io.IOException;
import java.util.ArrayList;

public class excelsheet {

	
	public static void main(String[] args) throws IOException {
		ExcelSheetDriven ffh=new ExcelSheetDriven();
		ArrayList data = ffh.getData("rishi");

		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		
	}
}
