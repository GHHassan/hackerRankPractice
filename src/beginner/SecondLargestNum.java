package beginner;

import java.util.*;

/*
    Find the Second Largest Number
    Write a function that takes an array of integers and finds
     the second largest number.

    Example: Input: [1, 2, 3, 4], Output: 3.
 */
public class SecondLargestNum {

    public static int findSecondLargest(List<Integer> list) {
        Collections.sort(list);
        return list.get(list.size()-2);
    }

    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>(Arrays.asList(1,53,1,3,5,9,1,2,88
                ,3));
        System.out.println(findSecondLargest(list));
    }
}