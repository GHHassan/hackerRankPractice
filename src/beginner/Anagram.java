package beginner;

import java.util.Arrays;

/*
    Write a function that checks if two strings are
    anagrams of each other.
    An anagram is when two strings contain the same
    characters in the same frequencies but in a different order.

    Example: Input: "listen" and "silent", Output: true.
 */
public class Anagram {

    public static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) return false;
        char[] s1Array = str1.toCharArray();
        char[] s2Array = str2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        return Arrays.equals(s1Array, s2Array);
    }

    public static void main(String[] args) {
        String str1 = "blueu";
        String str2 = "bleue";
        System.out.println(isAnagram(str1, str2));
    }
}
