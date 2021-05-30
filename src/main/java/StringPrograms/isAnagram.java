package StringPrograms;

import java.util.Arrays;

public class isAnagram
{
    public static void main(String[]args)
    {
        String  textOne="Tenet";
        String textTwo="EENTp";

        char[]ArrayOne = textOne.toLowerCase().toCharArray();
        char[]ArrayTwo = textTwo.toLowerCase().toCharArray();


        Arrays.sort(ArrayOne);
        Arrays.sort(ArrayTwo);
//
//        for(char ch:ArrayOne){
//            System.out.println(ch);
//        }

        if(Arrays.equals(ArrayOne,ArrayTwo))
        {
            System.out.println("The two strings are anagram");
        }
        else
            System.out.println("The two strings are NOT anagram");

    }
}
