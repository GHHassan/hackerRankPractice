package beginner;
/*
    Leap Year Checker
    Write a function to check if a given year is a leap year.

    A year is a leap year if it is divisible by 4 but
    not divisible by 100, except when it is divisible by 400.
 */
public class LeapYearChecker {
    static boolean isLeapYear(int year){
        if (year == 400) return true;
        return year%4==0 && year%100 !=0;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(2023));
        System.out.println(isLeapYear(2022));
    }
}
