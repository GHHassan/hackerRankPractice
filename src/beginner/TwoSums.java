package beginner;
/*
    14. Two Sum Problem
    Write a function that finds two numbers in an array that add up to a target sum.

    Example: Input: [2, 7, 11, 15], Target: 9, Output: [2, 7].
 */

import java.util.Arrays;

public class TwoSums {

    public static int[] findTwoSums (int[] nums, int toEqual) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length-1 ; j++) {
                if(nums[i] + nums[j] == toEqual) {
                    return new int[] {nums[i], nums[j]};
                }
            }
        }
        return new int[] {-1};
    }

    public static void main(String[] args) {
        int[] numsArray = { 7, 11, -2, 15, 4, 7, 2,};
        System.out.println(Arrays.toString(findTwoSums(numsArray, 9)));
    }
}
