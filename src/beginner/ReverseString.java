package beginner;

/*
Reverse a String
Write a function that takes a string as input and returns the string reversed.

Example: Input: "hello", Output: "olleh".
*/
public class ReverseString {

    public ReverseString(){}

    public String revers(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }
}
