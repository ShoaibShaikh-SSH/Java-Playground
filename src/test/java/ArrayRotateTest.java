import ArrayPrograms.RotateAnArray;

public class ArrayRotateTest
{
    public static void main(String[]args)
    {
        RotateAnArray rotateArray = new RotateAnArray();
        int[] ArrayOne = new int[]{3, 8, 9, 7, 6};
        int[] ArrayTwo = rotateArray.solution(ArrayOne,2);
        int j=0;
        while (j<ArrayOne.length) {
            System.out.println(ArrayTwo[j]);
            j++;
        }
    }
}
