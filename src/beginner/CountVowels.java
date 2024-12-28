package beginner;

/*
    Write a function that takes a string as input
    and counts the number of vowels (a, e, i, o, u)
    in it.
 */
public class CountVowels {

    public static int count(String str) {
        String vowels = "aeiou";
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if(str.charAt(i) == vowels.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "asf;jiasdfsadfifelnies";
        System.out.println(count(str));
    }
}
