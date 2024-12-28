package beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfOdds {
    public static int sumOdds(List<Integer>nums) {
        int total = 0;
        for (Integer num : nums) {
            if (num % 2 != 0) {
                total += num;
            }
        }
        return total;
    }

    public static void main(String[] args) {
//        sum odd numbers
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,5,3,5,2,6,34,6,7,4));
        System.out.println(sumOdds(nums));
    }
}
