package ArrayPrograms;

public class RotateAnArray
{
    public int [] solution(int[]ArrayInput,int numberOfTimesToRotate)
    {
        int [] rotatedArrayTemp = new int[ArrayInput.length];
        rotatedArrayTemp = ArrayInput;
        for(int i=0;i<numberOfTimesToRotate;i++)
        {
            rotatedArrayTemp =  rotate(rotatedArrayTemp);
        }
        return rotatedArrayTemp;
    }

    public int [] rotate(int[]ArrayInput)
    {
        int [] rotatedArray = new int[ArrayInput.length];

        rotatedArray[0]=ArrayInput[ArrayInput.length-1];
        for(int i=0;i<ArrayInput.length-1;i++)
        {
            rotatedArray[i+1]=ArrayInput[i];
        }
        return  rotatedArray;
    }
}
