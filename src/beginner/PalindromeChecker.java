package beginner;/*
    Write a function to check if a given string is a palindrome.
     A palindrome is a word that reads the same backward as forward,
      e.g., "madam" or "racecar".
 */

public class PalindromeChecker {

    public boolean check(String word){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = word.length()-1; i >= 0; i--) {
            stringBuilder.append(word.charAt(i));
        }
        return stringBuilder.toString().equals(word);
    }
}
