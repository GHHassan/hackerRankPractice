package beginner;

import java.util.ArrayList;
import java.util.List;

/*
    Fibonacci Sequence
    Write a function to generate the first n numbers in the Fibonacci sequence.

    The sequence starts with 0, 1, and each subsequent number is
     the sum of the previous two

 */
public class Fibonacci {

    public static List<Integer> calcFib(int n) {
        List<Integer>result = new ArrayList<>();
        if(n ==0) return result;
        result.add(0);
        if(n == 1){
            return result;
        }
        result.add(1);

        for (int i = 2; i < n; i++) {
            result.add(result.get(i-1)+result.get(i-2));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calcFib(8));
    }
}
