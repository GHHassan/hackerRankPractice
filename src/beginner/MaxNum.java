package beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class MaxNum {
    public static int findMax(List<Integer> nums) {
        int max = 0;
        for (Integer num : nums) {
            if (num > max) max = num;
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(3,5,6,2,3,66,3));
        System.out.println(findMax(nums));
    }
}
