package StringPrograms;

public class ReverseWordsInGivenString
{


    public static void main(String[]args)
    {
        String givenStatement = "Test is new"; // "new is Test"
        String reversedString = null;


        String[] partsofString = givenStatement.split("/s");
        partsofString = partsofString;
        System.out.println("Size:"+partsofString.length);
        String[] reversedStringArray = new String[3];
        int j=0;
        for(int i=partsofString.length;i>0;i--)
        {

            reversedStringArray[j]=partsofString[i];
            System.out.println(reversedStringArray[j]);
            j++;


        }


    }
}
