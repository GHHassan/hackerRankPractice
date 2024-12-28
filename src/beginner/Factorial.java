package beginner;

/*
Write a function to calculate the factorial of a given number n.
 The factorial of a number is the product of all positive
  integers up to that number:
Example: factorial(5) = 5 * 4 * 3 * 2 * 1 = 120.

 */

public class Factorial {

    public static int calc(int num) {
        if(num <= 1) return 1;
        return num * (calc(num-1));
    }

    public static void main(String[] args) {
        System.out.println(calc(9));
    }
}
