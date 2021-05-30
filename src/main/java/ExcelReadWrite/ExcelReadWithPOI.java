package ExcelReadWrite;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelReadWithPOI
{
    public List<ExcelRowPOJO> getListOfRows() throws IOException
    {
        List<ExcelRowPOJO> rowList = new ArrayList<ExcelRowPOJO>();
        ExcelRowPOJO row = new ExcelRowPOJO();
        List<String> tempList;

        File file = new File("src/main/resources/Automation-Read-Demo.xlsx");
        FileInputStream inputStream = new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

        for(int i=1;i<=rowCount;i++) // Each Row
        {
            tempList = new ArrayList<String>();

            int cellCount = sheet.getRow(i).getLastCellNum();

            for(int j=0;j<cellCount;j++) // Each Cell
            {
                tempList.add(j,sheet.getRow(i).getCell(j).getStringCellValue());
            }
            row.setName(tempList.get(0));
            row.setGender(tempList.get(1));
            row.setProfession(tempList.get(2));
            row.setCountry(tempList.get(3));

            rowList.add(i-1,row); // Add each row to Row List
            row = new ExcelRowPOJO(); // Reset row class reference
        }

        return rowList;
    }
}
