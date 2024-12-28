package beginner;/*
    Write a function to check if a given string is a palindrome.
     A palindrome is a word that reads the same backward as forward,
      e.g., "madam" or "racecar".
 */

public class PalindromeChecker {

    public static boolean check(String word){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = word.length()-1; i >= 0; i--) {
            stringBuilder.append(word.charAt(i));
        }
        return stringBuilder.toString().equals(word);
    }

    public static void main(String[] args) {
        String str= "Palindrome";
        String str1 = "racecar";
        System.out.println(check(str));
        System.out.println(check(str1));
    }

}
