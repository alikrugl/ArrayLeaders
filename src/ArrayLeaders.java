import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;

public class ArrayLeaders
{
    @Test
    public void Check_Positive_Values()
    {
        assertEquals(Arrays.asList(4), Solution.arrayLeaders(new int[]{1,2,3,4,0}));
        assertEquals(Arrays.asList(17,5,2), Solution.arrayLeaders(new int[]{16,17,4,3,5,2}));
    }
    @Test
    public void Check_Negative_Values()
    {
        assertEquals(Arrays.asList(-1), Solution.arrayLeaders(new int[]{-1,-29,-26,-2}));
        assertEquals(Arrays.asList(-36,-12), Solution.arrayLeaders(new int[]{-36,-12,-27}));
    }
    @Test
    public void Mixed_Values()
    {
        assertEquals(Arrays.asList(5,2), Solution.arrayLeaders(new int[]{5,2}));
        assertEquals(Arrays.asList(0,-1,3,2), Solution.arrayLeaders(new int[]{0,-1,-29,3,2}));
    }
    @Test
    public void Random_Tests()
    {
        for (int i = 0; i < 100; i++)
        {
            int[] a = new int[(int)(Math.random() * 200) + 3];
            Arrays.setAll(a, j -> (int)(Math.random() * 201) - 100);
            assertEquals(solution(a), Solution.arrayLeaders(a));
        }
    }
    private static List solution(int[] numbers)
    {
        ArrayList<Integer> leaders = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++)
        {
            int sum = 0;
            for (int j = i+1; j < numbers.length; j++)
                sum += numbers[j];
            if ( numbers[i] > sum )
                leaders.add(numbers[i]);
        }
        return leaders;
    }
}