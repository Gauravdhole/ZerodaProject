package utilise;

import java.io.IOException;
import java.util.ArrayList;

public class testsample {

	public static void main(String[] args) throws IOException {

		ExcelsheetFramework dd = new ExcelsheetFramework();

		ArrayList data = dd.getData("sham@5683");

		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		

	}
}
