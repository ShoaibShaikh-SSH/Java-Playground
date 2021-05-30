import Puzzles.BinaryGap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class BinaryGapTest
{
    BinaryGap binarySolution = new BinaryGap();
    @Test
    public void First() throws IOException
    {
        Assertions.assertEquals(2,binarySolution.solution(100));
    }
    @Test
    public void SecondTest() throws IOException
    {
        Assertions.assertEquals(2,binarySolution.solution(121));
    }
    @Test
    public void ThirdTest() throws IOException
    {
        Assertions.assertEquals(1,binarySolution.solution(111));
    }
    @Test
    public void FourthTest() throws IOException
    {
        Assertions.assertEquals(1,binarySolution.solution(23));
    }
    @Test
    public void FifthTest() throws IOException
    {
        Assertions.assertEquals(0,binarySolution.solution(00));
    }
    @Test
    public void SixthTest() throws IOException
    {
        Assertions.assertEquals(2,binarySolution.solution(89));
    }
    @Test
    public void largeIntegerTest() throws IOException
    {
        Assertions.assertEquals(4,binarySolution.solution(8929837));
    }
    @Test
    public void AllOnesTest() throws IOException
    {
        Assertions.assertEquals(0,binarySolution.solution(15));
    }
}
