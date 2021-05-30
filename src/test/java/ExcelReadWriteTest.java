import ExcelReadWrite.ExcelReadWithPOI;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ExcelReadWriteTest
{
    //public static void main(String[]args) throws IOException
    @Test
    public void getPet() throws IOException
    {
        ExcelReadWithPOI collectedData = new ExcelReadWithPOI();
        int numberOfRows = collectedData.getListOfRows().size();
        int currentRowCount;

        for(int i=0; i<numberOfRows;i++)
        {
            currentRowCount = i+1;
            System.out.println("\nPrinting "+currentRowCount+"th row values. . . ");
            System.out.println("Name: "+collectedData.getListOfRows().get(i).getName());
            System.out.println("Gender: "+collectedData.getListOfRows().get(i).getGender());
            System.out.println("Profession: "+collectedData.getListOfRows().get(i).getProfession());
            System.out.println("Country: "+collectedData.getListOfRows().get(i).getCountry());
        }
    }
}
