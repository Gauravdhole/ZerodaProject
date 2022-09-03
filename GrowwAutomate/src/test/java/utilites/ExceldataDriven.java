package utilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceldataDriven {
	public ArrayList<String> getData(String testcasename) throws IOException {

		ArrayList<String> a = new ArrayList<String>();

		FileInputStream gg = new FileInputStream(
				"C:\\Users\\gaura\\eclipse-workspace\\GrowwAutomate\\excelSheet\\GrowApp.xlsx");

		XSSFWorkbook work = new XSSFWorkbook(gg);

		int sheets = work.getNumberOfSheets();

		for (int i = 0; i < sheets; i++) {
			if (work.getSheetName(i).equalsIgnoreCase("Sheet1")) {
				XSSFSheet sheet = work.getSheetAt(i);

				Iterator<Row> rows = sheet.iterator();

				Row FirstRow = rows.next();
				Iterator<Cell> ce = FirstRow.cellIterator();
				int k = 0;
				int coloum = 0;
				while (ce.hasNext()) {
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("UserName")) {
						coloum = k;

					}
					k++;

				}
				System.out.println(coloum);

				while (rows.hasNext()) {

					Row r = rows.next();

					if (r.getCell(coloum).getStringCellValue().equalsIgnoreCase(testcasename)) {
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
							Cell c = cv.next();

							if (c.getCellType() == CellType.STRING) {
								a.add(c.getStringCellValue());

							} else {
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}

						}

					}

				}

			}

		}
		return a;
	}

	public static void main(String[] args) throws IOException {

	}
}
