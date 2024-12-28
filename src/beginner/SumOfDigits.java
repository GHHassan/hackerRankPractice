package beginner;
/*
    Write a function that takes an integer and returns the sum of its digits.

    Example: Input: 123, Output: 1 + 2 + 3 = 6.
 */
public class SumOfDigits {

    public static int sumDigits(Long longNum) {
        int result= 0;

        while (longNum !=0) {
            result+=longNum%10;
            longNum/=10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(4562l));
    }
}
