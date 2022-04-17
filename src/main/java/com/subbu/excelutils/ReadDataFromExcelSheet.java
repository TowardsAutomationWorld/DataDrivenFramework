package com.subbu.excelutils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * @author - Subramanyam https://github.com/TowardsAutomationWorld
 */

public class ReadDataFromExcelSheet {

	private FileInputStream fis;
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	String dataSets[][] = null;

	public String[][] getExcelData(String excellocation, String sheetName) {
		try {
			fis = new FileInputStream(new File(excellocation));
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(sheetName);
			int totalRow = sheet.getLastRowNum();
			int totalColumn = sheet.getRow(0).getLastCellNum();
			dataSets = new String[totalRow][totalColumn];
			Iterator<Row> rowIterator = sheet.iterator();
			int i = 0;
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				int j = 0;
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					if (cell.getStringCellValue().contains("Title")) {
						break;
					}
					switch (cell.getCellType()) {
					case NUMERIC:
						dataSets[i - 1][j++] = cell.getStringCellValue();
						break;
					case STRING:
						dataSets[i - 1][j++] = cell.getStringCellValue();
						break;
					case BOOLEAN:
						dataSets[i - 1][j++] = cell.getStringCellValue();
						break;
					case FORMULA:
						dataSets[i - 1][j++] = cell.getStringCellValue();
						break;
					case BLANK:
						break;
					case ERROR:
						break;
					case _NONE:
						break;
					default:
						break;
					}
				}

				i++;
			}
			fis.close();
			return dataSets;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
