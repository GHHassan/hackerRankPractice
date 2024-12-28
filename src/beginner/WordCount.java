package beginner;
/*
    Write a function that takes a string as input and
    returns the number of words in the string.

    Example: Input: "This is a test", Output: 4.
 */
public class WordCount {

    public static int countWords(String str) {
        if (str.isEmpty()) return 0;
        str = str.trim();

        String[] strList = str.split("\\s+");
        return strList.length;
    }

    public static void main(String[] args) {
        String sentence = "this is   a test";
        System.out.println(countWords(sentence));
    }
}
