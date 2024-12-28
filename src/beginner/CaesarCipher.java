package beginner;


/*
    Caesar Cipher
    Write a program that implements a basic Caesar cipher.
    Shift each letter in a string by a given number of positions
    in the alphabet.

    Example: Input: "abc", Shift: 2, Output: "cde".
 */
public class CaesarCipher {

    public static String encrypt (String str, int shift) {

        if(str.isEmpty()) return "";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isAlphabetic(ch)){
                char base = Character.isUpperCase(ch)?'A':'a';
                char encrypted = (char) ((ch - base + shift) % 26 + base);
                result.append(encrypted);
            }else {
                result.append(ch);
            }
        }


        return result.toString();
    }

    public static void main(String[] args) {
        String str = "abcz";
        int charValueOfZ = 'A';
        System.out.println(charValueOfZ);
        System.out.println(encrypt(str, 3));
    }
}
