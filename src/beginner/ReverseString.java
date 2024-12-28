package beginner;

/*
Reverse a String
Write a function that takes a string as input and returns the string reversed.

Example: Input: "hello", Output: "olleh".
*/
public class ReverseString {

    public ReverseString(){}

    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String str = "reverse";
        String reversed = "book";

        System.out.println(reverse(str));
        System.out.println(reverse(reversed));
    }
}
