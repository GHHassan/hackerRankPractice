package beginner;

import java.util.List;

public class SumOfOdds {
    public int sumOdds(List<Integer>nums) {
        int total = 0;
        for (Integer num : nums) {
            if (num % 2 != 0) {
                total += num;
            }
        }
        return total;
    }
}
