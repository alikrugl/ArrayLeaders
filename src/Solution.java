import java.util.*;

public class Solution {

    /**
     * Given an array/list [] of integers. Find all the LEADERS in the array.
     * <p>
     * Notes:
     * - Array/list size is at least 3 .
     * - Array/list's numbers Will be mixture of positives , negatives and zeros
     * - Repetition of numbers in the array/list could occur.
     * - Returned Array/list should store the leading numbers in the same order in the original array/list .
     */
    public static List<Integer> arrayLeaders(int[] n) {
        List<Integer> result = new ArrayList<>();
        for (int i = n.length - 1, sum = 0; i >= 0; i--) {
            if (n[i] > sum)
                result.add(0, n[i]);

            sum += n[i];
        }
        return result;
    }

}