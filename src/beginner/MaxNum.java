package beginner;

import java.util.List;

public class MaxNum {
    public int findMax(List<Integer> nums) {
        int max = 0;
        for (Integer num : nums) {
            if (num > max) max = num;
        }
        return max;
    }
}
