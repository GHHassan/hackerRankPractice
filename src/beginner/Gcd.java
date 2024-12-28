package beginner;

/*
     Calculate the GCD (Greatest Common Divisor)
    Write a function that calculates the GCD of two
    numbers using the Euclidean algorithm.

 */

public class Gcd {

    static int findGcd(int a, int b) {

        while( b!=0){
            int rem = a%b;
            a=b;
            b=rem;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(findGcd(15,30));
    }
}
