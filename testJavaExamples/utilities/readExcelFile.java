package utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class readExcelFile {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream readFile = new FileInputStream("C:\\javalibforframeWork\\sampleExcel\\sampleTest.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(readFile);
            XSSFSheet worksheet = workbook.getSheet("SampleSheet"); //name of the worksheet in excel is SampleSheet

            Row row; //using the object from apache poi for row
            Cell cell; //using the object from apache poi for cell

            Iterator<Row> rowIterator = worksheet.rowIterator();// for iterating through the rows in excel
            while(rowIterator.hasNext()) {
                row = rowIterator.next();

            Iterator<Cell> cellIterator = row.cellIterator(); //for iterating through all the cells in the rows in excel
            while(cellIterator.hasNext()){
                cell = cellIterator.next();

                DataFormatter formatter = new DataFormatter(); /* DataFormatter obj within apachePoi is used for for casting
                all the cell values to string since the cell values can be integer, boolean, long, string different datatype.
                */
                String text = formatter.formatCellValue(cell);
                System.out.println(text);
            }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
