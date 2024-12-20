import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class BetweenTwoSets {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */
    /*
        GCD by Euclide's Algorithm for two nums
        a / b = x r
        replace a with b and b with r
        until the r is zero
     */
    public static int findGCD(int a, int b) {
        while( b!= 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int getTotalX (List<Integer>a, List<Integer>b) {
        return 0;
    }

    public static void main (String[] args) {
        // Write your code here

    }

}
