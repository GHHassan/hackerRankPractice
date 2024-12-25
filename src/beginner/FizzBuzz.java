package beginner;/*
    Write a program that prints the numbers from 1 to 100. But:

    For multiples of 3, print "Fizz" instead of the number.
    For multiples of 5, print "Buzz".
    For multiples of both 3 and 5, print "beginner.FizzBuzz".
 */

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    private List<Integer> list;

    public FizzBuzz(){
        this.list = this.generateList();
    }

    public List<Integer> generateList() {
        List<Integer> list = new ArrayList<>();
        for(int i = 1 ; i <= 100 ; i++){
            list.add(i);
        }
        return list;
    }

    public void printFizzBuzz(){
        for (Integer i : this.list){
            if(i % 3 == 0 && i % 5 ==0 ){
                System.out.println("beginner.FizzBuzz");
            }else if(i % 3 ==0) {
                System.out.println("Fizz");
            }else{
                System.out.println(i);
            }
        }
    }

}
