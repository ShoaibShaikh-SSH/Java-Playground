package Puzzles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryGap
{
    public int solution(int N)
    {
        int binaryGap=0;
        if(N==0)
            return binaryGap;
        String numberInBinary = convertToBinaryString(N);
        char[] characterArray = new char[numberInBinary.length()];
        for(int i=0;i<numberInBinary.length();i++)
        {
            characterArray[i]=numberInBinary.charAt(i);
        }
        int arrayStartingIndex = 0;

        int lengthOfArray = numberInBinary.length();
        List<Integer> binaryGaps;
        binaryGaps = new ArrayList<>();
        while(arrayStartingIndex<lengthOfArray)
        {
            if(characterArray[arrayStartingIndex]=='1')
            {
                if(binaryGap==0)
                {
                    if(arrayStartingIndex==lengthOfArray-1)
                    {
                        binaryGaps.add(0);
                        Collections.sort(binaryGaps);
                        int index = binaryGaps.size()-1;
                        binaryGap = binaryGaps.get(index);
                        return binaryGap;
                    }
                    else {
                        if (characterArray[arrayStartingIndex + 1] == '0')
                        {
                            binaryGap = binaryGap + 1;
                            arrayStartingIndex++;
                            arrayStartingIndex++;
                        }
                        else
                            arrayStartingIndex = arrayStartingIndex + 1;
                    }
                }
                else
                {
                    binaryGaps.add(binaryGap);
                    binaryGap = 0;
                    arrayStartingIndex++;
                }

            }
            else if(arrayStartingIndex==0)
            {
                return  binaryGap;
            }
            else
            {
                binaryGap=binaryGap+1;
                arrayStartingIndex++;
            }
        }

        Collections.sort(binaryGaps);
        int index = binaryGaps.size()-1;
        binaryGap = binaryGaps.get(index);
        return binaryGap;
    }

    public String convertToBinaryString(int number)
    {
        int numberToBeConvertedToBinary = number;
        String numberInStringFormat="";
        while(numberToBeConvertedToBinary>0)
        {
            int placeHolder = numberToBeConvertedToBinary%2;
            numberInStringFormat = numberInStringFormat+placeHolder;
            numberToBeConvertedToBinary=numberToBeConvertedToBinary/2;
        }
        int i=0;
        while(i<numberInStringFormat.length())
        {
            if(numberInStringFormat.charAt(0)=='0')
            {
                numberInStringFormat= numberInStringFormat.substring(1);
                i++;
            }
            else
                return numberInStringFormat;
        }
        return numberInStringFormat;
    }

    public static void main(String[]args)
    {
        int inputNum = 151;
        BinaryGap sol = new BinaryGap();
        int binaryGap = sol.solution(inputNum);

        System.out.println("Binary is : "+sol.convertToBinaryString(inputNum));
        System.out.println("Gap is :"+binaryGap);
    }
}